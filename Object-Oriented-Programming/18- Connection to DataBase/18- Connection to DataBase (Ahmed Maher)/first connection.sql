CREATE DATABASE film_database;
USE film_database;



CREATE TABLE films (
    title VARCHAR(255) NOT NULL,
    release_year YEAR NOT NULL,
    genre VARCHAR(100),
    director VARCHAR(255),
    rating DECIMAL(2, 1)
);



INSERT INTO films (title, release_year, genre, director, rating)
VALUES
    ('The Dark Knight', 2008, 'Action', 'Christopher Nolan', 9.0),
    ('Interstellar', 2014, 'Science Fiction', 'Christopher Nolan', 8.6),
    ('Inception', 2010, 'Science Fiction', 'Christopher Nolan', 8.8),
    ('Memento', 2000, 'Thriller', 'Christopher Nolan', 8.4);


SELECT * FROM films;
