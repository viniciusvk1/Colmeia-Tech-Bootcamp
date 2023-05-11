CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;
-- Criação da tabela tb_categorias
CREATE TABLE tb_categorias (
  id INT PRIMARY KEY,
  nome VARCHAR(50),
  descricao VARCHAR(255)
);

-- Inserção de registros na tabela tb_categorias
INSERT INTO tb_categorias (id, nome, descricao) VALUES
  (1, 'Carnes Bovinas', 'Cortes de carne bovina'),
  (2, 'Carnes Suínas', 'Cortes de carne suína'),
  (3, 'Aves', 'Cortes de frango e outras aves'),
  (4, 'Peixes', 'Peixes frescos e frutos do mar'),
  (5, 'Frutas', 'Diversas frutas frescas');

-- Criação da tabela tb_produtos
CREATE TABLE tb_produtos (
  id INT PRIMARY KEY,
  nome VARCHAR(100),
  preco DECIMAL(10, 2),
  estoque INT,
  categoria_id INT,
  FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

-- Inserção de registros na tabela tb_produtos
INSERT INTO tb_produtos (id, nome, preco, estoque, categoria_id) VALUES
  (1, 'Picanha', 79.90, 10, 1),
  (2, 'Filé Mignon', 99.90, 8, 1),
  (3, 'Costelinha de Porco', 49.90, 15, 2),
  (4, 'Linguiça Toscana', 29.90, 20, 2),
  (5, 'Peito de Frango', 29.90, 12, 3),
  (6, 'Salmão Fresco', 89.90, 5, 4),
  (7, 'Camarão Rosa', 69.90, 8, 4),
  (8, 'Maçã', 2.99, 50, 5);

-- SELECT que retorna todos os produtos cujo valor seja maior do que R$ 50,00
SELECT * FROM tb_produtos WHERE preco > 50.00;

-- SELECT que retorna todos os produtos cujo valor esteja no intervalo R$ 50,00 e R$ 150,00
SELECT * FROM tb_produtos WHERE preco BETWEEN 50.00 AND 150.00;

-- SELECT utilizando o operador LIKE, buscando todos os produtos que possuam a letra C no atributo nome
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

-- SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias
SELECT p.*, c.nome AS categoria FROM tb_produtos p INNER JOIN tb_categorias c ON p.categoria_id = c.id;

SELECT p.*, c.nome AS categoria
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.categoria_id = c.id
WHERE c.nome IN ('Aves', 'Frutas');
