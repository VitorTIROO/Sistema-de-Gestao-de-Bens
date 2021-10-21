DROP DATABASE IF EXISTS `bens`;
CREATE DATABASE `bens` 
USE `bens`;

CREATE TABLE bens (
  idben INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idbloco INTEGER UNSIGNED NOT NULL,
  idarmario INTEGER UNSIGNED NOT NULL,
  iddivisao INTEGER UNSIGNED NOT NULL,
  idambiente INTEGER UNSIGNED NOT NULL,
  tipo VARCHAR(20) NULL,
  descricao VARCHAR(50) NULL,
  marca VARCHAR(25) NULL,
  modelo VARCHAR(25) NULL,
  patrimonio VARCHAR(25) NULL,
  valor VARCHAR(30) NULL,
  ni INTEGER(1) UNSIGNED NULL,
  PRIMARY KEY(idben),
  INDEX bens_FKIndex1(idambiente),
  INDEX bens_FKIndex2(iddivisao),
  INDEX bens_FKIndex3(idarmario),
  INDEX bens_FKIndex4(idbloco)
);

CREATE TABLE divisoes (
  iddivisao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idarmario INTEGER UNSIGNED NOT NULL,
  descricao VARCHAR(30) NULL,
  PRIMARY KEY(iddivisao),
  INDEX divisoes_FKIndex1(idarmario)
);

CREATE TABLE armarios (
  idarmario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idambiente INTEGER UNSIGNED NOT NULL,
  descricao VARCHAR(20) NULL,
  PRIMARY KEY(idarmario),
  INDEX armarios_FKIndex1(idambiente)
);

CREATE TABLE ambientes (
  idambiente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idbloco INTEGER UNSIGNED NOT NULL,
  descricao VARCHAR(30) NULL,
  PRIMARY KEY(idambiente),
  INDEX ambientes_FKIndex1(idbloco)
);

CREATE TABLE blocos (
  idbloco INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idunidade INTEGER UNSIGNED NOT NULL,
  descricao VARCHAR(20) NULL,
  PRIMARY KEY(idbloco),
  INDEX blocos_FKIndex1(idunidade)
);

CREATE TABLE unidades (
  idunidade INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50) NULL,
  PRIMARY KEY(idunidade)
);

CREATE TABLE usuarios (
  idusuario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50) NULL,
  login VARCHAR(30) NULL,
  senha VARCHAR(20) NULL,
  dicasenha VARCHAR(20) NULL,
  nivel INTEGER UNSIGNED NULL,
  PRIMARY KEY(idusuario)
);

CREATE TABLE acesso (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  usuario VARCHAR(50) NULL,
  dta VARCHAR(15) NULL,
  hora VARCHAR(20) NULL,
  horasaida VARCHAR(20) NULL,
  PRIMARY KEY(id)
);