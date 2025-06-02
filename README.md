# 📚 Estudos de JPA e Hibernate 

Este repositório contém meus estudos e práticas sobre JPA (Java Persistence API) e Hibernate, com foco no domínio dos conceitos fundamentais de persistência de dados em Java. ###

A proposta é evoluir gradualmente:

✅ Começando por JPA puro.

✅ Depois explorando as especificidades do Hibernate como implementação.

✅ Mais tarde, estudando Spring, Spring Boot e Spring Data JPA.

## 🗂️ Estrutura do repositório

📂 jpa_hibernate_studies

├── 📂 jpa-basic

├── 📂 jpa-advanced

├── 📂 hibernate-basic

└── README.md

## 📂 jpa-basic

Estudos iniciais com JPA puro:

- Configuração com `persistence.xml`.  
- Criação de entidades (`@Entity`, `@Id`).  
- Operações CRUD utilizando `EntityManager`.  
- Relacionamentos básicos: `@OneToOne` e `@OneToMany`.  
- Geração automática de IDs.  
- Gerenciamento de transações.

## 📂 jpa-advanced

Tópicos mais avançados de JPA:  

- Relacionamentos complexos (`@ManyToMany`).  
- Consultas utilizando **JPQL**.  
- Utilização de **Named Queries**.  
- Exploração do ciclo de vida das entidades.  
- Controle de transações e rollback.

## 📂 hibernate-basic

Explorando o Hibernate diretamente, sem abstrações:

- Configuração com `hibernate.cfg.xml`.  
- Utilização de `SessionFactory` e `Session`.  
- Consultas com **HQL** (Hibernate Query Language).  
- Estratégias de `fetch` (`LAZY` vs `EAGER`).  
- Cache e performance.  
- Validações com **Hibernate Validator**.

## 🚀 Como Executar os Exemplos

1. Clone este repositório:

```bash
git clone https://github.com/DevSanttos/jpa_hibernate_studies.git
```

2. Importe o projeto na sua IDE favorita (Eclipse, IntelliJ ou NetBeans).

3. Execute a classe Main de cada módulo.

4. Confira os logs SQL no console para entender as operações realizadas.

### ➡️ Recomendo ativar a propriedade:

```bash
<property name="hibernate.show_sql" value="true"/>
```
Para visualizar as queries executadas.

## 🛠️ Tecnologias Utilizadas

* Java 17+

* JPA (Jakarta Persistence API)

* Hibernate ORM

* Banco de Dados: PostgreSQL

* Maven
  
---

### 🎯 Objetivos deste Repositório

✅ Consolidar o conhecimento prático em JPA e Hibernate.

✅ Criar um material de consulta e referência para o futuro.

✅ Evoluir para frameworks mais avançados como Spring Boot e Spring Data JPA com uma base sólida.

--- 

### 📌 Extensões Futuras

✅ Spring Framework (Inversão de Controle, Injeção de Dependências)

✅ Spring Boot

✅ Spring Data JPA

---

### 📫 Contato

<a href="https://www.linkedin.com/in/jonathan-santos-76a2a92b9/">Linkedin</a>

<a href="https://github.com/DevSanttos">Github</a>

✍️ Autor: Jonathan Rezende dos Santos
