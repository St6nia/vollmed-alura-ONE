# 🏥 Voll.med — API de Gestão Clínica

---

## 📌 Descrição

**Voll.med** é uma API REST desenvolvida em **Java com Spring Boot**, responsável pelo backend da aplicação de gestão clínica baseada no design do Figma.

A aplicação permite o gerenciamento completo de médicos, pacientes e agendamentos de consultas, seguindo boas práticas de arquitetura REST, validação de dados e persistência em banco relacional.

O sistema foi projetado para servir como base sólida para aplicações web e mobile, garantindo escalabilidade, organização e manutenibilidade do código.

---

## 🚀 Funcionalidades

- 👨‍⚕️ Cadastro de médicos
- ✏️ Atualização de dados de médicos
- ❌ Exclusão lógica de médicos
- 📋 Listagem de médicos com paginação

- 🧑‍💼 Cadastro de pacientes
- ✏️ Atualização de pacientes
- ❌ Exclusão lógica de pacientes
- 📅 Agendamento de consultas
- ❌ Cancelamento de consultas

- ✅ Validações de regras de negócio
- 📄 Paginação e ordenação de resultados
- 🔐 Tratamento de erros padronizado
- 🧾 Documentação automática da API

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Validation
- MySQL
- Maven
- Hibernate
- Lombok
- Flyway (migrations)
- Swagger / SpringDoc OpenAPI
- Git & GitHub

---

## 🏗️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas:

controller → service → repository → database


- **Controller** → Responsável pelos endpoints REST
- **Service** → Regras de negócio
- **Repository** → Comunicação com o banco via JPA
- **DTOs** → Transferência de dados
- **Entities** → Representação das tabelas do banco

---

## 📦 Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

- Java 17 ou superior
- MySQL 8+
- Maven
- Git
- IDE (IntelliJ, VS Code, Eclipse, etc.)

---

## 🗄️ Banco de Dados

Crie o banco no MySQL:

```sql
CREATE DATABASE vollmed;
