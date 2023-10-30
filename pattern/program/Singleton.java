package com.pattern.program;
public class Singleton {
    private static Singleton instance;

    private Singleton() {
       
    }

    
    public static Singleton getInstance() {
        if (instance == null) {
            
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and variables can be added here
    public void someMethod() {
        System.out.println("Some method of Singleton class");
    }
}

 class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singletonInstance = Singleton.getInstance();

        singletonInstance.someMethod();
    }
}

