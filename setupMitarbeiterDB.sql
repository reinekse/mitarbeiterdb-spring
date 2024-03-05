CREATE DATABASE mitarbeiter;
USE mitarbeiter;

CREATE USER 'java_app'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'java_app'@'localhost';
FLUSH PRIVILEGES;

DROP TABLE personen;
DROP TABLE standorte;

CREATE TABLE standorte (
id INT NOT NULL AUTO_INCREMENT,
strasse VARCHAR(50),
hausnummer VARCHAR(6),
plz VARCHAR(6),
ort VARCHAR(50),
PRIMARY KEY(id)
);

INSERT INTO standorte VALUES
	(1, 'Lindenallee', '17-19', '24288', 'Duppelbach'),
	(2, 'Elisabethweg', '8', '24288', 'Duppelbach'),
	(3, 'Im Weißmoor', '27a', '24117', 'Ludwigsfehn')
;

CREATE TABLE personen (
id INT NOT NULL AUTO_INCREMENT,
nachname VARCHAR(50),
vorname VARCHAR(50),
geburtstag DATE,
abteilung VARCHAR(50),
standort_id INT,
anstellungstag DATE,
PRIMARY KEY(id),
FOREIGN KEY (standort_id) REFERENCES standorte(id)
);

INSERT INTO personen (nachname, vorname, geburtstag, abteilung, standort_id, anstellungstag) VALUES
				('Mönkeberg', 'Petra', '1967-03-17', 'E1', 1, '2019-02-01'),
				('Hildebrandt', 'Louis', '1997-04-12', 'E1', 1, '2020-04-01'),
				('Kowalski', 'Benedikt', '1972-01-13', 'E2', 1, '2010-05-01'),
				('Mahd-Lehmann', 'Claudia', '1969-03-18', 'E2', 1, '2012-03-01'),
				('Saleh', 'Muhammad', '1987-03-01', 'E2', 1, '2021-03-01'),
				('Petersen', 'Petra', '1971-12-07', 'A1', 2, '2005-08-01'),
				('Kulik', 'Nikita', '1992-05-01', 'A2', 2, '2019-02-01'),
				('Hermann', 'Michelle', '1989-08-05', 'A4', 2, '2015-07-01'),
				('Nguyen', 'Sarah', '2001-10-17', 'A1', 2, '2020-08-01'),
				('Pilatzki', 'Tomasz', '1974-03-31', 'E2', 1, '2017-11-01'),
				('Michaelis', 'Ronald', '1972-07-12', 'E1', 1, '2009-02-01'),
				('Leew', 'Mareike', '1987-04-22', 'A1', 1, '2015-08-01'),
				('Schnieders', 'Martin', '1981-09-11', 'C1', 3, '2023-05-01'),
				('Meyer-Friedrichsen', 'Julian', '1990-06-18', 'A2', 1, '2022-10-01');
