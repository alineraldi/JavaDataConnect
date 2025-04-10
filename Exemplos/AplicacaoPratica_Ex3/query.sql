CREATE DATABASE exemplo3;
USE exemplo3;
CREATE TABLE empresa (
id INT(11) NOT NULL AUTO_INCREMENT,
nomeempresa VARCHAR(50) NOT NULL,
areaatuacao VARCHAR(50) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE funcionario (
	id INT(11) NOT NULL AUTO_INCREMENT,
    nomefunc VARCHAR(100),
    empresaid INT(11) NOT NULL,
PRIMARY KEY(id)
);

ALTER TABLE funcionario ADD CONSTRAINT fk_empresa FOREIGN KEY (empresaid) REFERENCES empresa(id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE funcionario ADD admissao date;

SELECT * FROM funcionario;