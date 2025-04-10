# 📦 Subscription Service Microservice

Ce projet fait partie d'une architecture **microservices** développée avec **Spring Boot**, et vise à gérer les **abonnements utilisateurs** dans une plateforme de voyage distribuée. Il est conçu pour être intégré à un système complet incluant :
- 🔍 **Eureka Server** pour le service discovery
- 🌐 **API Gateway** pour le routage centralisé
- 🐳 **Docker** pour la conteneurisation
- 🗄️ **H2 Database** (en mémoire) pour les tests

---

🧾 Fonctionnalités de subscription-service
🔄 CRUD complet sur les abonnements

🔍 Recherche par email utilisateur

✅ Activation / désactivation d’un abonnement

📅 Gestion des dates de début/fin
---


🚀 Lancer le Projet avec Docker
Assurez-vous d'avoir Docker Desktop installé.

1. Compiler tous les projets
   bash
   Copy
   Edit
   cd eureka-server && mvn clean install
   cd ../subscription-service && mvn clean install
   cd ../api-gateway && mvn clean install

2. Lancer l’ensemble via Docker Compose
   bash
   Copy
   Edit
   docker-compose up --build

Les services seront accessibles aux ports suivants :

Eureka: http://localhost:8761

Subscription: http://localhost:8081

API Gateway: http://localhost:8080



