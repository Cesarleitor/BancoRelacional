INSERT INTO empresas (nome, cnpj)
VALUES
('Bradesco', 56489532148956),
('Tech Solutions LTDA', 29384756012387),
('Alpha Digital', 10928374651239),
('Nova Energia SA', 76845392018745),
('Global Foods', 58473920194857),
('TransLog Transportes', 91837465012947),
('Mercado Central', 20495876123498),
('InfoTech Brasil', 65729183475012),
('Bio Health Pharma', 31249876590123),
('Construtora Torres', 48901237564890),
('Clínica Vida Mais', 75648923107564),
('Agro Vale', 83592017456328),
('Ocean Express', 90127536498213),
('Maxi Comunicação', 27834561907546),
('Blue Security', 64097531824651),
('Solar Future', 84397021536498),
('Universo Games', 70219384561730),
('Smart Tecno', 39057428615940),
('Omega Indústria SA', 51820937465182),
('Eco Transporte', 96281704352901);


SELECT * FROM empresas;
SELECT * FROM cidades;


INSERT INTO empresas_unidades ( empresa_id, cidade_id, sede) 
VALUES
(1, 1, 1),
(1, 5, 0),
(5, 5, 1),
(18, 9, 1);