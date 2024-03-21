INSERT INTO products (name, price, description) VALUES
('SmartBoard', 500.00, 'Az Islenib, Ela veziyyetde'),
('ADA Squirrel', 0.00, 'Sahiblendirilir');

INSERT INTO users (username, name, surname, email, phone, date_of_birth) VALUES
('koroglu', 'Kor', 'Oglu', 'dastan1@dede.qorqud', '000-0000', '2000-01-01'),
('tepegoz', 'Salam', 'Oglu', 'dastan2@dede.qorqud', '000-0000', '2000-01-01');


INSERT INTO user_product (user_id, product_id) VALUES
(1, 1),
(1, 2),
(2, 1);

