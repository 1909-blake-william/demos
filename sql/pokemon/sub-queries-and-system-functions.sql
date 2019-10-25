SELECT * FROM pokemon
WHERE trainer = (SELECT user_id FROM pokemon_users WHERE username = 'Kris');

SELECT UPPER(pokemon_name), hp, pokemon_level FROM pokemon
WHERE trainer IN 
    (SELECT user_id FROM pokemon_users 
        WHERE username = 'Kris' OR UPPER(username) = UPPER('wyaTt'));

SELECT * FROM pokemon_users;

INSERT INTO pokemon (pokemon_id, pokemon_name, hp, pokemon_level, pokemon_type_id, trainer)
    VALUES (POKEMON_ID_SEQ.nextval, 'Charmander', 100, 10, 
    (SELECT pokemon_types_id FROM pokemon_types WHERE name = 'Fire')
    ,(SELECT user_id FROM pokemon_users WHERE username = 'wyatt'));
    
SELECT * FROM pokemon WHERE pokemon_level =     
(SELECT MAX(pokemon_level) FROM pokemon);


SELECT COUNT(pokemon_id) FROM pokemon;
-- find the average hp of pokemon belonging to trainers where the trainers pokemon
-- have an hp greater than 25
SELECT trainer, AVG(hp) FROM pokemon
WHERE trainer IS NOT NULL
GROUP BY trainer
HAVING AVG(hp) > 25;

-- find the count of pokemon by level
SELECT pokemon_level, COUNT(pokemon_level) c FROM pokemon
GROUP BY pokemon_level
ORDER BY c DESC;


