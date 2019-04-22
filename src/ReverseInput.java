import java.util.Scanner;

public class ReverseInput {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int Number, Reminder, Reverse =0;
        scanner = new Scanner(System.in);

        System.out.println("\n please enter any Number you want to Reverse : ");
        Number = scanner.nextInt();

        while (Number >0) {
            Reminder = Number % 10;
            Reverse = Reverse * 10 + Reminder;
            Number = Number / 10;
        }
        System.out.format("\n Reverse of entered number is = %d\n",Reverse);
        }
    }

