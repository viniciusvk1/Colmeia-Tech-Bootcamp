CREATE DATABASE escola;

USE escola;

CREATE TABLE tb_estudantes(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    idade INT,
    curso VARCHAR(50),
    nota DECIMAL(3,1),
    endereco VARCHAR(255)
);

INSERT INTO tb_estudantes (nome, idade, curso, nota, endereco)
VALUES
('Joao Silva', 18, 'Engenharia', 8.5, 'Rua A, 123'),
('Maria Santos', 20, 'Administracao', 6.7, 'Av. B, 456'),
('Pedro Almeida', 19, 'Direito', 7.9, 'Rua C, 789'),
('Ana Pereira', 21, 'Medicina', 9.2, 'Av. D, 987'),
('Carlos Oliveira', 18, 'Engenharia', 6.1, 'Rua E, 654'),
('Lucia Rodrigues', 20, 'Administracao', 8.3, 'Av. F, 321'),
('Rafael Nunes', 19, 'Direito', 7.4, 'Rua G, 789'),
('Juliana Costa', 21, 'Medicina', 8.9, 'Av. H, 654');

SELECT *
FROM tb_estudantes
WHERE nota > 7.0;

SELECT *
FROM tb_estudantes
WHERE nota < 7.0;

UPDATE tb_estudantes
SET endereco = 'Av. I, 987'
WHERE id = 1;