CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(100)
);

CREATE TABLE tb_personagens(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    poder_ataque INT,
    poder_defesa INT,
    id_classe INT,
	FOREIGN KEY (id_classe) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes (nome, descricao)
VALUES
('Guerreiro', 'Personagem especializado em combate corpo a corpo.'),
('Mago', 'Personagem especializado em magias e habilidades magicas.'),
('Arqueiro', 'Personagem especializado em combate a distancia.');

SELECT *
FROM tb_classes;

INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, id_classe)
VALUES
('Personagem 1', 2500, 1800, 1),
('Personagem 2', 1800, 2100, 2),
('Personagem 3', 3500, 1500, 1),
('Personagem 4', 2200, 2300, 2),
('Personagem 5', 1900, 1200, 3),
('Personagem 6', 2800, 2500, 1),
('Personagem 7', 2400, 1900, 2),
('Personagem 8', 2100, 1800, 3);

SELECT *
FROM tb_personagens;

-- SELECT para retornar todos os personagens com poder de ataque maior que 2000

SELECT *
FROM tb_personagens
WHERE poder_defesa BETWEEN 1000 AND 2000;

-- SELECT utilizando o operador LIKE para buscar personagens com a letra 'C' no nome

SELECT *
FROM tb_personagens
WHERE nome LIKE '%C%';

-- SELECT utilizando INNER JOIN para unir os dados das tabelas tb_personagens e tb_classes

SELECT p.*, c.nome AS classe_nome
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id; 

-- SELECT utilizando INNER JOIN para unir os dados das tabelas tb_personagens e tb_classes,
-- filtrando apenas os personagens da classe especificada (no exemplo, arqueiros)

SELECT p.*, c.nome AS classe_nome
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id
WHERE c.nome = 'Arqueiro';



