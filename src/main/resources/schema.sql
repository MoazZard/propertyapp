CREATE TABLE IF NOT EXISTS Property (
    property_id BIGSERIAL NOT NULL,
    price INT NOT NULL,
    date_posted timestamp NOT NULL,
    property_type VARCHAR(12) NOT NULL,
    marketing_agent VARCHAR(250),
    PRIMARY KEY (property_id)
);