package Homework.Task_2;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sr_number = 0;
        int number_arr[];
        number_arr = new int[10];
        int i;
        int sum_positive = 0;
        int counter_positive = 0;
        int counter_negative = 0;
        System.out.println("Insert array elements: ");
        for (i = 0; i < 10; i++) {
            number_arr[i] = sc.nextInt();
        }
        System.out.println("Inserted array elements: ");
        for (i = 0; i < 10; i++) {
            System.out.print(" " + number_arr[i]);
        }
        int max = number_arr[0];
        for (i = 1; i < 10; i++) {
            max = Math.max(max, number_arr[i]);
        }
            System.out.println("");
            System.out.println("Maximum = " + max);
            for (i = 0; i < 10; i++) {
                if (number_arr[i] > 0)
                    counter_positive += 1;
            }
        for (i = 0; i < 10; i++) {
            if (number_arr[i] > 0)
            sum_positive += number_arr[i];
        }
            System.out.println("Number of positive numbers " + counter_positive);
            System.out.println("Sum of positive numbers " + sum_positive);
            for (i = 0; i < 10; i++) {
                if (number_arr[i] < 0)
                    counter_negative += 1;
            }
            System.out.println("Number of negative numbers " + counter_negative);
        }

    }

