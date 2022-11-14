\c postgres

drop database tp_ws;
CREATE DATABASE tp_ws;

\c tp_ws

drop TABLE admin;
drop TABLE vehicule;
drop TABLE kilometrage;

CREATE TABLE admin(
    adminID serial PRIMARY KEY,
    adminNAME VARCHAR(30),
    adminEMAIL VARCHAR(30),
    adminMDP VARCHAR(30)
);

CREATE TABLE vehicule(
    vehiculeID serial PRIMARY KEY,
    vehiculeMARK VARCHAR(30),
    vehiculeMODEL VARCHAR(30)
);

CREATE TABLE kilometrage(
    kilometrageID SERIAL PRIMARY KEY,
    vehiculeID int,
    kilometrageDATE DATE,
    kilometrageDEBUT DOUBLE PRECISION,
    kilometrageFIN DOUBLE PRECISION
);

ALTER TABLE kilometrage
ADD FOREIGN KEY (vehiculeID) REFERENCES vehicule(vehiculeID);

INSERT into admin (adminNAME,adminEMAIL,adminMDP) VALUES ('admin','admin','admin');