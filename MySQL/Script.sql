-- Criação do banco de dados
CREATE DATABASE RH;

-- Utilização do banco de dados
USE RH;

-- Criação da tabela de colaboradores
CREATE TABLE Colaboradores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    cargo VARCHAR(50),
    idade INT,
    salario DECIMAL(10,2),
    data_contratacao DATE
);

-- Inserção de dados na tabela
INSERT INTO Colaboradores (nome, cargo, idade, salario, data_contratacao)
VALUES ('João Silva', 'Analista', 30, 2500.00, '2020-01-15'),
       ('Maria Santos', 'Assistente', 25, 1800.00, '2021-03-10'),
       ('Pedro Almeida', 'Gerente', 35, 3500.00, '2019-05-22'),
       ('Ana Oliveira', 'Analista', 28, 2200.00, '2018-09-01'),
       ('Carlos Costa', 'Estagiário', 22, 1500.00, '2022-02-18');

-- SELECT dos colaboradores com salário maior que 2000
SELECT * FROM Colaboradores WHERE salario > 2000;

-- SELECT dos colaboradores com salário menor que 2000
SELECT * FROM Colaboradores WHERE salario < 2000;

-- Atualização de um registro na tabela
UPDATE Colaboradores SET cargo = 'Analista Sênior' WHERE id = 3;
