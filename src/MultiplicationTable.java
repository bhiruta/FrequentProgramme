public class MultiplicationTable {
    public static void main(String[]args){
        int row =1, col =1;
        int totalEntries = 'x' * 'x';
        for (int i =1; i<=totalEntries; i++)
        {
           System.out.println((row * col++) + "");
           if (i % 'x' ==0)
           {
               System.out.println();
               row++;
               col=1;

           }
        }
    }
}
