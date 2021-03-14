-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: db_generation_game_online
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_classe`
--

DROP TABLE IF EXISTS `tb_classe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_classe` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `arma` varchar(30) NOT NULL,
  `classe` varchar(30) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_classe`
--

LOCK TABLES `tb_classe` WRITE;
/*!40000 ALTER TABLE `tb_classe` DISABLE KEYS */;
INSERT INTO `tb_classe` VALUES (1,'arco','arqueiro'),(2,'cajado','sacerdote'),(3,'espada','guerreiro'),(4,'varinha','mago'),(5,'lanca','paladinho');
/*!40000 ALTER TABLE `tb_classe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_personagem`
--

DROP TABLE IF EXISTS `tb_personagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_personagem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nivel` int NOT NULL,
  `ataque` int NOT NULL,
  `defesa` int NOT NULL,
  `nome` varchar(20) DEFAULT NULL,
  KEY `id` (`id`),
  CONSTRAINT `tb_personagem_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tb_classe` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_personagem`
--

LOCK TABLES `tb_personagem` WRITE;
/*!40000 ALTER TABLE `tb_personagem` DISABLE KEYS */;
INSERT INTO `tb_personagem` VALUES (1,250,3500,2000,'gabriel'),(5,100,900,1500,'rafael'),(3,50,500,500,'claudio'),(5,10,30,50,'miguel'),(5,150,1500,1500,'gilberto'),(1,200,3000,1500,'gustavo'),(2,300,3500,5500,'ismael'),(2,400,3000,5500,'caique');
/*!40000 ALTER TABLE `tb_personagem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_generation_game_online'
--

--
-- Dumping routines for database 'db_generation_game_online'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-12 15:51:11
