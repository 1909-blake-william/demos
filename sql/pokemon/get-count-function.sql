CREATE OR REPLACE FUNCTION get_number_pokemon ( username_input IN varchar2)
RETURN number -- return type
IS 
-- we can define our own local variables
number_pokemon number;
BEGIN
    SELECT COUNT(pokemon_id) INTO number_pokemon FROM pokemon
        INNER JOIN pokemon_users ON (trainer = user_id)
        WHERE username = username_input;
    RETURN number_pokemon;
END;

