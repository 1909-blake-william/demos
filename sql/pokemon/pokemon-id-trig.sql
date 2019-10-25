CREATE OR REPLACE TRIGGER pokemon_id_trig
BEFORE INSERT OR UPDATE ON pokemon
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        SELECT pokemon_id_seq.nextval INTO :new.pokemon_id FROM dual;
    ELSIF UPDATING THEN
        SELECT :old.pokemon_id INTO :new.pokemon_id FROM dual;
    END IF;
END;