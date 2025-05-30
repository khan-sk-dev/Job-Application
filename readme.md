# 🚀 Job Application Platform

<div align="center">
    
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)](https://hibernate.org/)

</div>

<div align="center">
    
![GitHub last commit](https://img.shields.io/github/last-commit/khan-sk-dev/Job-Application)
![GitHub issues](https://img.shields.io/github/issues/khan-sk-dev/Job-Application)
![GitHub pull requests](https://img.shields.io/github/issues-pr/khan-sk-dev/Job-Application)
![GitHub License](https://img.shields.io/github/license/khan-sk-dev/Job-Application)

</div>

## 📋 Overview

This repository contains the monolithic version of the Job Application platform, a comprehensive system for managing job postings, company profiles, and user reviews. Built with Java and Spring Boot, this application provides a robust API for job seekers and employers alike.

<details>
<summary>📷 Screenshot Gallery</summary>
<br>

| Dashboard | Job Listings | Company Profile |
|:-------------------------:|:-------------------------:|:-------------------------:|
|<img src="/api/placeholder/800/400" alt="Dashboard"/>|<img src="/api/placeholder/800/400" alt="Job Listings"/>|<img src="/api/placeholder/800/400" alt="Company Profile"/>|

</details>

## ✨ Features

<table>
  <tr>
    <td>
      <h3>🔍 Job Management</h3>
      <ul>
        <li>Create, read, update, and delete job postings</li>
        <li>Advanced search functionality</li>
        <li>Filter by location, salary, and more</li>
      </ul>
    </td>
    <td>
      <h3>🏢 Company Profiles</h3>
      <ul>
        <li>Detailed company information</li>
        <li>Industry categorization</li>
        <li>Location-based searching</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>
      <h3>⭐ Review System</h3>
      <ul>
        <li>Rating and review functionality</li>
        <li>Feedback analysis</li>
        <li>Company response options</li>
      </ul>
    </td>
    <td>
      <h3>👤 User Accounts</h3>
      <ul>
        <li>Personalized dashboards</li>
        <li>Application tracking</li>
        <li>Profile management</li>
      </ul>
    </td>
  </tr>
</table>

## 🛠️ Technology Stack

```mermaid
graph TD
    A[Client] --> B[Spring MVC]
    B --> C[Service Layer]
    C --> D[Repository Layer]
    D --> E[MySQL Database]
    
    style A fill:#f9f,stroke:#333,stroke-width:2px
    style B fill:#bbf,stroke:#333,stroke-width:2px
    style C fill:#dfd,stroke:#333,stroke-width:2px
    style D fill:#fdd,stroke:#333,stroke-width:2px
    style E fill:#ddf,stroke:#333,stroke-width:2px
```

- **Backend**: Java 11, Spring Boot 2.7
- **ORM**: Hibernate, Spring Data JPA
- **Database**: MySQL 8.0
- **Build Tool**: Maven
- **Documentation**: Swagger/OpenAPI

## 🚀 Getting Started

### Prerequisites

- JDK 11 or higher
- Maven 3.6+
- MySQL 8.0+

### 📥 Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/khan-sk-dev/Job-Application.git
   cd Job-Application
   ```

2. **Configure database**

   Create a MySQL database and update `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/job_application_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and run**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the application**

   Open your browser and navigate to [http://localhost:8080](http://localhost:8080)

## 📚 API Documentation

### Job Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/jobs` | Get all jobs |
| GET | `/api/jobs/{id}` | Get job by ID |
| POST | `/api/jobs` | Create a new job |
| PUT | `/api/jobs/{id}` | Update a job |
| DELETE | `/api/jobs/{id}` | Delete a job |

<details>
<summary>Example Job Request/Response</summary>

**Request:**
```json
POST /api/jobs
{
    "title": "Senior Java Developer",
    "description": "We're looking for an experienced Java developer...",
    "company": "TechCorp",
    "location": "San Francisco, CA",
    "salary": 120000
}
```

**Response:**
```json
{
    "id": 1,
    "title": "Senior Java Developer",
    "description": "We're looking for an experienced Java developer...",
    "company": "TechCorp",
    "location": "San Francisco, CA",
    "salary": 120000,
    "createdAt": "2025-05-17T10:30:00"
}
```
</details>

### Company Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/companies` | Get all companies |
| GET | `/api/companies/{id}` | Get company by ID |
| POST | `/api/companies` | Create a new company |
| PUT | `/api/companies/{id}` | Update a company |
| DELETE | `/api/companies/{id}` | Delete a company |

### Review Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/reviews` | Get all reviews |
| GET | `/api/reviews/{id}` | Get review by ID |
| POST | `/api/reviews` | Create a new review |
| PUT | `/api/reviews/{id}` | Update a review |
| DELETE | `/api/reviews/{id}` | Delete a review |

## 📊 Project Structure

```
job-application/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── jobapp/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           └── JobAppApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── jobapp/
│                   └── JobAppApplicationTests.java
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## 🧪 Testing

Run unit tests with:

```bash
mvn test
```

Run integration tests with:

```bash
mvn verify
```

## 🚢 Deployment

### Docker

```bash
# Build the Docker image
docker build -t job-application:latest .

# Run the container
docker run -p 8080:8080 job-application:latest
```

### Kubernetes

```bash
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
```

## 📈 Future Enhancements

- [ ] Implement user authentication and authorization
- [ ] Add email notification system
- [ ] Develop a front-end client using React
- [ ] Migrate to microservices architecture
- [ ] Implement CI/CD pipeline

## 👥 Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

Please refer to our [contribution guidelines](CONTRIBUTING.md) for more details.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

Project Maintainer - [@khan-sk-dev](https://github.com/khan-sk-dev)

Project Link: [https://github.com/khan-sk-dev/Job-Application](https://github.com/khan-sk-dev/Job-Application)

---

<div align="center">
  <sub>Built with ❤️ by the Job Application Team</sub>
</div>
