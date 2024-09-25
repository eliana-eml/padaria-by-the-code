# Padaria By The Code

## Descrição
**Padaria By The Code** é um sistema CRUD desenvolvido em Java Swing para gerenciar o caixa de uma padaria. O sistema oferece funcionalidades para o gerenciamento de produtos, clientes e pedidos, possibilitando o controle eficiente das operações da padaria, como estoque, vendas e registro de clientes.

## Funcionalidades

### **Gerenciamento de Produtos**
- **Cadastro de Produtos**: Adicione novos produtos ao sistema.
- **Edição de Produtos**: Atualize as informações dos produtos já cadastrados.
- **Exclusão de Produtos**: Remova produtos do sistema de forma simples.
- **Visualização de Produtos**: Consulte a lista de produtos cadastrados, com detalhes como preço e quantidade em estoque.

### **Gerenciamento de Clientes**
- **Cadastro de Clientes**: Registre novos clientes no sistema.
- **Edição de Clientes**: Atualize as informações de clientes existentes.
- **Exclusão de Clientes**: Exclua clientes do sistema.
- **Visualização de Clientes**: Veja a lista completa de clientes cadastrados, incluindo nome, telefone e endereço.

### **Gerenciamento de Pedidos**
- **Cadastro de Pedidos**: Registre novos pedidos feitos pelos clientes.
- **Visualização de Pedidos**: Acompanhe todos os pedidos realizados, com informações detalhadas sobre produtos, quantidades e valores.

### **Controle de Caixa**
- Visualize as vendas realizadas e gerencie o fluxo de caixa.

## Tecnologias Utilizadas
- **Java Swing**: Interface gráfica para interação com o usuário.
- **JDBC (Java Database Connectivity)**: Integração com banco de dados MySQL.
- **MySQL**: Banco de dados relacional utilizado para armazenar produtos, clientes e pedidos.
- **Maven**: Gerenciamento de dependências e automação de build do projeto.

## Instalação e Execução

1. Clone o repositório:
```bash
git clone https://github.com/eliana-eml/padaria-by-the-code.git
```
2. Navegue até o diretório do projeto:
```bash
cd padaria-by-the-code
```
3. Configure o banco de dados MySQL utilizando o arquivo schema.sql no diretório /resources.
4. Atualize o arquivo de configuração application.properties com as credenciais do seu banco de dados MySQL:
```properties
jdbc.url=jdbc:mysql://localhost:3306/padaria_by_the_code
jdbc.username=seu-usuario
jdbc.password=sua-senha
```
5. Compile e execute o projeto utilizando sua IDE Java (IntelliJ ou Eclipse recomendados).

## Como Usar
- Ao iniciar o sistema, você terá acesso ao painel principal, onde poderá gerenciar produtos, clientes e pedidos, além de visualizar o controle de caixa.
- Utilize o menu do sistema para navegar entre as diferentes funcionalidades.
## Imagens do Sistema

### Tela Principal
![image](https://github.com/user-attachments/assets/64841d6b-cb4f-475f-865c-828360f0a772)
### Tela de Cadastro de Clientes
![image](https://github.com/user-attachments/assets/3f556c1f-ddb5-4b09-a554-cd95f89bc638)
### Tela de Cadastro de Produtos
![image](https://github.com/user-attachments/assets/0c5931dd-0d75-48e8-9cb0-afc97ad2bb5e)
### Tela de Relatório
![image](https://github.com/user-attachments/assets/9131f5e9-e867-4631-b1f9-18c3b9f9fc8a)
### Tela de Relatório Analítico
![image](https://github.com/user-attachments/assets/942c4036-ba8f-4296-a285-569b40c143b8)
