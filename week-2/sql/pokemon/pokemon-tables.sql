CREATE SEQUENCE pokemon_users_id_seq;
CREATE TABLE pokemon_users (
    user_id INT PRIMARY KEY,
    username VARCHAR2(20) UNIQUE NOT NULL,
    password VARCHAR2(20) NOT NULL,
    role VARCHAR2(15) DEFAULT 'Trainer' NOT NULL 
);

DROP SEQUENCE pokemon_types_id_seq;
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
    pokemon_type_id INT REFERENCES pokemon_types(pokemon_types_id)
);

