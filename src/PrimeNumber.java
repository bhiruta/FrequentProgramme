import java.util.Scanner;

import static javafx.scene.input.KeyCode.N;

public class PrimeNumber {
    private static Scanner sc;
    private static Object Number = 'i';
    private static Object is;
    private static boolean isprime;

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();


        System.out.println("please enter Input Number?");


        for (int i = 2; i<number; i++) {

            if (number / i * i == number){
                Object isPrime;
                isPrime = false;
                break;

            }
        }
        
        if (isprime) {
            System.out.println("Is not Prime Number");
        } else {
            System.out.println("Is Prime Number");
        }

    }




         }






