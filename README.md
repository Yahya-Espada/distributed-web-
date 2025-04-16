# 🚆 Microservices-Based Subscription Platform

A lightweight microservices project demonstrating a scalable architecture using **Spring Boot**, **Spring Cloud Gateway**, **Eureka Service Discovery**, and **Docker Compose**.

---

## 🧱 Project Structure

```
.
├── Gateway                    # Spring Cloud Gateway for routing
├── eureka                    # Eureka server for service discovery
├── subscriptionmicroservice  # Subscription CRUD microservice
├── docker-compose.yml        # Docker orchestration file
└── .gitignore
```

---

## 🚀 Technologies Used

- 🎯 **Spring Boot 3**
- ☁️ **Spring Cloud Gateway**
- 📡 **Eureka Discovery Server**
- 🐳 **Docker & Docker Compose**
- 🛢 **H2 In-Memory Database**
- ❤️ **Lombok** for cleaner code
- 🧪 **Postman** for testing endpoints

---

## 📦 Microservices Overview

### 🔁 Gateway
- Acts as an API Gateway using **Spring Cloud Gateway**
- Forwards requests to internal microservices

### 📍 Eureka Server
- Registers and manages service instances dynamically

### 📬 Subscription Microservice
- CRUD operations for managing user subscriptions
- Contains fields:
  - `id`
  - `userEmail`
  - `plan`
  - `active`
  - `startDate`
  - `endDate`

---

## 🐳 Running the Project with Docker

Make sure you have **Docker Desktop** installed and running.

### 🔧 Step 1: Build All Projects

```bash
./mvnw clean install
```

### 🧱 Step 2: Run via Docker Compose

```bash
docker-compose up --build
```

All microservices will be up and running:
- Eureka: `http://localhost:8761`
- Gateway: `http://localhost:8080`
- Subscription Service: `http://localhost:8080/subscriptions`

---

## 📮 Sample Endpoints (via Gateway)

| Method | Endpoint                           | Description                 |
|--------|------------------------------------|-----------------------------|
| GET    | `/subscriptions`                   | Get all subscriptions       |
| POST   | `/subscriptions`                   | Create a subscription       |
| GET    | `/subscriptions/{id}`              | Get a subscription by ID    |
| PUT    | `/subscriptions/{id}`              | Update a subscription       |
| DELETE | `/subscriptions/{id}`              | Delete a subscription       |

Test easily with [Postman](https://www.postman.com/) or any REST client.

---

## 🔭 Future Improvements

- 🐙 Docker Compose profiles for dev/prod
- ☸️ Kubernetes support for orchestration
- 🔁 CI/CD with GitHub Actions
- 🔗 Inter-service communication using **OpenFeign**
- 🔐 Keycloak integration for authentication

---

## 🧑‍💻 Author

[Yahya-Espada](https://github.com/Yahya-Espada)

---

## 📄 License

MIT License