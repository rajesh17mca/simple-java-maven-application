package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello This is simnple Java application to test the Jenkins application by Printing mathematical table!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private void printTable(int number){
        for(int i=1;i<=10,i++){
            System.out.println(Integer.toString(number) + "*" + Integer.toString(i) + "=" + Integer.toString(i*number))
        }
    }

    private final String getMessage() {
        return message;
    }

}
