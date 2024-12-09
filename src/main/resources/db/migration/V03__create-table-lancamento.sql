create table lancamento(

id bigint not null auto_increment,
descricao varchar(50) not null,
data_vencimento date not null,
data_pagamento date not null,
valor decimal(10,2) not null,
observacao varchar(100),
tipo varchar(20) not null,
ativo tinyint default 1,
id_categoria bigint(20) not null,
id_pessoa bigint(20) not null,

foreign key (id_categoria) references categoria(id),
foreign key (id_pessoa) references pessoa(id),

primary key(id)
);