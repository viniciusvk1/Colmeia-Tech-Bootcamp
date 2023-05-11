CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

-- Criação das tabelas
CREATE TABLE tb_categorias (
  id_categoria INT PRIMARY KEY,
  nome_categoria VARCHAR(50),
  descricao_categoria VARCHAR(100)
);

CREATE TABLE tb_pizzas (
  id_pizza INT PRIMARY KEY,
  nome_pizza VARCHAR(50),
  preco DECIMAL(10, 2),
  ingredientes VARCHAR(100),
  id_categoria INT,
  FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

-- Inserção de registros na tabela tb_categorias

INSERT INTO tb_categorias (id_categoria, nome_categoria, descricao_categoria) VALUES
  (1, 'Salgada', 'Pizzas com sabores salgados'),
  (2, 'Doce', 'Pizzas com sabores doces'),
  (3, 'Vegetariana', 'Pizzas sem carne');

-- Inserção de registros na tabela tb_pizzas

INSERT INTO tb_pizzas (id_pizza, nome_pizza, preco, ingredientes, id_categoria) VALUES
  (1, 'Margherita', 40.00, 'Molho de tomate, queijo mozarela, manjericão', 1),
  (2, 'Calabresa', 35.00, 'Molho de tomate, queijo mozarela, calabresa', 1),
  (3, 'Brigadeiro', 50.00, 'Brigadeiro, granulado de chocolate', 2),
  (4, 'Quatro Queijos', 45.00, 'Molho de tomate, queijo mozarela, queijo provolone, queijo gorgonzola, queijo parmesão', 1),
  (5, 'Vegetariana Especial', 55.00, 'Molho de tomate, queijo mozarela, champignon, milho, ervilha, palmito, cebola, pimentão', 3),
  (6, 'Frango com Catupiry', 48.00, 'Molho de tomate, queijo mozarela, frango desfiado, catupiry', 1),
  (7, 'Banana com Canela', 42.00, 'Banana, canela, açúcar', 2),
  (8, 'Mussarela', 30.00, 'Molho de tomate, queijo mozarela', 1);

-- SELECT que retorna todas as pizzas cujo valor seja maior do que R$ 45,00

SELECT * FROM tb_pizzas WHERE preco > 45.00;

-- SELECT que retorna todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00

SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100.00;

-- SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome

SELECT * FROM tb_pizzas WHERE nome_pizza LIKE '%M%';

-- SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias

SELECT tb_pizzas.*, tb_categorias.nome_categoria
FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria;

-- SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias,
-- onde traga apenas as pizzas que pertençam a uma categoria específica (Exemplo: Todas as pizzas que são doce).

SELECT tb_pizzas.*, tb_categorias.nome_categoria
FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Doce';