select * from cidades c inner JOIN prefeitos p on c.id = p.cidade_id;
select * from cidades c LEFT OUTER JOIN prefeitos p on c.id = p.cidade_id;
select * from cidades c right JOIN prefeitos p on c.id = p.cidade_id;