-- CREATE SEQUENCE customer_id_sequence;

CREATE TABLE customer(
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    email TEXT NOT NULL,
    age INT NOT NULL
);