CREATE DATABASE alineraldi_cenaflix_podcasts;
USE alineraldi_cenaflix_podcasts;

CREATE TABLE usuario (
	id int PRIMARY KEY AUTO_INCREMENT,
	nome varchar(30),
	login varchar(100),
	senha text,
	tipo varchar(30)
);

CREATE TABLE podcast (
	id int PRIMARY KEY AUTO_INCREMENT,
	produtor varchar(50),
	nome varchar(30),
	numero int,
	duracao varchar(11),
    url varchar(150)
);


INSERT INTO usuario (nome, login, senha, tipo) VALUES 
	('Luyza', 'luyza@email.com', md5('senhaadmin123'), 'Admin'),
	('Victoria', 'victoria@email.com', md5('senhaoperador123'), 'Operador'),
	('Marina', 'marina@email.com', md5('senhausuario123'), 'Usuario'); 
    
INSERT INTO podcast (produtor, nome, numero, duracao, url) VALUES
	('Mariana Torres', 'Cinema em Cena', 1, '00:50:00', 'https://example.com/cinema-em-cena/ep1'),
	('Mariana Torres', 'Cinema em Cena', 2, '00:55:00', 'https://example.com/cinema-em-cena/ep2'),
	('Luana Almeida', 'TelonaCast', 1, '01:10:00', 'https://example.com/telonacast/ep1'),
	('Luana Almeida', 'TelonaCast', 2, '00:47:30', 'https://example.com/telonacast/ep2'),
	('Fernanda Costa', 'Direção Feminina', 1, '00:40:00', 'https://example.com/direcao-feminina/ep1'),
	('Fernanda Costa', 'Direção Feminina', 2, '00:45:15', 'https://example.com/direcao-feminina/ep2'),
	('Bruna Rocha', 'Cinema em Debate', 1, '01:05:00', 'https://example.com/cinema-debate/ep1'),
	('Carlos Mendes', 'Na Sala de Exibição', 1, '00:48:00', 'https://example.com/sala-exibicao/ep1');

SELECT * FROM podcast;