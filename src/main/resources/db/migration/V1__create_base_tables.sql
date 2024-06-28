CREATE TABLE account
(
    id         UUID PRIMARY KEY,
    code       VARCHAR(20) UNIQUE NOT NULL,
    password   VARCHAR(255)       NOT NULL,
    deleted    BOOLEAN            NOT NULL DEFAULT FALSE,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

CREATE TABLE employee
(
    id             UUID PRIMARY KEY,
    name           VARCHAR(255)       NOT NULL,
    mother_name    VARCHAR(255),
    deleted        BOOLEAN            NOT NULL DEFAULT FALSE,
    rg             VARCHAR(9) UNIQUE  NOT NULL,
    cpf            VARCHAR(11) UNIQUE NOT NULL,
    birth_date     VARCHAR(10)        NOT NULL,
    civil_state    SMALLINT           NOT NULL,
    plan           VARCHAR(10)        NOT NULL,
    admission_date VARCHAR(10),
    validity_date  VARCHAR(10),
    registration   VARCHAR(8) UNIQUE,
    created_at     TIMESTAMP,
    updated_at     TIMESTAMP
);