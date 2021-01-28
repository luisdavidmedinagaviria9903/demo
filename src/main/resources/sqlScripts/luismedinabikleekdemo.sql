CREATE DATABASE  IF NOT EXISTS `luismedinabikleekdemo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `luismedinabikleekdemo`;
-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: localhost    Database: luismedinabikleekdemo
-- ------------------------------------------------------
-- Server version	8.0.19-0ubuntu5

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `secondName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `secondLastName` varchar(255) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `creationDate` datetime DEFAULT NULL,
  `modifyDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'luisdavidmedinagaviria@gmail.com','1045758190','Luis','David','Medina','Gaviria',1,'3007720713','1999-03-12','2021-01-27 20:49:23','2021-01-27 20:49:23'),(2,'luis@gmail.com','1042323423','Luis','manuel','cabrera','Garcia',1,'3002234567','1999-03-12','2021-01-27 22:40:31','2021-01-27 22:40:31'),(3,'luissdasd@gmail.com','10423456654','Luis','msadsd','cadasdasd','dasdsd',1,'3012345678','1999-03-12','2021-01-27 22:40:31','2021-01-27 22:40:31'),(4,'luissdasdasd@gmail.com','104233466743','Luis','dasdasewr','fsdffdsf','egdfgdffg',1,'3153045785','1999-03-12','2021-01-27 22:40:31','2021-01-27 22:40:31'),(5,'luissdasdsd@gmail.com','1042356767','Luis','dfgdfggfd','dfgdfgdfg','dfgdfg',1,'3233045785','1999-03-12','2021-01-27 22:40:31','2021-01-27 22:40:31'),(6,'luis234234@gmail.com','1042345656','Luis','dfgdfgdfg','rtertert','dgfg',1,'3333045785','1999-03-12','2021-01-27 22:40:31','2021-01-27 22:40:31'),(7,'luisdsfsd3423@gmail.com','10423256456','Luis','dfgdfertert','fdgdfgdfg','ertert',1,'3113045785','1999-03-12','2021-01-27 22:40:31','2021-01-27 22:40:31'),(8,'luisfsdfsd2335@gmail.com','13453546','Luis','dfgdfg','ertert','vcvxvxcvc',1,'3173045785','1999-03-12','2021-01-27 22:40:31','2021-01-27 22:40:31');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financialinfo`
--

DROP TABLE IF EXISTS `financialinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `financialinfo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `products` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `creationDate` datetime DEFAULT NULL,
  `modifyDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `customer_id_UNIQUE` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financialinfo`
--

LOCK TABLES `financialinfo` WRITE;
/*!40000 ALTER TABLE `financialinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `financialinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `productState` int DEFAULT NULL,
  `productName` varchar(255) DEFAULT NULL,
  `creationDate` datetime DEFAULT NULL,
  `modifyDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-28 14:34:58
