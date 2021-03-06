# Host: localhost  (Version: 5.5.25a)
# Date: 2014-07-28 14:21:57
# Generator: MySQL-Front 5.3  (Build 2.59)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

DROP DATABASE IF EXISTS `bens`;
CREATE DATABASE `bens` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bens`;

#
# Source for table "acess"
#

DROP TABLE IF EXISTS `acess`;
CREATE TABLE `acess` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(200) DEFAULT NULL,
  `dta` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `horasaida` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

#
# Data for table "acess"
#

INSERT INTO `acess` VALUES (36,'Vitor','26/07/2014  ','16:52:17','16:55:08'),(37,'Vitor','26/07/2014  ','16:56:06','16:56:11'),(38,'Vitor','26/07/2014  ','16:56:27','16:56:31'),(39,'Vitor','26/07/2014  ','16:56:46','16:57:09'),(40,'Vitor','28/07/2014  ','13:42:11','13:42:30'),(41,'Vitor','28/07/2014  ','13:46:50','13:47:07'),(42,'Vitor','28/07/2014  ','13:47:17','13:47:28');

#
# Source for table "ambientes"
#

DROP TABLE IF EXISTS `ambientes`;
CREATE TABLE `ambientes` (
  `idambiente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idbloco` int(10) unsigned NOT NULL,
  `descricao` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idambiente`),
  KEY `ambientes_FKIndex1` (`idbloco`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

#
# Data for table "ambientes"
#

INSERT INTO `ambientes` VALUES (1,3,'Tornearia'),(2,3,'Lab. Metrologia'),(3,3,'Sala Torno CNC'),(4,3,'Fresagem  e Ajustagem'),(5,4,'Sala 4'),(6,2,'Nucleo de Treinamento Avançado');

#
# Source for table "armarios"
#

DROP TABLE IF EXISTS `armarios`;
CREATE TABLE `armarios` (
  `idarmario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idambiente` int(10) unsigned NOT NULL,
  `descricao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idarmario`),
  KEY `armarios_FKIndex1` (`idambiente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Data for table "armarios"
#

INSERT INTO `armarios` VALUES (1,2,'Armario 1'),(2,2,'Armario 2'),(3,1,'Armario 1');

#
# Source for table "bens"
#

DROP TABLE IF EXISTS `bens`;
CREATE TABLE `bens` (
  `idben` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idbloco` int(10) unsigned NOT NULL,
  `idarmario` int(10) unsigned NOT NULL,
  `iddivisao` int(10) unsigned NOT NULL,
  `idambiente` int(10) unsigned NOT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `marca` varchar(25) DEFAULT NULL,
  `modelo` varchar(25) DEFAULT NULL,
  `patrimonio` varchar(25) DEFAULT NULL,
  `ni` int(2) DEFAULT NULL,
  `valor` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idben`),
  KEY `bens_FKIndex1` (`idambiente`),
  KEY `bens_FKIndex2` (`iddivisao`),
  KEY `bens_FKIndex3` (`idarmario`),
  KEY `bens_FKIndex4` (`idbloco`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

#
# Data for table "bens"
#

INSERT INTO `bens` VALUES (1,3,1,1,2,'Ferramenta','Paquimetro','Mitutoyo','a1b2c3d4','67354348',0,'300,00'),(6,3,0,0,0,'Maquina','Centro de Usinagem','Romi','a1b2c3d4','056431386',0,'500.000,00'),(11,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130031384 ',0,'20.000,00'),(12,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130031382 ',0,'20.000,00'),(13,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130031381 ',0,'20.000,00'),(15,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130003518 ',0,'20.000,00'),(16,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130001724 ',0,'20.000,00'),(17,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130004952 ',0,'20.000,00'),(18,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130004953 ',0,'20.000,00'),(19,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130001275 ',0,'20.000,00'),(20,3,0,0,1,'Maquina','Torno Convencional','Nardini ','Mascote MS-205 ','3130004951 ',0,'20.000,00'),(22,3,0,0,3,'Maquina','Torno CNC','Siemens','Sinumerik 802D base line','3130005498',0,'150.000,00'),(24,3,1,1,2,'Instrumento','Paquimetro','Mitutoyo ','50 divisões ','00004',1,'300,00'),(25,3,1,1,2,'Instrumento','Paquimetro','Mitutoyo','50 divisões','00001',1,'300,00'),(26,3,1,1,2,'Ferramenta','Micrometro ','Mitutoyo','0-25 Centesimal ','00002',1,'300,00'),(27,3,0,0,4,'Maquina','Plaina','Zocca','500','00003',1,'25.000,00'),(28,3,0,0,4,'Maquina','Prensa Hidráulica','SMD','30 ton','3130001009 ',0,'5.000,00'),(29,3,1,1,2,'Instrumento','Paquimetro','Mitutoyo','20 divisões','00005',1,'300,00'),(30,3,3,7,1,'Ferramenta','Chave de Placa','abcGrande','a1b2c3','00006',1,'20,00'),(31,3,3,7,1,'Ferramenta','Chave de Placa','abcPequeno','a1b2c3','00007',1,'20,00');

#
# Source for table "blocos"
#

DROP TABLE IF EXISTS `blocos`;
CREATE TABLE `blocos` (
  `idbloco` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idunidade` int(10) unsigned NOT NULL,
  `descricao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idbloco`),
  KEY `blocos_FKIndex1` (`idunidade`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

#
# Data for table "blocos"
#

INSERT INTO `blocos` VALUES (1,2,'Bloco A'),(2,2,'Bloco B'),(3,2,'Bloco C-1° Andar'),(4,1,'Bloco A'),(5,1,'Bloco B'),(6,1,'Bloco C'),(7,2,'Bloco C-2° Andar');

#
# Source for table "divisoes"
#

DROP TABLE IF EXISTS `divisoes`;
CREATE TABLE `divisoes` (
  `iddivisao` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idarmario` int(10) unsigned NOT NULL,
  `descricao` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`iddivisao`),
  KEY `divisoes_FKIndex1` (`idarmario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

#
# Data for table "divisoes"
#

INSERT INTO `divisoes` VALUES (1,1,'Gaveta A'),(2,1,'Gaveta B'),(3,1,'Gaveta C'),(5,2,'Porta A'),(6,2,'Porta C'),(7,3,'Gondola A');

#
# Source for table "unidades"
#

DROP TABLE IF EXISTS `unidades`;
CREATE TABLE `unidades` (
  `idunidade` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idunidade`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

#
# Data for table "unidades"
#

INSERT INTO `unidades` VALUES (1,'Senai Cuiaba'),(2,'Senai Rondonopolis'),(3,'Senai Juina'),(4,'Senai Escola da Contrução'),(6,'Senai Sinop');

#
# Source for table "usuarios"
#

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `idusuario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `login` varchar(30) DEFAULT NULL,
  `senha` varchar(200) DEFAULT NULL,
  `dicasenha` varchar(20) DEFAULT NULL,
  `nivel` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "usuarios"
#

INSERT INTO `usuarios` VALUES (1,'Vitor Ribeiro dos Santos','Vitor','vitor0123','v0123',0),(2,'Thiago Leite','Thiago','0123','0!@#',2);

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
