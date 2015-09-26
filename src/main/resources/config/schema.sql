CREATE TABLE user (
  user_id int IDENTITY NOT NULL PRIMARY KEY,
  user_name varchar(32) DEFAULT NULL,
  email varchar(32) NOT NULL,
  user_password varchar(32) DEFAULT NULL
);

ALTER TABLE user ADD CONSTRAINT unique_email UNIQUE (email);