\c postgres
drop DATABASE enchere;
CREATE database enchere;
\c enchere

create sequence client_seq;
create SEQUENCE enchere_seq;
create SEQUENCE admin_seq;

create table Admin(
    admin_id VARCHAR(10) primary key default 'ADM'||nextval('admin_seq'),
    admin_email varchar(30) not null,
    admin_mdp VARCHAR(30) not null
);

create table client(
    client_id VARCHAR(10) PRIMARY KEY NOT NULL DEFAULT 'CLT'||nextval('client_seq'),
    client_email VARCHAR(30) not null,
    client_mdp VARCHAR(30) not null,
    client_name VARCHAR(30) not null,
    client_forname VARCHAR(30) not null,
    client_num VARCHAR(10),
    client_dtn date not null 
);

create table enchere(
    enchere_id VARCHAR(10) PRIMARY KEY NOT NULL DEFAULT'ENC'||nextval('enchere_seq'),
    enchere_name VARCHAR(30) not null,
    enchere_date DATETIME default CURRENT_TIMESTAMP,
    enchere_desc text,
    client_id_enchere VARCHAR(30) not null,
    enchere_prix_depart DOUBLE PRECISION not null,
    duree_id_enchere VARCHAR(20),
    enchere_status int DEFAULT '0'
);

create table commission(
    valeur DOUBLE PRECISION not null,
    date DATETIME default CURRENT_TIMESTAMP
);

create table duree(
    duree_id serial PRIMARY KEY,
    duree DOUBLE PRECISION not null
);

CREATE TABLE categorie(
    categorie_id serial PRIMARY key,
    label VARCHAR not null
);

CREATE TABLE catench(
    enchere_id_catench VARCHAR(10) not null,
    categorie_id_catench VARCHAR(10) not null
);

CREATE TABLE photo(
    ref_enchere_id VARCHAR(10) not null,
    photo_link VARCHAR(200) not null
);

CREATE TABLE proposition(
    client_id_prop VARCHAR not null,
    enchere_id_prop VARCHAR not null,
    rencherir DOUBLE PRECISION not null,
    prop_date date default CURRENT_TIMESTAMP 
);

CREATE TABLE transactions(
    client_id_trans VARCHAR(30) not null,
    trans_montant DOUBLE PRECISION not null,
    trans_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    trans_method VARCHAR(10) not null
);

create table recharge(
    client_id_recharge VARCHAR(30) not null,
    recharge_montant DOUBLE PRECISION not null,
    recharge_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    recharge_etat int DEFAULT '0'
);

alter table enchere 
add FOREIGN KEY client_id_enchere REFERENCES client(client_id),
add FOREIGN KEY duree_id_enchere REFERENCES duree(duree_id);

alter table catench
add FOREIGN KEY enchere_id_catench REFERENCES enchere(enchere_id),
add FOREIGN KEY categorie_id_catench REFERENCES categorie(categorie_id);

alter table photo
add FOREIGN KEY ref_enchere_id REFERENCES enchere(enchere_id);

alter TABLE proposition
add FOREIGN KEY client_id_prop REFERENCES client(client_id),
add FOREIGN KEY enchere_id_prop REFERENCES enchere(enchere_id);

alter table Transactions
add foreign KEY client_id_trans REFERENCES client(client_id);

alter TABLE recharge
add FOREIGN KEY client_id_recharge REFERENCES client(client_id);

create or replace VIEW portefeuille as
select sum(trans_montant) from transactions group by 








