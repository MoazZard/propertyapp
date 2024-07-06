CREATE TABLE IF NOT EXISTS Property (
    propertyid INT NOT NULL,
    price INT NOT NULL,
    dateposted timestamp NOT NULL,
    propertytype VARCHAR(12) NOT NULL,
    marketingagent VARCHAR(250),
    PRIMARY KEY (propertyid)
);