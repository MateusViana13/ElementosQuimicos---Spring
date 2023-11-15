package com.example.elementosquimicos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.ElementoQuimico;

@RestController
@RequestMapping("/api/elementos")
public class ElementosQuimicosController {

    //@RequestMapping("/listar") //localhost:8080/api/elementos/listar
    //@ResponseBody
    //@GetMapping("/listar") //localhost:8080/api/elementos/listar
    //@PostMapping("/listar") //localhost:8080/api/elementos/listar
    //@PutMapping("/listar") //localhost:8080/api/elementos/listar
    //@DeleteMapping("/listar") //localhost:8080/api/elementos/listar
    //@PatchMapping("/listar") //localhost:8080/api/elementos/listar
    //@RequestMapping(value = "/listar", method = RequestMethod.GET) //localhost:8080/api/elementos/listar
    //@RequestMapping(value = "/listar", method = RequestMethod.POST) //localhost:8080/api/elementos/listar
    //@RequestMapping(value = "/listar", method = RequestMethod.PUT) //localhost:8080/api/elementos/listar
    //@RequestMapping(value = "/listar", method = RequestMethod.DELETE) //localhost:8080/api/elementos/listar
    //
    @GetMapping("/listar")
    public ResponseEntity<List<ElementoQuimico>> listar(){
        List<ElementoQuimico> elementoQuimicos = new ArrayList<ElementoQuimico>();
        return ResponseEntity.ok(elementoQuimicos);
    }
}