CREATE TABLE product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255),
    product_details TEXT,
    product_price DECIMAL(19, 2),
    status BOOLEAN NOT NULL DEFAULT FALSE,
    created_at DATETIME,
    brand VARCHAR(255),
    avaliation DOUBLE NOT NULL DEFAULT 0.0,
    gender VARCHAR(50)
);

CREATE TABLE sneakers (
    id BIGINT PRIMARY KEY,
    sole VARCHAR(255),
    material VARCHAR(255),
    suitable_for VARCHAR(255),
    type VARCHAR(255),
    sneaker_closing VARCHAR(50),
    shaft_height VARCHAR(50),
    CONSTRAINT fk_sneaker_product FOREIGN KEY (id) REFERENCES product(id) ON DELETE CASCADE
);

CREATE TABLE product_variation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    color VARCHAR(100),
    size VARCHAR(50),
    quantity_in_stock INT NOT NULL DEFAULT 0,
    product_id BIGINT,
    CONSTRAINT fk_variation_product FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE CASCADE
);

CREATE INDEX idx_product_brand ON product(brand);
CREATE INDEX idx_product_name ON product(product_name);
CREATE INDEX idx_variation_product_id ON product_variation(product_id);