create database bd_zenhotel;
use bd_zenhotel;

CREATE TABLE paymentmethod(
	idpaymentmethod INT AUTO_INCREMENT PRIMARY KEY,
	paymentmethodname VARCHAR(20) NOT NULL);

INSERT INTO paymentmethod (paymentmethodname) VALUES
("Cash"),
("Credit Card"),
("Transfer");

CREATE TABLE paymentstatus(
	idpaymentstatus INT AUTO_INCREMENT PRIMARY KEY,
	paymentstatusname VARCHAR(20) NOT NULL);

INSERT INTO paymentstatus (paymentstatusname) VALUES
("Pending"),
("Paid"),
("Cancelled");

CREATE TABLE role(
	idrole INT AUTO_INCREMENT PRIMARY KEY,
	rolename VARCHAR(20) NOT NULL);

INSERT INTO role (rolename) VALUES
('Administrator'),
('Receptionist'),
('Supervisor');

CREATE TABLE roomtype(
	idroomtype INT AUTO_INCREMENT PRIMARY KEY,
	roomtypename VARCHAR(20) NOT NULL);

INSERT INTO roomtype (roomtypename) VALUES
('Single'),
('Double'),
('Suite');

CREATE TABLE customer(
	idcustomer INT AUTO_INCREMENT PRIMARY KEY,
	fatherlastname VARCHAR(30) NOT NULL,
    motherlastname VARCHAR(30) NOT NULL,
    firstname VARCHAR(30) NOT NULL,
    middlename VARCHAR(30) NOT NULL,
    dni VARCHAR(8) NOT NULL,
    phone VARCHAR(10) NOT NULL,
    email VARCHAR(100) NOT NULL);

INSERT INTO customer (fatherlastname, motherlastname, firstname, middlename, dni, phone, email) VALUES
('Gonzalez', 'Perez', 'Juan', 'Carlos', '12345678', '987654321', 'juan.gonzalez@example.com'),
('Martinez', 'Lopez', 'Maria', 'Elena', '23456789', '987654321', 'maria.martinez@example.com'),
('Sanchez', 'Rodriguez', 'Luis', 'Miguel', '34567890', '987654321', 'luis.sanchez@example.com'),
('Diaz', 'Garcia', 'Ana', 'Lucia', '45678901', '987654321', 'ana.diaz@example.com'),
('Morales', 'Fernandez', 'Carlos', 'Alberto', '56789012', '987654321', 'carlos.morales@example.com'),
('Ruiz', 'Hernandez', 'Pedro', 'Antonio', '67890123', '987654321', 'pedro.ruiz@example.com'),
('Fernandez', 'Martinez', 'Elena', 'Patricia', '78901234', '987654216', 'elena.fernandez@example.com'),
('Gomez', 'Perez', 'Raul', 'Javier', '89012345', '987654217', 'raul.gomez@example.com'),
('Castro', 'Lopez', 'Laura', 'Monica', '90123456', '987654328', 'laura.castro@example.com'),
('Vazquez', 'Garcia', 'Ricardo', 'Jose', '01234567', '987654319', 'ricardo.vazquez@example.com');

CREATE TABLE roomstatus(
idstatus INT AUTO_INCREMENT PRIMARY KEY, 
roomstatusname VARCHAR(30) NOT NULL);

INSERT INTO roomstatus (roomstatusname) VALUES
("Reserved"),
("Available"),
("Occupied"),
("Maintenance");

CREATE TABLE room(
	idroom INT AUTO_INCREMENT PRIMARY KEY,
    roomnum INT NOT NULL,
    price DOUBLE NOT NULL,
    roomdescription VARCHAR(200),
    idroomtype INT,
    idstatus INT,
    FOREIGN KEY (idroomtype) REFERENCES roomtype(idroomtype),
    FOREIGN KEY (idstatus) REFERENCES roomstatus(idstatus));
    
INSERT INTO room (roomnum, price, roomdescription, idroomtype, idstatus) VALUES
(101, 120.0, 'Habitación simple con vista al jardín', 1, 2),
(102, 150.0, 'Habitación doble con aire acondicionado', 2, 3),
(103, 200.0, 'Suite con jacuzzi y terraza', 3, 1),
(104, 120.0, 'Habitación simple cercana al ascensor', 1, 4),
(105, 150.0, 'Habitación doble con escritorio', 2, 2),
(106, 120.0, 'Habitación simple estándar', 1, 3),
(107, 200.0, 'Suite con vista al mar', 3, 3),
(108, 150.0, 'Habitación doble con balcón', 2, 2),
(109, 120.0, 'Habitación simple interior', 1, 1),
(110, 200.0, 'Suite ejecutiva de lujo', 3, 2);

CREATE TABLE employee (
    idemployee INT AUTO_INCREMENT PRIMARY KEY,
    employeecode CHAR(10) NOT NULL,
    fatherlastname VARCHAR(100) NOT NULL,
    motherlastname VARCHAR(100) NOT NULL,
    firstname VARCHAR(100) NOT NULL,
    middlename VARCHAR(100),
    dni VARCHAR(8) NOT NULL,
    phone VARCHAR(15),
    email VARCHAR(150),
    idrole INT,
	FOREIGN KEY (idrole) REFERENCES role(idrole));

INSERT INTO employee (employeecode, fatherlastname, motherlastname, firstname, middlename, dni, phone, email, idrole) VALUES
('EMP001', 'Gomez', 'Perez', 'Juan', 'Carlos', '12345678', '987654321', 'juan.gomez@example.com', 1),
('EMP002', 'Martinez', 'Lopez', 'Maria', 'Fernanda', '87654321', '912345678', 'maria.martinez@example.com', 2),
('EMP003', 'Torres', 'Diaz', 'Luis', NULL, '11223344', '923456789', 'luis.torres@example.com', 3),
('EMP004', 'Rojas', 'Gutierrez', 'Ana', 'Lucia', '55667788', '934567890', 'ana.rojas@example.com', 2),
('EMP005', 'Fernandez', 'Castro', 'Pedro', 'Antonio', '99887766', '945678901', 'pedro.fernandez@example.com', 2);

CREATE TABLE booking(
	idbooking INT PRIMARY KEY AUTO_INCREMENT,
    bookingdate DATE,
    checkindate DATE,
    checkoutdate DATE,
    idroom INT,
    idcustomer INT,
    FOREIGN KEY (idroom) REFERENCES room(idroom),
    FOREIGN KEY (idcustomer) REFERENCES customer(idcustomer));

INSERT INTO booking (bookingdate, checkindate, checkoutdate, idroom, idcustomer)
VALUES
('2025-04-01', '2025-04-05', '2025-04-10', 3, 6),
('2025-04-02', '2025-04-06', '2025-04-11', 2, 2),
('2025-04-03', '2025-04-07', '2025-04-12', 3, 3),
('2025-04-04', '2025-04-08', '2025-04-13', 4, 4),
('2025-04-05', '2025-04-09', '2025-04-14', 5, 5);

CREATE TABLE extraservice(
    idextraservice INT AUTO_INCREMENT PRIMARY KEY,
    extraservicename VARCHAR(100) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    description VARCHAR(250) NOT NULL);

INSERT INTO extraservice (extraservicename, price, description) VALUES
('Buffet Breakfast', 25.00, 'Includes a variety of fruits, juices, coffee, bakery items, and hot dishes.'),
('Room Service', 15.00, 'Delivery of food and drinks directly to the room.'),
('Spa and Massages', 50.00, 'Access to the spa with a 60-minute relaxing massage.'),
('Laundry', 10.00, 'Laundry and ironing service per garment.');

CREATE TABLE invoice (
    idinvoice INT AUTO_INCREMENT PRIMARY KEY,
    idbooking INT,
    idpaymentmethod INT,
    idpaymentstatus INT,
    idextraservice INT,
    amount DOUBLE,
    paymentdate DATE,
    FOREIGN KEY (idbooking) REFERENCES booking(idbooking),
    FOREIGN KEY (idpaymentmethod) REFERENCES paymentmethod(idpaymentmethod),
    FOREIGN KEY (idpaymentstatus) REFERENCES paymentstatus(idpaymentstatus),
    FOREIGN KEY (idextraservice) REFERENCES extraservice(idextraservice)
);

INSERT INTO invoice (idbooking, idpaymentmethod, idpaymentstatus, idextraservice, amount, paymentdate)
VALUES 
(1, 2, 1, 3, 150.50, '2025-04-10'),
(2, 1, 2, 2, 200.00, '2025-04-11'),
(3, 3, 1, 1, 120.75, '2025-04-12');
