SELECT * FROM estados -- Consulta todos os campos da tabela estados

SELECT nome, sigla FROM estados -- Consulta apenas os campos nome e sigla da tabela estados
WHERE regiao = 'Sul'      -- Filtra os estados da região Sul

SELECT nome, regiao FROM estados -- Consulta os campos nome e regiao da tabela estados
WHERE populacao >= 10 -- Filtra os estados com população maior ou igual a 10 milhões
ORDER by populacao DESC -- Ordena os resultados pela população em ordem decrescente 