create database atividadecontextualizada
default character set utf8
default collate utf8_general_ci;

use atividadecontextualizada;

/* Lógico_1: */

CREATE TABLE Clientes (
    nome varchar(20),
    clienete_id int PRIMARY KEY,
    telefone varchar(16),
    CPF varchar(11)
);

insert into Clientes value
('junior', '1', '8399992298','12345978912'),
('josé', '2', '8345568988','12344568912'),
('joão', '3', '8355655489','18945678912'),
('plinio', '4', '8385896898','12345668912'),
('carlos', '5', '8345448848','12345978912');

select * from Clientes;

CREATE TABLE movimento (
    movimento_id int PRIMARY KEY,
    tipo_de_movimento varchar(16),
    data_do_movimento date,
    fk_Clientes_clienete_id int,
    fk_Funcionarios_funcionario_id int,
    fk_veiculo_veiculo_id int
);

insert into movimento 
(movimento_id,tipo_de_movimento,data_do_movimento)
values
('1', 'aluguel/ret', '2022-07-22'),
('2','aluguel/ret', '2022-06-22'),
('3','aluguel/dev', '2022-06-22'),
('4','manutenção', '2022-08-22'),
('5','aluguel/dev', '2022-07-22');

select * from movimento;

CREATE TABLE Funcionarios (
    funcionario_id int PRIMARY KEY,
    CPF int,
    nome_funcionario varchar(20)
);

insert into Funcionarios value 
('1', '12345679', 'carlão da lataria'),
('2', '12312222', 'jose da pintura'),
('3', '22255665', 'crio da lanternagem'),
('4', '55959444', 'puiga da eletrica'),
('5', '15969898', 'portuga da mecanica');

select * from funcionarios;

CREATE TABLE veiculo (
    veiculo_id int PRIMARY KEY,
    ano_fabricacao year,
    marca text,
    fk_manutencao_manutencao_id int
);

insert into veiculo
(veiculo_id, ano_fabricacao, marca)
 value
('1', '1995', 'wolks'),
('2', '2000', 'fiat'),
('3', '2010', 'gol'),
('4', '1999', 'corola'),
('5', '2002', 'fiesta');

select * from veiculo;

CREATE TABLE manutencao (
    manutencao_id int PRIMARY KEY,
    tipo_de_servico text,
    data_manutencao date
);
 
 insert into manutencao value
('1', 'manutenção','2022-05-22'),
('2', 'lavagem','2022-08-22'),
('3', 'lavagem','2022-04-22'),
('4', 'manutenção','2022-03-22'),
('5', 'lavagem','2022-05-22');

select * from manutencao;
 
ALTER TABLE movimento ADD CONSTRAINT FK_movimento_2
    FOREIGN KEY (fk_Clientes_clienete_id)
    REFERENCES Clientes (clienete_id)
    ON DELETE RESTRICT;
 
ALTER TABLE movimento ADD CONSTRAINT FK_movimento_3
    FOREIGN KEY (fk_Funcionarios_funcionario_id)
    REFERENCES Funcionarios (funcionario_id)
    ON DELETE CASCADE;
 
ALTER TABLE movimento ADD CONSTRAINT FK_movimento_4
    FOREIGN KEY (fk_veiculo_veiculo_id)
    REFERENCES veiculo (veiculo_id)
    ON DELETE CASCADE;
 
ALTER TABLE veiculo ADD CONSTRAINT FK_veiculo_2
    FOREIGN KEY (fk_manutencao_manutencao_id)
    REFERENCES manutencao (manutencao_id)
    ON DELETE CASCADE;
    
    select user();
    flush privileges;
    
    create user 'joao'@'localhost' IDENTIFIED BY '123456';
    GRANT ALL PRIVILEGES ON * . * TO 'joao'@'localhost';
    
    create user 'JUCA'@'localhost' IDENTIFIED BY '123456';
    GRANT select, insert ON * . * TO 'JUCA'@'localhost';
    
    create user 'cabrito teves'@'localhost' IDENTIFIED BY '123456';
    GRANT select ON * . * TO 'cabrito teves'@'localhost';
    
    create user 'antonio'@'localhost' IDENTIFIED BY '123456';
    GRANT insert ON * . * TO 'antonio'@'localhost';
    
    create user 'feijó'@'localhost' IDENTIFIED BY '123456';
    GRANT update , insert ON * . * TO 'feijó'@'localhost';
    