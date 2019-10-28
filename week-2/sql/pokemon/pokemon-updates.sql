UPDATE pokemon_users 
SET role = 'Trainer'
WHERE user_id = 3;

UPDATE pokemon_users 
SET role = 'Admin'
WHERE role = 'admin';