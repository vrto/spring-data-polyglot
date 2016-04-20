drop table if EXISTS users;

CREATE TABLE users (
  id   INTEGER PRIMARY KEY auto_increment,
  name VARCHAR(30),
  surname VARCHAR(60),
  age INT
);

INSERT into users VALUES (1, 'Michal', 'Vrtiak', 27);