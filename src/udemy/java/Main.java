package udemy.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count);

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                count ++;
            } else {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of these ten numbers equals " + sum);
        scanner.close();



    }

}
