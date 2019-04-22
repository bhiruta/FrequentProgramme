import java.io.InputStream;
import java.util.Scanner;

public class FibonacciNumber {
    private static Object Number;

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Number = scanner.nextInt();
        int main;
        int number = 0, Next, i, First_Value =0, Second_Value = 1;
        System.out.println("\n please enter the range Number :");
        Scanner scanner1 = new Scanner((InputStream) Number,"%d");
        /* find & displaying Fibonacci series */
        for (i=0; i<=number ;i++)
        {
            if (i <=1) {
                Next = i;
            }
            else
            {
                Next =First_Value + Second_Value;
                First_Value=Second_Value;
                Second_Value= Next;
            }
            System.out.println("is a Fibonacc Number");
        }


        }

    }
