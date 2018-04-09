-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: tienda
-- ------------------------------------------------------
-- Server version	5.7.21-1ubuntu1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `clave_producto` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(25) NOT NULL,
  `precio` float NOT NULL,
  `clasificacion` varchar(25) NOT NULL,
  `existencia` float NOT NULL,
  `min_existencia` float NOT NULL,
  `max_existencia` float NOT NULL,
  PRIMARY KEY (`clave_producto`),
  UNIQUE KEY `clave_producto` (`clave_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Cornfleis',25,'Abarrotes',5,2,10),(2,'cukicris',25,'Abarrotes',5,2,10),(3,'Leche',26,'Abarrotes',5,2,7),(4,'Papel',5.8,'Abarrotes',17,6,50),(5,'Queso Poroso',100,'Carnes Frias',2,0,11),(6,'Queso Laurel',123,'Carnes Frias',2,0,11),(7,'Chicharron',150,'Abarrotes',4,3,6),(8,'Chicharron Peyita',175.5,'Abarrotes',1,2,11),(9,'Platano',14,'Fruteria',5,6,40),(10,'Lechuga',12,'Fruteria',5,5,12),(11,'Manzana roja',33,'Fruteria',6.2,2,10),(12,'Manzana verde',33,'Fruteria',4.5,2,10),(13,'Salchichia',66,'Carnes Frias',10,11.8,15),(14,'Jamon',80,'Carnes Frias',2.1,1.8,3.8),(15,'Winis',50,'Carnes Frias',5,4,5),(16,'Sabitas',12,'Abarrotes',2,4,6),(17,'Mayonesa',23,'Abarrotes',60,10,50),(18,'Catsup',30,'Abarrotes',25,5,50),(19,'Sardinas',15,'Abarrotes',53,2,100),(20,'Galletas Saladas',15,'Abarrotes',29,10,50),(21,'Cafe',92,'Abarrotes',2,6,20),(22,'Pure de Tomate',5,'Abarrotes',35,10,48),(23,'Crema de champinones',30,'Abarrotes',2,2,12),(24,'Media Crema',12,'Abarrotes',30,5,60),(25,'Salsa de Soya',23,'Abarrotes',3,2,12),(26,'Te',36,'Abarrotes',35,10,48),(27,'Atun enlatado',8,'Abarrotes',4,4,24),(28,'Jamon enlatado',55,'Abarrotes',5,1,6),(29,'Polvo para hornear',27,'Abarrotes',27,12,100),(30,'Azucar',23,'Abarrotes',48,12,48),(31,'Arroz',13,'Abarrotes',36,12,36),(32,'Pasta coditos',5,'Abarrotes',48,10,48),(33,'Pasta fideos',5,'Abarrotes',48,10,48),(34,'Pasta letras',5,'Abarrotes',10,10,36),(35,'Pasta conchas',5,'Abarrotes',10,10,24),(36,'Roles glaseados',25,'Abarrotes',2,2,3),(37,'Negrito',10,'Abarrotes',4,4,8),(38,'Donitas esolvoreadas',10,'Abarrotes',4,2,6),(39,'Donitas',10,'Abarrotes',2,2,4),(40,'Rebanadas',6,'Abarrotes',6,2,10),(41,'Betabel',30,'Fruteria',2,1,2),(42,'Limon',44,'Fruteria',1,1,5),(43,'Tecno-Limon',10855,'Fruteria',0.5,0,0.5),(44,'Calabaza',12,'Fruteria',3.5,1,5),(45,'Platano',17,'Fruteria',10,5,15),(46,'Pepino',18,'Fruteria',3.5,1,8),(47,'Ajo',100,'Fruteria',2,0.5,2),(48,'Tomate',20,'Fruteria',10,3,10),(49,'Papa',17,'Fruteria',26.2,2,30),(50,'Chile Chilaca',23,'Fruteria',3.5,1,10),(51,'Chile Jalapeno',23,'Fruteria',3.5,1,10),(52,'Chile Poblado',44,'Fruteria',3.5,1,5),(53,'Chile Morron',69,'Fruteria',3.5,1,3.5),(54,'Zanahoria',14,'Fruteria',6,4,10),(55,'Apio',12,'Fruteria',1,1,5),(56,'Repollo',10,'Fruteria',16.3,3,20),(57,'Lechuga romana',33,'Fruteria',1,1,6),(58,'Domo de Fresas',45,'Fruteria',6,2,8),(59,'Mango',43,'Fruteria',2,2,12),(60,'Pina',18,'Fruteria',6,2,10),(61,'Uva',78,'Fruteria',1,1,5),(62,'Jengibre',150,'Fruteria',0.6,0,1.5),(63,'Cebolla de Rabo',6,'Fruteria',26,0,30),(64,'Papa Cambray',53,'Fruteria',2,1,8),(65,'Espinacas',11,'Fruteria',6,0,6),(66,'Cilantro',5,'Fruteria',31,5,50),(67,'Serrano',27,'Fruteria',2.5,2,7),(68,'Cebolla morada',25,'Fruteria',4.7,2,5),(69,'Salchichas para asar',55,'Carnes Frias',3,0,5),(70,'Jamon de pavo',80,'Carnes Frias',4,1,5),(71,'Jamon de cerdo',80,'Carnes Frias',4,1,5),(72,'Salchichon',66,'Carnes Frias',3,3,6),(73,'Salchichas de pavo',55,'Carnes Frias',1,1,8),(74,'Tocino',64,'Carnes Frias',2,2,8),(75,'Toxino',742,'Carnes Frias',0.9,0,1),(76,'Tocineta',120,'Carnes Frias',0,0,2),(77,'Pechuga de pollo',110,'Carnes Frias',2,2,5),(78,'Carne molida',100,'Carnes Frias',4,1,5),(79,'Chuleta del 7',98,'Carnes Frias',2,1,5),(80,'Deditos de queso',5,'Carnes Frias',265,8,30);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-08 22:58:37
