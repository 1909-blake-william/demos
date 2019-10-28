DROP USER pokemon CASCADE;

CREATE USER pokemon
IDENTIFIED BY p4ssw0rd
DEFAULT TABLESPACE users
TEMPORARY TABLESPACE temp
QUOTA 10M ON users;

GRANT CONNECT TO pokemon;
GRANT RESOURCE TO pokemon;
GRANT CREATE SESSION TO pokemon;
GRANT CREATE TABLE TO pokemon;
GRANT CREATE VIEW TO pokemon;

conn pokemon/p4ssw0rd;

/************************************
Tables and sequences
************************************/

CREATE SEQUENCE pokemon_users_id_seq;
CREATE TABLE pokemon_users (
    user_id INT PRIMARY KEY,
    username VARCHAR2(20) UNIQUE NOT NULL,
    password VARCHAR2(20) NOT NULL,
    role VARCHAR2(15) DEFAULT 'Trainer' NOT NULL 
);

CREATE SEQUENCE pokemon_types_id_seq;
CREATE TABLE pokemon_types (
    pokemon_types_id INT PRIMARY KEY,
    name VARCHAR2(20) NOT NULL
);

CREATE SEQUENCE pokemon_id_seq;
CREATE TABLE pokemon (
    pokemon_id INT PRIMARY KEY,
    pokemon_name VARCHAR2(20) NOT NULL,
    hp INT NOT NULL,
    pokemon_level INT NOT NULL,
    pokemon_type_id INT REFERENCES pokemon_types(pokemon_types_id),
    trainer INT REFERENCES pokemon_users(user_id)
);

CREATE TABLE pokemon_weaknesses (
    pokemon_type_id INT REFERENCES pokemon_types(pokemon_types_id),
    weakness_id INT REFERENCES pokemon_types(pokemon_types_id),
    CONSTRAINT pk_pokemon_weakness PRIMARY KEY (pokemon_type_id, weakness_id)
);

CREATE TABLE pokemon_resistances (
    pokemon_type_id INT REFERENCES pokemon_types(pokemon_types_id),
    resistance_id INT REFERENCES pokemon_types(pokemon_types_id),
    CONSTRAINT pk_pokemon_resistance PRIMARY KEY (pokemon_type_id, resistance_id)
);

/*******************************************************
Data
*******************************************************/
INSERT INTO pokemon_users (user_id, username, password, role) 
    VALUES (POKEMON_USERS_ID_SEQ.nextval, 'btkruppa', 'pass', 'Admin');
    
INSERT INTO pokemon_users (user_id, username, password) 
    VALUES (POKEMON_USERS_ID_SEQ.nextval, 'Kris', 'pass');
    
INSERT INTO pokemon_users (user_id, username, password) 
    VALUES (POKEMON_USERS_ID_SEQ.nextval, 'Wyatt', 'pass');



INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Electric');
    
INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Water');

INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Dragon');

INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Fire');

INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Ice');

INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Fighting');

INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Normal');

INSERT INTO pokemon_types (pokemon_types_id, name) 
    VALUES (POKEMON_TYPES_ID_SEQ.nextval, 'Grass');



INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(1,2);

INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(1,3);

INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(1,4);

INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(1,5);

INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(2,2);

INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(3,2);

INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(4,2);

INSERT INTO pokemon_resistances (pokemon_type_id, resistance_id)
    VALUES(5,2);



INSERT INTO pokemon_weaknesses (pokemon_type_id, weakness_id)
    VALUES(1,1);

INSERT INTO pokemon_weaknesses (pokemon_type_id, weakness_id)
    VALUES(1,2);

INSERT INTO pokemon_weaknesses (pokemon_type_id, weakness_id)
    VALUES(1,3);

INSERT INTO pokemon_weaknesses (pokemon_type_id, weakness_id)
    VALUES(1,4);

INSERT INTO pokemon_weaknesses (pokemon_type_id, weakness_id)
    VALUES(2,2);

INSERT INTO pokemon_weaknesses (pokemon_type_id, weakness_id)
    VALUES(3,1);

INSERT INTO pokemon_weaknesses (pokemon_type_id, weakness_id)
    VALUES(5,4);



INSERT INTO pokemon (pokemon_id, pokemon_name, hp, pokemon_level, pokemon_type_id, trainer)
    VALUES (POKEMON_ID_SEQ.nextval, 'Squirtle', 25, 5, 2, 3);

INSERT INTO pokemon (pokemon_id, pokemon_name, hp, pokemon_level, pokemon_type_id, trainer)
    VALUES (POKEMON_ID_SEQ.nextval, 'Snorlax', 100, 10, 3, 2);
    
INSERT INTO pokemon (pokemon_id, pokemon_name, hp, pokemon_level, pokemon_type_id, trainer)
    VALUES (POKEMON_ID_SEQ.nextval, 'Potato', 1, 99, 4, 1);
    
INSERT INTO pokemon (pokemon_id, pokemon_name, hp, pokemon_level, pokemon_type_id)
    VALUES (POKEMON_ID_SEQ.nextval, 'Brian', 22, 1, 1);
    
INSERT INTO pokemon (pokemon_id, pokemon_name, hp, pokemon_level, pokemon_type_id, trainer)
    VALUES (POKEMON_ID_SEQ.nextval, 'Eevee', 10, 42, 3, 2);


commit;


