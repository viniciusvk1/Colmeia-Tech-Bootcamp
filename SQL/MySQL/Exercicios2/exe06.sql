-- Criação do banco de dados
CREATE DATABASE db_curso_da_minha_vida;

-- Uso do banco de dados
USE db_curso_da_minha_vida;

-- Criação da tabela tb_categorias
CREATE TABLE tb_categorias (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  descricao VARCHAR(255)
);

-- Criação da tabela tb_cursos
CREATE TABLE tb_cursos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  preco DECIMAL(10, 2) NOT NULL,
  duracao INT NOT NULL,
  categoria_id INT,
  FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

-- Inserção de registros na tabela tb_categorias
INSERT INTO tb_categorias (nome, descricao) VALUES
  ('Programação', 'Cursos relacionados a programação de software'),
  ('Design', 'Cursos relacionados a design gráfico e web'),
  ('Negócios', 'Cursos relacionados a empreendedorismo e negócios'),
  ('Marketing', 'Cursos relacionados a marketing digital'),
  ('Idiomas', 'Cursos relacionados ao aprendizado de idiomas');

-- Inserção de registros na tabela tb_cursos
INSERT INTO tb_cursos (nome, preco, duracao, categoria_id) VALUES
  ('Curso de Java', 799.00, 30, 1),
  ('Curso de Photoshop', 599.00, 15, 2),
  ('Curso de Marketing Digital', 899.00, 45, 4),
  ('Curso de Inglês', 999.00, 60, 5),
  ('Curso de Python', 699.00, 30, 1),
  ('Curso de Illustrator', 599.00, 20, 2),
  ('Curso de Finanças para Empreendedores', 799.00, 40, 3),
  ('Curso de Espanhol', 599.00, 45, 5);

-- SELECT de cursos cujo valor seja maior que R$ 500,00
SELECT * FROM tb_cursos WHERE preco > 500.00;

-- SELECT de cursos cujo valor esteja no intervalo de R$ 600,00 a R$ 1000,00
SELECT * FROM tb_cursos WHERE preco BETWEEN 600.00 AND 1000.00;

-- SELECT utilizando o operador LIKE para buscar cursos com a letra 'J' no nome
SELECT * FROM tb_cursos WHERE nome LIKE '%J%';

-- SELECT utilizando INNER JOIN para unir tb_cursos com tb_categorias
SELECT c.*, cat.nome AS categoria FROM tb_cursos AS c
INNER JOIN tb_categorias AS cat ON c.categoria_id = cat.id;

-- SELECT utilizando INNER JOIN para unir tb_cursos com tb_categorias, filtrando por uma categoria específica
SELECT c.*, cat.nome AS categoria FROM tb_cursos AS c
INNER JOIN tb_categorias AS cat ON c.categoria_id = cat.id
WHERE cat.nome = 'Java';