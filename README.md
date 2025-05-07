# Sistema de Gestión de Notas Académicas

> Proyecto de base de datos relacional implementado con MySQL, diseñado para la administración eficiente de estudiantes, profesores, cursos, matrículas y calificaciones.

## Descripción General
>Este sistema modela una solución robusta para instituciones educativas que requieren gestionar y almacenar información académica de forma organizada. Fue desarrollado como parte de un proyecto universitario en el área de bases de datos, y cumple con principios de integridad referencial y normalización.

## Arquitectura de la Base de Datos

### Tablas principales:

- **profesores**: Almacena nombres y especialidades.
- **materias**: Lista de asignaturas y grados asociados.
- **curso**: Asociación entre materias, docentes y horarios.
- **estudiantes**: Datos personales de los estudiantes.
- **matricula**: Registro de estudiantes inscritos a cursos.
- **notas**: Calificación final de cada matrícula.

### Relaciones clave:

- Relación uno a muchos: 'profesores' → 'curso'
- Relación muchos a muchos: 'estudiantes' ↔ 'materias' (a través de 'matricula')
- Relación uno a uno: 'matricula' → 'notas'

## Tecnologías utilizadas
- **MySQL** – Motor de base de datos relacional
- **Java** – Lenguaje de programación backend
- **NetBeans** – Entorno de desarrollo (IDE)
- **SQL** – Lenguaje de definición y manipulación de datos

## Estructura del Proyecto
gestión-notas/

├── README.md

├── database/

│ └── script_sistema_notas.sql

└── gestion_notas/


## Instrucciones de implementación

**Repositorio**
   [Sistema de Gestion de Notas](https://github.com/YessicaAlexandra/gestion-notas.git)

1. Clona este repositorio:
   ```bash
   git clone https://github.com/YessicaAlexandra/gestion-notas.git


2. **Importa el proyecto en NetBeans:**

- Abre NetBeans.

- Selecciona “Abrir proyecto” y elige la carpeta gestion_notas.

3. **Crea la base de datos en MySQL:**

- Abre tu cliente SQL (Workbench o consola).

- Ejecuta el script script_sistema_notas.sql ubicado en la carpeta database.

4. **Verifica y ajusta la conexión JDBC en el código:**

- Asegúrate de que el nombre de la base de datos, usuario y contraseña coincidan con tu configuración local.

5. **Ejecuta el proyecto desde NetBeans.**

## Posibles mejoras futuras
Panel administrativo con login por roles.

Exportación de boletines en PDF.

CRUD completo para cada entidad desde interfaz gráfica.

Panel web complementario (futuro con Java Web o Spring Boot).

## Autor
> **Yessica Alexandra Conejo Muñoz**

> **Ingeniera de Sistemas – Fundación Universitaria de Popayán**

> **Correo: munozyessica412@gmail.com**

> **GitHub**

   [GitHub](https://github.com/Yessica-222)