package ru.sayron.headsxhands.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface InputReader {
    default int readIntInput(int min, int max) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                if (input < min || input > max) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Repeat.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return input;
    }
}



