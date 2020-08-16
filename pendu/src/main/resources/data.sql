DROP TABLE IF EXISTS dictionnaire;
	 
CREATE TABLE dictionnaire (
	  mot VARCHAR(100) PRIMARY KEY
);


INSERT INTO dictionnaire (mot) VALUES
  ('programme'),
  ('lithosphere'),
  ('roquefort'),
  ('zygomatique'),
  ('volcan'),
  ('pantoufle'),
  ('test');
  
  CREATE TABLE partie (
  	id INTEGER PRIMARY KEY,
  	joueur1 INTEGER,
  	joueur2 INTEGER
  );
  
  CREATE TABLE joueur (
   id INTEGER PRIMARY KEY,
   nom VARCHAR(50),
   score INTEGER,
   essais INTEGER,
   mot_cherche VARCHAR(100),
   lettres_trouvees VARCHAR(100)
   }
  	