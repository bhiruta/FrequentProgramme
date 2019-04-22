package FrequentProgramme;

import javafx.util.converter.TimeStringConverter;

import java.sql.Time;
import java.time.temporal.Temporal;
import java.util.Scanner;
import java.util.Timer;

public abstract class ArmstrongNumber<armnumber, b> {


    private static Scanner sc;

    public static void main(String[] args) {

        int num, number, temp, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Amstrong Number");
        num = scanner.nextInt();
        scanner.close();
        number = num;


        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        if (total == num) {
            System.out.println(num + "is an Armstrong Number");

        } else {
            System.out.println(num + "is not an Armstrong Number");
        }
    }

}







