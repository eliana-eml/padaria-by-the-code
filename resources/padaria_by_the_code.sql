CREATE DATABASE padaria_by_the_code;
USE padaria_by_the_code;

CREATE TABLE produtos (
	id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(50) NOT NULL,
    preco_unitario_produto DECIMAL(10,2) NOT NULL,
    qtd_estoque_produto INT NOT NULL
);

CREATE TABLE clientes (
	id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
    cpf_cliente VARCHAR(14) NOT NULL,
    data_nascimento_cliente DATE NOT NULL,
    genero_cliente VARCHAR(30) NOT NULL,
    estado_civil_cliente VARCHAR(30) NOT NULL,
    telefone_cliente VARCHAR(13) NOT NULL,
	email_cliente VARCHAR(100) NOT NULL,
    cep_cliente VARCHAR(9) NOT NULL,
    logradouro_cliente VARCHAR(100) NOT NULL,
    numero_cliente VARCHAR(8) NOT NULL,
    complemento_cliente VARCHAR(30) NOT NULL,
    bairro_cliente VARCHAR(30) NOT NULL,
    cidade_cliente VARCHAR(50) NOT NULL,
    uf_cliente CHAR(2) NOT NULL
);

CREATE TABLE vendas (
	id_venda INT AUTO_INCREMENT PRIMARY KEY,
    data_venda DATE NOT NULL,
    valor_total_venda DECIMAL(10,2) NOT NULL,
    id_cliente INT NOT NULL,
	CONSTRAINT fk_id_cliente FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente) ON DELETE CASCADE
);

CREATE TABLE item_venda (
	id_item_venda INT AUTO_INCREMENT PRIMARY KEY,
    id_venda INT NOT NULL,
    id_produto INT NOT NULL,
    qtd_produto INT NOT NULL,
    valor_unitario_item DECIMAL(10,2) NOT NULL,
    CONSTRAINT fk_id_venda FOREIGN KEY (id_venda) REFERENCES vendas(id_venda) ON DELETE CASCADE,
    CONSTRAINT fk_id_produto FOREIGN KEY (id_produto) REFERENCES produtos(id_produto) ON DELETE CASCADE
);
