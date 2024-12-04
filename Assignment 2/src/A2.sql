Create database ahmed64;
-- Create User table
CREATE TABLE "Users" (
                        userId SERIAL PRIMARY KEY,
                        Name VARCHAR(100) NOT NULL,
                        Email VARCHAR(100) NOT NULL UNIQUE,
                        Password VARCHAR(255) NOT NULL
);

-- Insert dummy data into User table
INSERT INTO "Users" (Name, Email, Password)
VALUES
    ('John Doe', 'johndoe@example.com', 'password123'),
    ('Jane Smith', 'janesmith@example.com', 'password456'),
    ('Mike Johnson', 'mikejohnson@example.com', 'password789'),
    ('Alice Brown', 'alicebrown@example.com', 'password101'),
    ('Tom Clark', 'tomclark@example.com', 'password202');
