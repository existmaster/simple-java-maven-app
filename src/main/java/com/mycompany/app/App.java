package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";
    private String customMessage;

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return customMessage != null? customMessage : MESSAGE;
    }

    public void setMessage(String customMessage) {
        this.customMessage = customMessage;
    }
}
