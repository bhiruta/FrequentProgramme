import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        int main;
        {
            int number = 0, Positive =0, negative =0, zero =0;
            char choice = 0;
            do {
                System.out.println("Enter a number :");
                scanner("%d,&number");
                if (number> 0) {
                    Positive++;
                } else if (number < 0) {
                    negative++;
                } else {
                    zero++;
                }
                System.out.println("Do you want to continue(y/n)?");
                scanner("%c,&choice");
            }
            while (choice== 'y' || choice== 'Y');
            System.out.println("\n Positive numbers:%d\n negative numbers:%d\n zero numbers :%d");




                    }



                }





       


    private static void scanner(String s) {
    }

    private static void scanner(String s, String s1) {
    }
}
