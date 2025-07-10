package org.example;

import static spark.Spark.*;

/**
 * Main application class for the Spark Java web server.
 */
public class App {
    /**
     * Entry point for the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        port(8080);
        staticFiles.location("/public");

        get("/hello", (req, res) -> "Hello from Java!");

        System.out.println("Server running: http://localhost:8080");
    }
}
