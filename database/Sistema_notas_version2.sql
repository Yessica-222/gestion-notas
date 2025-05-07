-- Crear la base de datos
CREATE DATABASE sistema_notas;
USE sistema_notas;

-- Tabla: profesores
CREATE TABLE profesores (
  cod_profesor INT PRIMARY KEY,
  nombre_profesor VARCHAR(45),
  apellido_profesor VARCHAR(45),
  especializacion VARCHAR(45)
);

INSERT INTO profesores VALUES 
(912,'Sebastian','Collazos','Ingles'),
(1006,'alexandra','meneses','sistemas'),
(1061,'Nohora','Muñoz','sociales'),
(23456,'lizbet','orozco','Español'),
(34589,'Juan','Orozco','Sociales'),
(44590,'Gloria','Sanchez','Quimica'),
(88901,'Angel','Tola','Matematicas');

-- Tabla: materias
CREATE TABLE materias (
  cod_materia INT PRIMARY KEY,
  nombre_materia VARCHAR(45),
  grado_materia INT
);

INSERT INTO materias VALUES 
(124,'Biologia',6),
(1225,'ciencias',5),
(12345,'Sociales',10),
(12456,'Español',3),
(45678,'Matematicas 2',7),
(45679,'Matematicas 1',6),
(99012,'Quimica',8);

-- Tabla: curso
CREATE TABLE curso (
  salon VARCHAR(10),
  horario VARCHAR(45) NOT NULL,
  num_grupo INT,
  cod_profesor INT NOT NULL,
  cod_materia INT NOT NULL,
  PRIMARY KEY (cod_profesor, cod_materia, horario),
  FOREIGN KEY (cod_profesor) REFERENCES profesores(cod_profesor),
  FOREIGN KEY (cod_materia) REFERENCES materias(cod_materia)
);

INSERT INTO curso VALUES 
('s100','Noche',4,912,12456),
('s105','Tarde',8,912,45679),
('s2332','Tarde',12,912,99012),
('s112','Tarde',3,1061,1225),
('s111','Mañana',11,88901,124);

-- Tabla: estudiantes
CREATE TABLE estudiantes (
  cod_estudiante INT PRIMARY KEY,
  nombre_estudiante VARCHAR(45),
  apellido_estudiante VARCHAR(45),
  telefono VARCHAR(12)
);

INSERT INTO estudiantes VALUES 
(203,'osnayder','Alpala','3129904567'),
(1002,'Romel','Alpala','3213526936'),
(1234,'Juan','Perez','3221230094'),
(1239,'Yessica','Muñoz','3120001234'),
(4467,'Brandon','Rosero','3204301928'),
(4567,'Esteban','Urbano','3203456121'),
(6789,'Maria','Jimenez','3123456734'),
(9870,'Ronald','Rengifo','3105678912');

-- Tabla: matricula
CREATE TABLE matricula (
  cod_estudiante INT NOT NULL,
  cod_profesor INT NOT NULL,
  cod_materia INT NOT NULL,
  observacion VARCHAR(45),
  PRIMARY KEY (cod_estudiante, cod_profesor, cod_materia),
  FOREIGN KEY (cod_estudiante) REFERENCES estudiantes(cod_estudiante),
  FOREIGN KEY (cod_profesor, cod_materia) REFERENCES curso(cod_profesor, cod_materia)
);

INSERT INTO matricula VALUES 
(4467,912,45679,'Pendiente'),
(4467,88901,124,'pre'),
(4567,1061,1225,'prueba'),
(6789,912,45679,'');

-- Tabla: notas
CREATE TABLE notas (
  cod_estudiante INT,
  cod_profesor INT,
  cod_materia INT,
  nota_1 DOUBLE,
  nota_2 DOUBLE,
  nota_3 DOUBLE,
  nota_final DOUBLE,
  FOREIGN KEY (cod_estudiante, cod_profesor, cod_materia) 
    REFERENCES matricula(cod_estudiante, cod_profesor, cod_materia)
);

INSERT INTO notas VALUES 
(4467,912,45679,3.8,3.5,3.4,3.5666666666666664);
