-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_notas
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `salon` varchar(10) DEFAULT NULL,
  `horario` varchar(45) NOT NULL,
  `num_grupo` int DEFAULT NULL,
  `cod_profesor` int NOT NULL,
  `cod_materia` int NOT NULL,
  PRIMARY KEY (`cod_profesor`,`cod_materia`,`horario`),
  KEY `fk_materia_curso` (`cod_materia`),
  CONSTRAINT `fk_materia_curso` FOREIGN KEY (`cod_materia`) REFERENCES `materias` (`cod_materia`),
  CONSTRAINT `fk_profesor_curso` FOREIGN KEY (`cod_profesor`) REFERENCES `profesores` (`cod_profesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES ('s100','Noche',4,912,12456),('s105','Tarde',8,912,45679),('s2332','Tarde',12,912,99012),('s112','Tarde',3,1061,1225),('s111','Mañana',11,88901,124);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiantes`
--

DROP TABLE IF EXISTS `estudiantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiantes` (
  `cod_estudiante` int NOT NULL,
  `nombre_estudiante` varchar(45) DEFAULT NULL,
  `apellido_estudiante` varchar(45) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`cod_estudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiantes`
--

LOCK TABLES `estudiantes` WRITE;
/*!40000 ALTER TABLE `estudiantes` DISABLE KEYS */;
INSERT INTO `estudiantes` VALUES (203,'osnayder','Alpala','3129904567'),(1002,'Romel','Alpala','3213526936'),(1234,'Juan','Perez','3221230094'),(1239,'Yessica','Muñoz','3120001234'),(4467,'Brandon','Rosero','3204301928'),(4567,'Esteban','Urbano','3203456121'),(6789,'Maria','Jimenez','3123456734'),(9870,'Ronald','Rengifo','3105678912');
/*!40000 ALTER TABLE `estudiantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materias` (
  `cod_materia` int NOT NULL,
  `nombre_materia` varchar(45) DEFAULT NULL,
  `grado_materia` int DEFAULT NULL,
  PRIMARY KEY (`cod_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` VALUES (124,'Biologia',6),(1225,'ciencias',5),(12345,'Sociales',10),(12456,'Español',3),(45678,'Matematicas 2',7),(45679,'Matematicas 1',6),(99012,'Quimica',8);
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matricula` (
  `cod_estudiante` int NOT NULL,
  `cod_profesor` int NOT NULL,
  `cod_materia` int NOT NULL,
  `observacion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_estudiante`,`cod_profesor`,`cod_materia`),
  KEY `fk_matricula_curso1` (`cod_profesor`),
  KEY `fk_matricula_curso2` (`cod_materia`),
  CONSTRAINT `fk_estudiante_matricula` FOREIGN KEY (`cod_estudiante`) REFERENCES `estudiantes` (`cod_estudiante`),
  CONSTRAINT `fk_matricula_curso1` FOREIGN KEY (`cod_profesor`) REFERENCES `curso` (`cod_profesor`),
  CONSTRAINT `fk_matricula_curso2` FOREIGN KEY (`cod_materia`) REFERENCES `curso` (`cod_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
INSERT INTO `matricula` VALUES (4467,912,45679,'Pendiente'),(4467,88901,124,'pre'),(4567,1061,1225,'prueba'),(6789,912,45679,'');
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notas`
--

DROP TABLE IF EXISTS `notas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notas` (
  `cod_estudiante` int DEFAULT NULL,
  `cod_profesor` int DEFAULT NULL,
  `cod_materia` int DEFAULT NULL,
  `nota_1` double DEFAULT NULL,
  `nota_2` double DEFAULT NULL,
  `nota_3` double DEFAULT NULL,
  `nota_final` double DEFAULT NULL,
  KEY `fk_notas_matricula` (`cod_estudiante`,`cod_profesor`,`cod_materia`),
  CONSTRAINT `fk_notas_matricula` FOREIGN KEY (`cod_estudiante`, `cod_profesor`, `cod_materia`) REFERENCES `matricula` (`cod_estudiante`, `cod_profesor`, `cod_materia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notas`
--

LOCK TABLES `notas` WRITE;
/*!40000 ALTER TABLE `notas` DISABLE KEYS */;
INSERT INTO `notas` VALUES (4467,912,45679,3.8,3.5,3.4,3.5666666666666664);
/*!40000 ALTER TABLE `notas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `cod_profesor` int NOT NULL,
  `nombre_profesor` varchar(45) DEFAULT NULL,
  `apellido_profesor` varchar(45) DEFAULT NULL,
  `especializacion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_profesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES (912,'Sebastian','Collazos','Ingles'),(1006,'alexandra','meneses','sistemas'),(1061,'Nohora','Muñoz','sociales'),(23456,'lizbet','orozco','Español'),(34589,'Juan','Orozco','Sociales'),(44590,'Gloria','Sanchez','Quimica'),(88901,'Angel','Tola','Matematicas');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16  7:26:42
