DROP TABLE IF EXISTS customer;

CREATE TABLE IF NOT EXISTS customer (
    id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO customer (first_name, last_name, email)
VALUES ('Than', 'Nguyen', 'thannguyen@example.com'),
('John', 'Smith', 'johnsmith@example.com'),
('Alex', 'Mccarthy', 'alexmccarthy@example.com');