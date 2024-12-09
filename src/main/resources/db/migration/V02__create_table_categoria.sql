create table categoria(

id bigint not null auto_increment,
nome varchar(30) not null,
ativo tinyint default 1,

primary key(id)
);