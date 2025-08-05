# Issue Tracker ORM - Spring Boot Project

This is a **Spring Boot** project for managing **Projects**, **Bugs**, and **Users** in an Issue Tracking System.  
The application uses **Spring Data JPA (Hibernate)** for ORM, **MySQL** (or any configured database) for persistence, and follows a clean layered architecture with **Controller**, **Service**, and **Repository** layers.

---

## 📂 Project Structure

```
Directory structure:
└── adrin-bershik-c-j-java-day11-proj1/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── requests.http
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── example/
    │   │   │           └── IssueTrackerORM/
    │   │   │               ├── IssueTrackerOrmApplication.java
    │   │   │               ├── controller/
    │   │   │               │   ├── BugController.java
    │   │   │               │   ├── ProjectController.java
    │   │   │               │   └── UserController.java
    │   │   │               ├── domain/
    │   │   │               │   ├── Bug.java
    │   │   │               │   ├── Project.java
    │   │   │               │   └── User.java
    │   │   │               ├── repository/
    │   │   │               │   ├── BugRepository.java
    │   │   │               │   ├── ProjectRepository.java
    │   │   │               │   └── UserRepository.java
    │   │   │               └── service/
    │   │   │                   ├── BugService.java
    │   │   │                   ├── ProjectService.java
    │   │   │                   ├── ProjectServiceImpl.java
    │   │   │                   ├── UserService.java
    │   │   │                   └── UserServiceImpl.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── example/
    │                   └── IssueTrackerORM/
    │                       └── IssueTrackerOrmApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties

```

---

## 🚀 Features

- Manage **Projects** (CRUD operations)
- Manage **Users** (CRUD operations)
- Track **Bugs** linked to Projects and Users
- Search and filter bugs/projects by different attributes
- Uses **Spring Boot**, **Spring Data JPA**, **Hibernate**
- REST API with JSON responses
- Uses a layered architecture for clean separation of concerns

---

## 🛠️ Technologies Used

- **Java 17** (or compatible version)
- **Spring Boot 3+**
- **Spring Data JPA (Hibernate)**
- **MySQL** (or any configured database)
- **Lombok** (for reducing boilerplate)
- **Maven** (build tool)
- **Postman / IntelliJ HTTP client** for testing

---

## ⚙️ Setup & Run Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Adrin-Bershik-C-J/java-day11-proj1.git
cd java-day11-proj1
