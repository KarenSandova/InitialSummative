package com.example.exercise_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the steps: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number - i; j++) {
                    System.out.print("  ");
                }
                System.out.print("_|");
                System.out.println();
            }

        } else if (number < 0 ) {
            for (int i = number; i <= 1; i++) {
                for (int j = number; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.print("|_");
                System.out.println();
            }
        } else if (number == 0 ) {
            System.out.println("__");
        }
    }
}

