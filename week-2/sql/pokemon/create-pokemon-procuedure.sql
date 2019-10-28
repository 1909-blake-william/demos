CREATE OR REPLACE PROCEDURE create_pokemon 
(poke_name IN varchar2,
poke_hp IN number,
poke_level IN number,
poke_type IN number,
trainer IN number,
generated_id OUT number)
IS
BEGIN
    INSERT INTO pokemon (pokemon_name, hp, pokemon_level, pokemon_type_id, trainer)
        VALUES (poke_name, poke_hp, poke_level, poke_type, trainer)
        RETURNING pokemon_id INTO generated_id;
END;