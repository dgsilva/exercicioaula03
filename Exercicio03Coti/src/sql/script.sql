create database exercicioAula03;
use exercicioAula03;

create table fornecedor(
idfornecedor int primary key auto_increment,
nome varchar(50) not null,
cnpj varchar(14) not null unique,
telefone varchar(15) not null
);

create table produto(
idproduto int primary key auto_increment,
nome varchar(50) not null,
preco float(5,2) not null,
quantidade int not null,
dataCompra date not null,
idfornecedor int,
foreign key(idfornecedor) references fornecedor(idfornecedor) 
);