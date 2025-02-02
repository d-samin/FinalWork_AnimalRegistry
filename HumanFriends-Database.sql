DROP DATABASE HumanFriends;
CREATE DATABASE HumanFriends;
USE HumanFriends;

CREATE TABLE Pets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    type ENUM('Dog', 'Cat', 'Hamster') NOT NULL,
    birth_date DATE NOT NULL,
    commands TEXT
);

CREATE TABLE PackAnimals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    type ENUM('Horse', 'Donkey', 'Camel') NOT NULL,
    birth_date DATE NOT NULL,
    commands TEXT
);


INSERT INTO Pets (name, type, birth_date, commands) VALUES
('Fido', 'Dog', '2020-01-01', 'Sit, Stay, Fetch'),
('Whiskers', 'Cat', '2019-05-15', 'Sit, Pounce'),
('Hammy', 'Hamster', '2021-03-10', 'Roll, Hide'),
('Buddy', 'Dog', '2018-12-10', 'Sit, Paw, Bark'),
('Smudge', 'Cat', '2020-02-20', 'Sit, Pounce, Scratch'),
('Peanut', 'Hamster', '2021-08-01', 'Roll, Spin'),
('Bella', 'Dog', '2019-11-11', 'Sit, Stay, Roll'),
('Oliver', 'Cat', '2020-06-30', 'Meow, Scratch, Jump');

INSERT INTO PackAnimals (name, type, birth_date, commands) VALUES
('Thunder', 'Horse', '2015-07-21', 'Trot, Canter, Gallop'),
('Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load'),
('Eeyore', 'Donkey', '2017-09-18', 'Walk, Carry Load, Bray'),
('Storm', 'Horse', '2014-05-05', 'Trot, Canter'),
('Dune', 'Camel', '2018-12-12', 'Walk, Sit'),
('Burro', 'Donkey', '2019-01-23', 'Walk, Bray, Kick'),
('Blaze', 'Horse', '2016-02-29', 'Trot, Jump, Gallop'),
('Sahara', 'Camel', '2015-08-14', 'Walk, Run');

DELETE FROM PackAnimals WHERE type = 'Camel';

CREATE TABLE HorsesAndDonkeys AS 
SELECT * FROM PackAnimals WHERE type IN ('Horse', 'Donkey');


CREATE TABLE YoungAnimals (
    id INT,
    name VARCHAR(50),
    type VARCHAR(50),
    birth_date DATE,
    commands TEXT,
    age_in_months INT
);

INSERT INTO YoungAnimals
SELECT id, name, type, birth_date, commands, 
       TIMESTAMPDIFF(MONTH, birth_date, CURDATE()) AS age_in_months
FROM Pets
WHERE TIMESTAMPDIFF(YEAR, birth_date, CURDATE()) BETWEEN 1 AND 3;

INSERT INTO YoungAnimals
SELECT id, name, type, birth_date, commands, 
       TIMESTAMPDIFF(MONTH, birth_date, CURDATE()) 
FROM PackAnimals
WHERE TIMESTAMPDIFF(YEAR, birth_date, CURDATE()) BETWEEN 1 AND 3;

CREATE TABLE AllAnimals AS 
SELECT * FROM Pets
UNION ALL
SELECT * FROM PackAnimals;

SELECT * FROM AllAnimals



