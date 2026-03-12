/* 1. Crea y Obtén todos los registros de la tabla usuarios.
*/
CREATE TABLE usuarios (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    email VARCHAR(50)
);

INSERT INTO usuarios (nombre, apellido, edad, email) VALUES 
('Jorge', 'Solis', 27, 'jorge12@gmail.com'),
('Guadalupe', 'Puente', 35, 'gpuente@gmail.com'),
('Yamileth', 'Ortega', 23, 'yamiletyhO@hotmail.com');

SELECT * FROM usuarios;

/* 2. Muestra solo los campos nombre y email de la tabla usuarios.
*/
SELECT nombre, email
FROM usuarios;


/* 3. Obtén los usuarios cuya edad sea mayor a 18. 
*/
SELECT * FROM usuarios WHERE edad > 18;


/* 4. Inserta un usuario llamado “Ana”, edad 25, email "ana@mail.com". 
*/
INSERT INTO usuarios (nombre, apellido, edad, email) 
VALUES ('Ana', 'Gonzalez', 25, 'ana@mail.com');


/* 5. Actualiza el email del usuario con id = 3. 
*/
UPDATE usuarios
SET email = 'actualizado@email.com' WHERE id = 3;


/* 6. Elimina el usuario con id = 5. 
*/
DELETE FROM usuarios WHERE id = 5;


/* 7. Obtén los usuarios ordenados por edad de mayor a menor. 
*/
SELECT * FROM usuarios
ORDER BY edad DESC;


/* 8. Cuenta cuántos usuarios hay en la tabla. 
*/
SELECT COUNT (*) AS TOTAL
FROM usuarios;


/* 9. Obtén los usuarios cuyo nombre empiece con la letra "A". 
*/
SELECT * FROM usuarios WHERE nombre LIKE 'A%';


/* 10. Muestra los usuarios con edad entre 20 y 30.
*/
SELECT * FROM usuarios
WHERE edad BETWEEN 20 AND 30;


/* 11. Agrupa usuarios por edad y muestra cuántos hay por cada edad. 
*/
SELECT edad, COUNT(*) AS TOTAL_EDAD
FROM usuarios
GROUP BY edad;


/* 12. Muestra solo edades que tengan más de 2 usuarios. 
*/
SELECT edad, COUNT(*) AS EDADES_USUARIOS
FROM usuarios
GROUP BY edad
HAVING COUNT(*) > 2;


/*13. Une las tablas pedidos y usuarios usando usuario_id.
a) Mostrando solo los campos de pedidos con su usuario_id mediante join 
b) Mostrando solo los compos de usuario con su pedido_id mediante join 
c) Mostrando todos los campos de ambas tablas join. 
d) Mostrando solo los campos de pedido_id y usuario_id mediante tabla intermedia. 
*/
SELECT p.*
FROM pedidos p
JOIN usuarios u ON p.usuario_id = u.id;

SELECT u.*, p.id AS pedido_id
FROM usuarios u
JOIN pedidos p ON p.usuario_id = u.id;

SELECT *
FROM pedidos p
JOIN usuarios u ON p.usuario_id = u.id;

SELECT p.id AS pedido_id, p.usuario_id
FROM pedidos p
JOIN usuarios u ON p.usuario_id = u.id;

/*14. Crea una tabla llamada productos con: 
id entero PK 
nombre texto 
precio decimal
*/
CREATE TABLE productos (
    id INT PRIMARY KEY,
    nombre VARCHAR(100),
    precio DECIMAL(10, 2)
);

INSERT INTO productos (nombre, precio) VALUES 
('Leche', 22.18),
('Huevo', 25.50),
('Galletas', 18.69);


/* 15. Agrega una columna telefono a la tabla usuarios. 
*/
ALTER TABLE usuarios
ADD telefono VARCHAR(10);

/*16. Elimina la tabla temporal intermedia. 
*/
DROP TABLE productos;


/*17. Muestra productos con precio mayor al promedio de todos los productos. 
*/
SELECT * FROM productos WHERE precio > (SELECT AVG(precio) FROM productos);


/*18. Obtén el pedido más reciente. 
*/
SELECT *
FROM productos
ORDER BY fecha DESC
FETCH FIRST 1 ROW ONLY;

/*19. Crea una clave foránea en pedidos que apunte a usuarios(id). 
*/
ALTER TABLE productos
ADD CONSTRAINT fk_usuario
FOREIGN KEY (usuario_id)
REFERENCES usuarios(id);

/*20. Muestra los usuarios que no tienen pedidos.
*/
SELECT u.*
FROM usuarios u
LEFT JOIN pedidos p ON u.id = p.usuario_id
WHERE p.id IS NULL;