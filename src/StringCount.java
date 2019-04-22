public class StringCount{
    private static Object gets;
    private static Object vowels;

    public static void main(String[]args){
        int main;
        {
            char string[] = new char[0];
            int i, vowels, consonants;
            i = vowels = consonants = 0;
            System.out.println("\n please enter any string :");
            gets(string);
            while (string[i] != 0)
            {
                if (string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u' || string[i] == 'A' || string[i] == 'E' ||
                        string[i] == 'I' || string[i] == 'O' || string[i] == 'U')

                {
                    vowels++;
                }
                 else
            consonants++;
        }
          System.out.println("\n number of vowels in this string =%d");

        System.out.println("\n number of consonants in this string = %d");

             }


    }







    private static void gets(char[] string) {
    }

}
