CREATE TABLE colaborador (
    id            INTEGER NOT NULL,
    nome          VARCHAR2(100) NOT NULL,
    email         VARCHAR2(100) NOT NULL,
    cpf           VARCHAR2(100) NOT NULL,
    especialidade VARCHAR2(100) NOT NULL,
    rua           VARCHAR2(100) NOT NULL,
    bairro        VARCHAR2(100) NOT NULL,
    cep           VARCHAR2(9) NOT NULL,
    complemento   VARCHAR2(100),
    numero        VARCHAR2(20),
    uf            CHAR(2) NOT NULL,
    cidade        VARCHAR2(100) NOT NULL
);

ALTER TABLE colaborador ADD CONSTRAINT colaborador_pk PRIMARY KEY ( id );