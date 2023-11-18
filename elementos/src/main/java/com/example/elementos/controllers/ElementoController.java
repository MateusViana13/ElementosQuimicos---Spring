package com.example.elementos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.elementos.models.ElementoQuimico;
import com.example.elementos.repository.ElementoQuimicoRepository;

@RestController
@RequestMapping("/api/elementos")
public class ElementoController {
    private final ElementoQuimicoRepository elementoQuimicoRepository;

    public ElementoController(ElementoQuimicoRepository elementoQuimicoRepository) {
        this.elementoQuimicoRepository = elementoQuimicoRepository;
    }

    @GetMapping
    public ResponseEntity<List<ElementoQuimico>> listarElementosQuimicos() {
        try {
            List<ElementoQuimico> elementos = elementoQuimicoRepository.findAll();
            return ResponseEntity.ok(elementos);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ElementoQuimico> buscarElementoQuimicoPorId(@PathVariable int id) {
        try {
            Optional<ElementoQuimico> elementoOptional = elementoQuimicoRepository.findById(id);
            return elementoOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<ElementoQuimico> criarElementoQuimico(@RequestBody ElementoQuimico novoElemento) {
        try {
            ElementoQuimico elementoCriado = elementoQuimicoRepository.save(novoElemento);
            return ResponseEntity.status(HttpStatus.CREATED).body(elementoCriado);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ElementoQuimico> atualizarElementoQuimico(@PathVariable int id, @RequestBody ElementoQuimico elementoAtualizado) {
        try {
            Optional<ElementoQuimico> elementoOptional = elementoQuimicoRepository.findById(id);
            if (elementoOptional.isPresent()) {
                ElementoQuimico elementoExistente = elementoOptional.get();
                elementoExistente.setSimbolo(elementoAtualizado.getSimbolo());
                elementoExistente.setNome(elementoAtualizado.getNome());
                elementoExistente.setNumeroAtomico(elementoAtualizado.getNumeroAtomico());
                elementoExistente.setMassaAtomica(elementoAtualizado.getMassaAtomica());
                elementoExistente.setGrupo(elementoAtualizado.getGrupo());
                elementoExistente.setPeriodo(elementoAtualizado.getPeriodo());

                ElementoQuimico elementoAtualizadoDb = elementoQuimicoRepository.save(elementoExistente);
                return ResponseEntity.ok(elementoAtualizadoDb);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarElementoQuimico(@PathVariable int id) {
        try {
            if (elementoQuimicoRepository.existsById(id)) {
                elementoQuimicoRepository.deleteById(id);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
