# Assignment 1 — Builder Pattern

**Student:** Aida Yerbulat
**Course:** Software Design Patterns

## Project
Server Configuration Builder

## Description
This project demonstrates the Builder design pattern in Java.

The same construction steps are used to create two different representations:

1. `ServerConfiguration` object
2. Text summary of the server configuration

## Structure

- `ServerBuilder` — Builder interface
- `ServerConfigurationBuilder` — Concrete Builder that creates a `ServerConfiguration`
- `ServerSummaryBuilder` — Concrete Builder that creates a text representation
- `ServerDirector` — defines reusable server configurations
- `ServerConfiguration` — immutable Product
- `Main` — Client

## Example configurations

The Director provides two predefined configurations:

- Development Server
- Production Server

## Clean Code

The project demonstrates:

- descriptive names
- small functions
- single responsibility
- immutability
- validation
- fluent API
- avoidance of flag arguments

## Run

Run:

```bash
javac src/*.java
java -cp src Main


