-- ====================================================
-- SCRIPT DE INSERCIÓN DE DATOS PARA POSTGRESQL
-- Cada línea debe ser un statement SQL completo
-- ====================================================

-- Tabla: clasificacion
INSERT INTO clasificacion (grupo) VALUES ('Electrónicos');
INSERT INTO clasificacion (grupo) VALUES ('Ropa y Accesorios');
INSERT INTO clasificacion (grupo) VALUES ('Hogar y Jardín');
INSERT INTO clasificacion (grupo) VALUES ('Deportes y Recreación');
INSERT INTO clasificacion (grupo) VALUES ('Libros y Medios');
INSERT INTO clasificacion (grupo) VALUES ('Salud y Belleza');
INSERT INTO clasificacion (grupo) VALUES ('Automotriz');
INSERT INTO clasificacion (grupo) VALUES ('Juguetes y Juegos');
INSERT INTO clasificacion (grupo) VALUES ('Alimentos y Bebidas');
INSERT INTO clasificacion (grupo) VALUES ('Oficina y Papelería');

-- Tabla: competencia
INSERT INTO competencia (nombre, descripcion) VALUES ('Gestión de Ventas', 'Capacidad para manejar procesos de venta y atención al cliente');
INSERT INTO competencia (nombre, descripcion) VALUES ('Administración Financiera', 'Conocimientos en manejo de finanzas y contabilidad');
INSERT INTO competencia (nombre, descripcion) VALUES ('Gestión de Inventario', 'Control y administración de stock y productos');
INSERT INTO competencia (nombre, descripcion) VALUES ('Atención al Cliente', 'Habilidades para brindar excelente servicio al cliente');
INSERT INTO competencia (nombre, descripcion) VALUES ('Liderazgo de Equipos', 'Capacidad para dirigir y motivar equipos de trabajo');
INSERT INTO competencia (nombre, descripcion) VALUES ('Análisis de Datos', 'Interpretación y análisis de información empresarial');
INSERT INTO competencia (nombre, descripcion) VALUES ('Marketing Digital', 'Estrategias de promoción y marketing online');
INSERT INTO competencia (nombre, descripcion) VALUES ('Negociación Comercial', 'Habilidades para negociar con proveedores y clientes');
INSERT INTO competencia (nombre, descripcion) VALUES ('Gestión de Calidad', 'Control y mejora continua de procesos');
INSERT INTO competencia (nombre, descripcion) VALUES ('Planificación Estratégica', 'Desarrollo de planes y estrategias empresariales');

-- Tabla: proveedores
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('1234567890001', '0987654321', 'Ecuador', 'ventas@techworld.com', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('2345678901002', '0976543210', 'Ecuador', 'info@modafashion.ec', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('3456789012003', '0965432109', 'Ecuador', 'contacto@hogarplus.com', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('4567890123004', '0954321098', 'Ecuador', 'deportes@sportmax.ec', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('5678901234005', '0943210987', 'Ecuador', 'libros@educabooks.com', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('6789012345006', '0932109876', 'Ecuador', 'belleza@cosmeticspro.ec', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('7890123456007', '0921098765', 'Ecuador', 'auto@repuestosec.com', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('8901234567008', '0910987654', 'Ecuador', 'juguetes@toyland.ec', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('9012345678009', '0909876543', 'Ecuador', 'alimentos@freshfood.com', 'USD');
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES ('0123456789010', '0998765432', 'Ecuador', 'oficina@officemax.ec', 'USD');

-- Tabla: tipo_pago
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Efectivo', 'Pago en dinero físico');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Tarjeta de Crédito', 'Pago con tarjeta de crédito Visa/Mastercard');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Tarjeta de Débito', 'Pago con tarjeta de débito');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Transferencia Bancaria', 'Transferencia electrónica entre cuentas');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('PayPal', 'Pago a través de plataforma PayPal');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Cheque', 'Pago mediante cheque bancario');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Crédito Empresarial', 'Pago diferido para empresas');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Bitcoin', 'Pago con criptomoneda Bitcoin');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Yape', 'Pago mediante aplicación móvil Yape');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('PagoEfectivo', 'Pago en agentes autorizados');

-- Tabla: persona
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Juan Carlos', 'Pérez López', '1234567890', '0987654321', 'juan.perez@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('María Elena', 'García Rodríguez', '1234567891', '0976543210', 'maria.garcia@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Carlos Alberto', 'Martínez Silva', '1234567892', '0965432109', 'carlos.martinez@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Ana Sofía', 'López Herrera', '1234567893', '0954321098', 'ana.lopez@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Miguel Ángel', 'Rodríguez Vargas', '1234567894', '0943210987', 'miguel.rodriguez@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Laura Patricia', 'Hernández Castro', '1234567895', '0932109876', 'laura.hernandez@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Roberto Daniel', 'Morales Jiménez', '1234567896', '0921098765', 'roberto.morales@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Sandra Milena', 'Torres Ruiz', '1234567897', '0910987654', 'sandra.torres@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Diego Fernando', 'Ramírez Ortega', '1234567898', '0909876543', 'diego.ramirez@email.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES ('Paola Andrea', 'Vásquez Mendoza', '1234567899', '0998765432', 'paola.vasquez@email.com');

-- Tabla: rol
INSERT INTO rol (nombre, estado) VALUES ('Administrador', true);
INSERT INTO rol (nombre, estado) VALUES ('Gerente de Ventas', true);
INSERT INTO rol (nombre, estado) VALUES ('Vendedor', true);
INSERT INTO rol (nombre, estado) VALUES ('Cajero', true);
INSERT INTO rol (nombre, estado) VALUES ('Supervisor', true);
INSERT INTO rol (nombre, estado) VALUES ('Contador', true);
INSERT INTO rol (nombre, estado) VALUES ('Almacenista', true);
INSERT INTO rol (nombre, estado) VALUES ('Gerente General', true);
INSERT INTO rol (nombre, estado) VALUES ('Asistente Administrativo', true);
INSERT INTO rol (nombre, estado) VALUES ('Auditor', true);

-- Tabla: producto
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (50, 299.99, 'Unidad', 1, 1, true);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (30, 45.50, 'Unidad', 2, 2, true);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (25, 89.99, 'Unidad', 3, 3, true);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (40, 125.00, 'Unidad', 4, 4, true);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (60, 15.99, 'Unidad', 5, 5, false);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (35, 75.25, 'Unidad', 6, 6, true);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (20, 450.00, 'Unidad', 7, 7, true);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (45, 35.99, 'Unidad', 8, 8, true);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (100, 8.50, 'Kilogramo', 9, 9, false);
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES (80, 12.75, 'Unidad', 10, 10, true);

-- Tabla: usuario
INSERT INTO usuario (id_persona, "user", password) VALUES (1, 'jperez', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (2, 'mgarcia', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (3, 'cmartinez', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (4, 'alopez', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (5, 'mrodriguez', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (6, 'lhernandez', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (7, 'rmorales', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (8, 'storres', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (9, 'dramirez', '$2a$10$N9qo8uLOickgx2ZMRZoMye');
INSERT INTO usuario (id_persona, "user", password) VALUES (10, 'pvasquez', '$2a$10$N9qo8uLOickgx2ZMRZoMye');

-- Tabla: factura
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-001', 1, '2025-01-15', 1, 5.00, 294.99);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-002', 2, '2025-01-16', 2, 0.00, 45.50);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-003', 3, '2025-01-17', 1, 10.00, 79.99);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-004', 4, '2025-01-18', 3, 0.00, 125.00);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-005', 5, '2025-01-19', 1, 2.50, 13.49);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-006', 6, '2025-01-20', 2, 5.25, 70.00);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-007', 7, '2025-01-21', 4, 0.00, 450.00);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-008', 8, '2025-01-22', 1, 3.00, 32.99);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-009', 9, '2025-01-23', 2, 0.50, 8.00);
INSERT INTO factura (serie, id_persona, fecha, id_tipo_pago, descuento, total) VALUES ('F001-010', 10, '2025-01-24', 1, 1.25, 11.50);

-- Tabla: item_factura
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (1, 1, 1, 299.99, 299.99);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (2, 2, 1, 45.50, 45.50);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (3, 3, 1, 89.99, 89.99);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (4, 4, 1, 125.00, 125.00);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (5, 5, 1, 15.99, 15.99);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (6, 6, 1, 75.25, 75.25);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (7, 7, 1, 450.00, 450.00);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (8, 8, 1, 35.99, 35.99);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (9, 9, 1, 8.50, 8.50);
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES (10, 10, 1, 12.75, 12.75);

-- Tabla: rol_competencia (tabla intermedia)
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (1, 1);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (1, 2);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (1, 3);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (2, 1);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (2, 4);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (2, 7);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (3, 1);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (3, 4);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (4, 1);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (4, 2);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (5, 5);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (5, 9);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (6, 2);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (6, 6);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (7, 3);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (7, 9);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (8, 5);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (8, 10);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (9, 4);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (9, 6);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (10, 6);
INSERT INTO rol_competencia (id_rol, id_competencias) VALUES (10, 9);

-- Tabla: usuario_rol (tabla intermedia)
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 1);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (2, 2);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (3, 3);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (4, 4);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (5, 5);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (6, 6);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (7, 7);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (8, 8);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (9, 9);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (10, 10);