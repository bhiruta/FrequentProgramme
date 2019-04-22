import java.util.Scanner;

public class DigitNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int main;

        {
            int number = 0, Reminder = 0, product;

            System.out.println("\n please enter any number :");
            scanner("%d", "number");

            for (product = 1; number > 0; number = number / 10)
                Reminder = number % 10;
            product = product * Reminder;
        }
        System.out.println("\n The product of digits of a given number = %d, Product");


    }

    private static void scanner(String s, String number) {
    }
}
