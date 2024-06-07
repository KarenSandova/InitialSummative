package com.example.exercise1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            System.out.println("The numbers are: " + i);
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            } else {
                System.out.println("The numbers are: " + i);
            }
        }
    }
}