create database db_minha_casa_mais_linda;
use db_minha_casa_mais_linda;


create table tb_categoria(
id_categoria int auto_increment,
nome_categoria varchar(60),
tipo_categoria varchar(60),

primary key (id_categoria)
);

create table tb_produto(
id_produto int auto_increment,
nome_produto varchar(60),
localizacao_produto varchar(200),
vendedor_produto varchar(60),
valor double,
categoria_id_categoria int,
foreign key (categoria_id_categoria) REFERENCES tb_categoria(id_categoria),
 primary key (id_produto)
 );
 create table tb_usuario(
 id_usuario int auto_increment,
 nome_usuario varchar(60),
 idade_usuario int,
 email_usuario varchar(60),
 primary key(id_usuario)
 );
 
 INSERT INTO `db_minha_casa_mais_linda`.`tb_categoria` (`id_categoria`, `nome_categoria`, `tipo_categoria`) VALUES ('1', 'casa', 'alvenaria');
INSERT INTO `db_minha_casa_mais_linda`.`tb_categoria` (`id_categoria`, `nome_categoria`, `tipo_categoria`) VALUES ('2', 'oca', 'madeira');
INSERT INTO `db_minha_casa_mais_linda`.`tb_categoria` (`id_categoria`, `nome_categoria`, `tipo_categoria`) VALUES ('3', 'chale', 'madeira');
INSERT INTO `db_minha_casa_mais_linda`.`tb_categoria` (`id_categoria`, `nome_categoria`, `tipo_categoria`) VALUES ('4', 'pre montada', 'wood frame');

INSERT INTO `db_minha_casa_mais_linda`.`tb_produto` (`id_produto`, `nome_produto`, `localizacao_produto`, `vendedor_produto`, `valor`, `categoria_id_categoria`) VALUES ('1', 'chale velho', 'Indianopolis', 'Caio', '2000', '3');
INSERT INTO `db_minha_casa_mais_linda`.`tb_produto` (`id_produto`, `nome_produto`, `localizacao_produto`, `vendedor_produto`, `valor`, `categoria_id_categoria`) VALUES ('2', 'casa Assumbrada', 'Tranvenia', 'Rodolpho', '1500', '1');
INSERT INTO `db_minha_casa_mais_linda`.`tb_produto` (`id_produto`, `nome_produto`, `localizacao_produto`, `vendedor_produto`, `valor`, `categoria_id_categoria`) VALUES ('3', 'Desmontada', 'Rodopolis', 'Sarah', '5000', '4');

INSERT INTO `db_minha_casa_mais_linda`.`tb_usuario` (`id_usuario`, `nome_usuario`, `idade_usuario`, `email_usuario`) VALUES ('1', 'Edna', '56', 'edna@usuario.com');
INSERT INTO `db_minha_casa_mais_linda`.`tb_usuario` (`id_usuario`, `nome_usuario`, `idade_usuario`, `email_usuario`) VALUES ('2', 'Silvia', '52', 'silvia@usuario.com');
INSERT INTO `db_minha_casa_mais_linda`.`tb_usuario` (`id_usuario`, `nome_usuario`, `idade_usuario`, `email_usuario`) VALUES ('3', 'Pedro', '41', 'pedro@usuario.com');
INSERT INTO `db_minha_casa_mais_linda`.`tb_usuario` (`id_usuario`, `nome_usuario`, `idade_usuario`, `email_usuario`) VALUES ('4', 'João', '22', 'joao@usuario.com');


 select * from tb_usuario;
 
 select tb_produto.nome_produto, tb_produto.valor from tb_produto where tb_produto.valor >3000;

select * from tb_produto where tb_produto.valor between 1000 and 3000;

select * from tb_produto where tb_produto.nome_produto like "%b%";

select * from tb_usuario where tb_usuario.nome_usuario like "%a%";

select avg(valor) as Media from tb_produto;

select sum(valor) as Total from tb_produto;


select count(*) from tb_produto;

select * from tb_produto where tb_produto.categoria_id_categoria = 1;





