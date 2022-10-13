DROP TABLE IF EXISTS CLIENTE;
DROP TABLE IF EXISTS COMPRA;
DROP TABLE IF EXISTS CONSIGNACION;
DROP TABLE IF EXISTS CUENTA;
DROP TABLE IF EXISTS PRODUCTOS;

CREATE TABLE CLIENTE (
    cedula BIGINT  PRIMARY KEY,
    n_cuenta BIGINT,
    nombre VARCHAR(250)

);

CREATE TABLE COMPRA (
    id_compra BIGINT  AUTO_INCREMENT PRIMARY KEY,
    cedula BIGINT,
    costo_compra BIGINT,
    hora VARCHAR(50),
    id_producto BIGINT,
    n_cuenta BIGINT

);

CREATE TABLE CONSIGNACION (
    id_consignacion BIGINT AUTO_INCREMENT PRIMARY KEY,
    cedula BIGINT,
    n_cuenta BIGINT,
    valor_consignacion BIGINT
);


CREATE TABLE CUENTA (
    n_cuenta BIGINT PRIMARY KEY,
    cupo BIGINT,
    movimientos VARCHAR(1000)
);


CREATE TABLE PRODUCTOS (
    id_producto BIGINT  PRIMARY KEY,
    decripcion VARCHAR(250),
    imagen_producto VARCHAR(1200),
    valor_producto BIGINT


);