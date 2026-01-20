# Lab1 C002 - REST API Application

## Overview

This is a Spring Boot REST API application demonstrating dependency injection with Employee and Address entities.

## Dependencies

All project dependencies are managed in `pom.xml`:

- **Spring Boot 3.2.5** - Application framework
- **spring-boot-starter-web** - Required for building REST APIs (`@RestController`, `@GetMapping`, `@PostMapping`, etc.)

## REST API

The application uses Spring Boot's REST API capabilities to expose HTTP endpoints for managing Employee and Address data.

### Controller

- `EmployeeController` - Handles REST endpoints for Employee operations

## Building & Running

```bash
mvn clean install
mvn spring-boot:run
```

## Java Version

Java 17

## Important Notes

### Java Configuration

⚠️ **Do NOT use Homebrew for Java configuration** - It stops working and causes issues. Use proper JDK installation instead.

### Project Structure

⚠️ **Make sure the `resources` folder exists** - Creating it manually doesn't work properly. The `src/main/resources` and `src/test/resources` directories must be set up correctly in the Maven project structure from the start.
