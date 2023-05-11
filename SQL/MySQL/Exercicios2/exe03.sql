CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

-- Criação das tabelas
CREATE TABLE tb_categorias (
  id_categoria INT PRIMARY KEY,
  nome_categoria VARCHAR(50),
  descricao_categoria VARCHAR(100)
);

CREATE TABLE tb_produtos (
  id_produto INT PRIMARY KEY,
  nome_produto VARCHAR(50),
  preco DECIMAL(10, 2),
  descricao VARCHAR(100),
  id_categoria INT,
  FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

-- Inserção de registros na tabela tb_categorias
INSERT INTO tb_categorias (id_categoria, nome_categoria, descricao_categoria) VALUES
  (1, 'Medicamentos', 'Produtos medicamentosos'),
  (2, 'Higiene', 'Produtos de higiene pessoal'),
  (3, 'Cosméticos', 'Produtos cosméticos');

-- Inserção de registros na tabela tb_produtos
INSERT INTO tb_produtos (id_produto, nome_produto, preco, descricao, id_categoria) VALUES
  (1, 'Paracetamol', 10.00, 'Analgésico e antitérmico', 1),
  (2, 'Sabonete Líquido', 5.00, 'Limpeza suave para o corpo', 2),
  (3, 'Creme Hidratante', 20.00, 'Hidratação intensa para a pele', 3),
  (4, 'Dipirona', 8.00, 'Analgésico e antitérmico', 1),
  (5, 'Shampoo', 15.00, 'Limpeza e cuidado para o cabelo', 2),
  (6, 'Protetor Solar', 30.00, 'Proteção contra os raios solares', 3),
  (7, 'Vitamina C', 12.00, 'Suplemento vitamínico', 1),
  (8, 'Desodorante', 7.00, 'Proteção contra odores e transpiração', 2);

-- SELECT que retorna todos os produtos cujo valor seja maior do que R$ 50,00
SELECT * FROM tb_produtos WHERE preco > 50.00;

-- SELECT que retorna todos os produtos cujo valor esteja no intervalo R$ 5,00 e R$ 60,00
SELECT * FROM tb_produtos WHERE preco BETWEEN 5.00 AND 60.00;

-- SELECT utilizando o operador LIKE, buscando todos os produtos que possuam a letra C no atributo nome
SELECT * FROM tb_produtos WHERE nome_produto LIKE '%C%';

-- SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias
SELECT tb_produtos.*, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria;

-- SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias,
-- onde traga apenas os produtos que pertençam a uma categoria específica (Exemplo: Todos os produtos que pertencem a categoria cosméticos)
SELECT tb_produtos.*, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Cosméticos';
