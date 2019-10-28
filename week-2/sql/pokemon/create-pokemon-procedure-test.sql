SET SERVEROUTPUT ON
DECLARE gen_id number;
BEGIN
    create_pokemon('Chansey', 500, 7, 1, 1, gen_id);
    dbms_output.put_line(gen_id);
END;
