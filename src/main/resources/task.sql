DROP DATABASE IF EXISTS interview_test;
CREATE DATABASE interview_test;
USE interview_test;

CREATE TABLE company
(
  id   INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL 
);
CREATE TABLE product
(
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  price INT NOT NULL,
  company_id INT NOT NULL,
  CONSTRAINT product_company_id_fk 
  FOREIGN KEY (company_id) REFERENCES company (id)
);

INSERT INTO company (name) VALUES ('Ubrainians');
INSERT INTO company (name) VALUES ('imCode');
INSERT INTO company (name) VALUES ('JetBrains');
INSERT INTO company (name) VALUES ('Microsoft');

INSERT INTO product (name, company_id, price) VALUES ('Platformus', 1, 2000);
INSERT INTO product (name, company_id, price) VALUES ('imCMS', 2, 1000);
INSERT INTO product (name, company_id, price) VALUES ('Streamflow', 2, 900);
INSERT INTO product (name, company_id, price) VALUES ('Intellij IDEA', 3, 800);
INSERT INTO product (name, company_id, price) VALUES ('Web Storm', 3, 700);
INSERT INTO product (name, company_id, price) VALUES ('Rider', 3, 600);
INSERT INTO product (name, company_id, price) VALUES ('Windows', 4, 500);
INSERT INTO product (name, company_id, price) VALUES ('Microsoft Office', 4, 400);
INSERT INTO product (name, company_id, price) VALUES ('Visual Studio', 4, 300);
INSERT INTO product (name, company_id, price) VALUES ('SQL Server', 4, 200);