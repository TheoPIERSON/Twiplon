CREATE TABLE Users(
   id_user SERIAL,
   username VARCHAR(50) ,
   password VARCHAR(50) ,
   firstname VARCHAR(50) ,
   lastname VARCHAR(50) ,
   datecreation DATE,
   PRIMARY KEY(id_user)
);

CREATE TABLE Post(
   idpost SERIAL,
   content VARCHAR(180) ,
   datecreation TIMESTAMP,
   id_user INTEGER NOT NULL,
   PRIMARY KEY(idpost),
   FOREIGN KEY(id_user) REFERENCES Users(id_user)
);

CREATE TABLE Likes(
   id_user INTEGER,
   idpost INTEGER,
   PRIMARY KEY(id_user, idpost),
   FOREIGN KEY(id_user) REFERENCES Users(id_user),
   FOREIGN KEY(idpost) REFERENCES Post(idpost)
);

CREATE TABLE Comment(
   id_user INTEGER,
   idpost INTEGER,
   text VARCHAR(50) ,
   datetime TIMESTAMP,
   PRIMARY KEY(id_user, idpost),
   FOREIGN KEY(id_user) REFERENCES Users(id_user),
   FOREIGN KEY(idpost) REFERENCES Post(idpost)
);