DROP TABLE IF EXISTS SALES;
  
CREATE TABLE SALES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  product_name VARCHAR(250) NOT NULL,
  store_name VARCHAR(250) NOT NULL,
  city VARCHAR(250) DEFAULT NULL
);

INSERT INTO SALES (product_name, store_name, city) VALUES
  ('Printer', 'Samsung', 'Chennai'),
  ('Printer', 'Apple', 'Chennai'),
  ('Printer', 'Apple', 'Salem'),
  ('Phone', 'Samsung', 'Chennai'),
  ('Phone', 'Apple', 'Chennai'),
  ('Phone', 'Apple', 'Salem'),
  ('Printer', 'Samsung', 'Salem');