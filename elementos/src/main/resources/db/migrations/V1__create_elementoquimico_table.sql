-- V1__create_elementoquimico_table.sql

CREATE TABLE elementoquimico (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    simbolo VARCHAR(10) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    numeroAtomico INT NOT NULL,
    massaAtomica DOUBLE NOT NULL,
    grupo VARCHAR(50),
    periodo VARCHAR(50)
);
