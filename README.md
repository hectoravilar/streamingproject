# 🎬 Java Streaming Service Backend

> **Content Management System & Recommendation Engine**

A robust backend system developed in **Java** designed to manage streaming media catalogs. This project implements core Object-Oriented Programming (OOP) principles to handle movies, series, and episodes, offering features such as total viewing time calculation and algorithmic content recommendations based on user ratings.

---

## 📋 Key Features

-   **Catalog Administration:** Centralized management for Movies and TV Series entities.
-   **Ratings Engine:** Logic for processing user reviews and calculating average ratings dynamically.
-   **Duration Calculator:** Aggregates total runtime across mixed media types (movies and multi-season series).
-   **Recommendation Algorithm:** Filters and suggests content based on quality classification tiers.
-   **Episode Tracking:** Detailed management of episode metadata and view counts.
-   **Collection Management:** Efficient handling of content lists using Java Collections (`ArrayList`).
-   **Automated Classification:** Logic to classify episodes based on total view metrics.

---

## 🏗️ Architecture

The project is structured to ensure separation of concerns, isolating models from business logic.

```text
src/project/java/hector/streaming/
├── modelos/
│   ├── Titulo.java          # Base Abstract Class for all media content
│   ├── Filme.java           # Concrete implementation for Movies
│   ├── Serie.java           # Concrete implementation for TV Series
│   ├── Episodio.java        # Episode model with view tracking
│   └── Principal.java       # Main entry point / Execution layer
└── calculos/
    ├── CalculadoraDeTempo.java  # Business Logic: Duration aggregation
    ├── Recomendacao.java        # Business Logic: Recommendation engine
    └── Classificavel.java       # Interface defining classification contracts
