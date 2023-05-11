-- Criação do banco de dados
CREATE DATABASE db_construindo_vidas;

-- Uso do banco de dados
USE db_construindo_vidas;

-- Criação da tabela tb_categorias
CREATE TABLE tb_categorias (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  descricao VARCHAR(255)
);

-- Criação da tabela tb_produtos
CREATE TABLE tb_produtos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  preco DECIMAL(10, 2) NOT NULL,
  quantidade INT NOT NULL,
  categoria_id INT,
  FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

-- Inserção de registros na tabela tb_categorias
INSERT INTO tb_categorias (nome, descricao) VALUES
  ('Hidráulica', 'Produtos relacionados a encanamento e tubulações'),
  ('Elétrica', 'Produtos relacionados a instalações elétricas'),
  ('Ferramentas', 'Ferramentas para construção e manutenção'),
  ('Acabamentos', 'Materiais para acabamentos em construção'),
  ('Segurança', 'Produtos de segurança e proteção');

-- Inserção de registros na tabela tb_produtos
INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id) VALUES
  ('Tubo PVC 50mm', 15.90, 100, 1),
  ('Fio Elétrico 2.5mm', 2.50, 500, 2),
  ('Martelo de Borracha', 19.90, 50, 3),
  ('Piso Cerâmico', 29.90, 200, 4),
  ('Luvas de Segurança', 5.99, 1000, 5),
  ('Torneira de Banheiro', 89.90, 30, 1),
  ('Chave de Fenda', 7.50, 100, 3),
  ('Interruptor Simples', 12.90, 50, 2);

-- SELECT de produtos cujo valor seja maior que R$ 100,00
SELECT * FROM tb_produtos WHERE preco > 100.00;

-- SELECT de produtos cujo valor esteja no intervalo de R$ 70,00 a R$ 150,00
SELECT * FROM tb_produtos WHERE preco BETWEEN 70.00 AND 150.00;

-- SELECT utilizando o operador LIKE para buscar produtos com a letra 'C' no nome
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

-- SELECT utilizando INNER JOIN para unir tb_produtos com tb_categorias
SELECT p.*, c.nome AS categoria FROM tb_produtos AS p
INNER JOIN tb_categorias AS c ON p.categoria_id = c.id;

-- SELECT utilizando INNER JOIN para unir tb_produtos com tb_categorias, filtrando por uma categoria específica
SELECT p.*, c.nome AS categoria FROM tb_produtos AS p
INNER JOIN tb_categorias AS c ON p.categoria_id = c.id
WHERE c.nome = 'Hidráulica';
