package org.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Configure Spark
        port(8080);
        staticFiles.location("/public");  // Serve HTML from 'resources/public'

        // Simple API endpoint
        get("/hello", (req, res) -> "Hello from Java!");

        System.out.println("Server running: http://localhost:8080");
    }
}
