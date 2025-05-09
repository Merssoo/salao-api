-- Criação da sequência para o campo id
CREATE SEQUENCE seq_feedback
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

-- Criação da tabela user_feedback
CREATE TABLE user_feedback (
    id BIGINT PRIMARY KEY DEFAULT nextval('seq_feedback'),
    mesage VARCHAR NOT NULL,
    user_name VARCHAR NOT NULL
);

-- Definindo o comportamento da sequência (associar o campo id à sequência)
ALTER SEQUENCE seq_feedback OWNED BY user_feedback.id;
