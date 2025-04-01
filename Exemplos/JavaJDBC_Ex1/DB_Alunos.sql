CREATE DATABASE escola;

USE escola;
CREATE TABLE alunos (
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(70) NOT NULL,
    idade INT,
    endereco VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

SELECT * FROM alunos;