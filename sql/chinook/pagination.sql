-- pagination
SELECT * FROM (SELECT  albumid, title, artistid, row_number() over (ORDER by title DESC) rn FROM album)
WHERE rn between 10 and 15 
ORDER BY rn;


SELECT  albumid, title, artistid, row_number() over (ORDER by title DESC) rn FROM album;