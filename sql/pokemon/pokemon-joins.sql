UPDATE pokemon SET pokemon_type_id = 1 WHERE pokemon_name = 'Brian';

INSERT INTO pokemon (pokemon_id, pokemon_name, hp, pokemon_level, pokemon_type_id, trainer)
    VALUES (POKEMON_ID_SEQ.nextval, 'Fire', 25, 5, 2, 3);

-- actual useful join
SELECT * FROM pokemon p
LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id);

SELECT * FROM pokemon p
LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id)
LEFT JOIN pokemon_users u ON (p.trainer = u.user_id);

SELECT * FROM pokemon p
LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id)
LEFT JOIN pokemon_resistances r USING (pokemon_type_id)
LEFT JOIN pokemon_types rt ON (r.resistance_id = rt.pokemon_types_id)
LEFT JOIN pokemon_weaknesses w USING (pokemon_type_id)
LEFT JOIN pokemon_types wt ON (w.weakness_id = wt.pokemon_types_id);


SELECT t.pokemon_types_id t_id, t.name t_name, resistance_id r_id, rt.name r_name, weakness_id w_id, wt.name w_name 
FROM pokemon_types t
LEFT JOIN pokemon_resistances r ON (t.pokemon_types_id = r.pokemon_type_id)
LEFT JOIN pokemon_types rt ON (r.resistance_id = rt.pokemon_types_id)
LEFT JOIN pokemon_weaknesses w USING (pokemon_type_id)
LEFT JOIN pokemon_types wt ON (w.weakness_id = wt.pokemon_types_id);

SELECT * FROM pokemon_resistances r 
LEFT JOIN pokemon_types t ON (t.pokemon_types_id = r.resistance_id)
WHERE pokemon_type_id = 1;
-- you don't have to join on fk -> pk relations
SELECT * FROM pokemon p 
INNER JOIN pokemon_types t ON (p.pokemon_name = t.name); 

-- Cross joins
SELECT * FROM pokemon CROSS JOIN pokemon_types;
SELECT * FROM pokemon, pokemon_types;