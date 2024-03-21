INSERT INTO products (name, price, description) VALUES
('SmartBoard', 500.00, 'Az Islenib, Ela veziyyetde'),
('ADA Squirrel', 0.00, 'Sahiblendirilir');

INSERT INTO users (username, name, surname, email, phone, date_of_birth) VALUES
('johndoe', 'John', 'Doe', 'johndoe@example.com', '555-0123', '1990-01-01'),
('janedoe', 'Jane', 'Doe', 'janedoe@example.com', '555-0456', '1992-02-02');


INSERT INTO user_product (user_id, product_id) VALUES
(1, 1),
(1, 2),
(2, 1);

