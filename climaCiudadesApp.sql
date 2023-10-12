CREATE TABLE ciudad (
    id serial PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    temperatura DOUBLE PRECISION NOT NULL
);

SELECT COUNT(nombre) FROM ciudad;
DELETE FROM ciudad;