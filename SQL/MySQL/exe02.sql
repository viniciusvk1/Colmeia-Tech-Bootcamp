CREATE DATABASE ecommerce;

USE ecommerce;

CREATE TABLE tb_produtos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    descricao VARCHAR(255),
    preco DECIMAL(10,2),
    estoque INT,
    categoria VARCHAR(50)
);

INSERT INTO tb_produtos (nome, descricao, preco, estoque, categoria)
VALUES
('Produto 1', 'Descricao do Produto 1', 599.99, 10, 'Categoria 1'),
('Produto 2', 'Descricao do Produto 2', 299.99, 5, 'Categoria 2'),
('Produto 3', 'Descricao do Produto 3', 799.99, 8, 'Categoria 1'),
('Produto 4', 'Descricao do Produto 4', 199.99, 15, 'Categoria 2'),
('Produto 5', 'Descricao do Produto 5', 899.99, 3, 'Categoria 1'),
('Produto 6', 'Descricao do Produto 6', 399.99, 20, 'Categoria 2'),
('Produto 7', 'Descricao do Produto 7', 699.99, 12, 'Categoria 1'),
('Produto 8', 'Descricao do Produto 8', 5999.99, 7, 'Categoria 2');

SELECT *
FROM tb_produtos
WHERE preco > 500;

SELECT *
FROM tb_produtos
WHERE preco < 500;

UPDATE tb_produtos
SET estoque = 25
WHERE id = 1;