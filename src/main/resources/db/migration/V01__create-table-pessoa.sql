create table pessoa(

id bigint not null auto_increment,
nome varchar(100) not null,
ativo tinyint default 1,
logradouro varchar(100) not null,
numero varchar(20),
complemento varchar(100),
bairro varchar(100) not null,
cep varchar(9) not null,
cidade varchar(100) not null,
estado char(2) not null,

primary key(id)
);