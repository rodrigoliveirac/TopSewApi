-- MySQL dump 10.13  Distrib 8.0.36, for macos14 (x86_64)
--
-- Host: 127.0.0.1    Database: emp
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `fabric_stock_entry_entity`
--

use heroku_9e09bda83841914;

DROP TABLE IF EXISTS `fabric_stock_entry_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb3 */;
CREATE TABLE `fabric_stock_entry_entity` (
  `fabric_stock_entry_id` bigint NOT NULL,
  `amount` double DEFAULT NULL,
  `color_stock` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `entry_type` varchar(255) DEFAULT NULL,
  `fabric_id` int NOT NULL,
  `fabric_type` varchar(255) DEFAULT NULL,
  `order_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fabric_stock_entry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabric_stock_entry_entity`
--

LOCK TABLES `fabric_stock_entry_entity` WRITE;
/*!40000 ALTER TABLE `fabric_stock_entry_entity` DISABLE KEYS */;
INSERT INTO `fabric_stock_entry_entity` VALUES (354,2000,'[{\"amount\":1000,\"colorId\":\"02131624110\"},{\"amount\":1000,\"colorId\":\"12131624110\"}]','2024-06-10 05:59:19.000000','RECEIVE',1,'PLAIN',NULL),(402,1500,'[{\"amount\":1000,\"colorId\":\"12131624110\"},{\"amount\":500,\"colorId\":\"02131624110\"}]','2024-06-11 09:30:53.000000','USAGE',1,'PLAIN','151ce482-ec57-4d6f-a7c0-a17c4d3f9257'),(403,100,'[{\"amount\":100,\"colorId\":\"02131624110\"}]','2024-06-11 10:24:58.000000','USAGE',1,'PLAIN','011482e4-a83d-412b-9dbd-b8e8c99edfb5'),(404,100,'[{\"amount\":100,\"colorId\":\"02131624110\"}]','2024-06-11 10:38:34.000000','USAGE',1,'PLAIN','4db12da1-f847-4d33-b9a1-dbdcee0e0354'),(405,10,'[{\"amount\":10,\"colorId\":\"02131624110\"}]','2024-06-11 10:46:45.000000','USAGE',1,'PLAIN','2fa73a6c-d5d2-4d82-bcce-45bdab13b70d'),(406,100,'[{\"amount\":100,\"colorId\":\"02131624110\"}]','2024-06-11 10:48:21.000000','USAGE',1,'PLAIN','803b2bcf-ad1c-4145-badd-561b428c27d2'),(407,45,'[{\"amount\":45,\"colorId\":\"02131624110\"}]','2024-06-11 10:52:43.000000','USAGE',1,'PLAIN','f0cf44f1-e89a-4e01-b9d2-0617a50fc84d'),(408,1000,'[{\"amount\":1000,\"colorId\":\"02131624110\"}]','2024-06-11 10:55:11.000000','RECEIVE',1,'PLAIN',NULL);
/*!40000 ALTER TABLE `fabric_stock_entry_entity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-11 17:54:49
