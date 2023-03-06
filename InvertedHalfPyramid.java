import java.util.Scanner;
public class InvertedHalfPyramid {

   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter number of rows:: ");
      n = scan.nextInt();
      for (int i=1; i <= n; i++) 
      {
         // space
         for(int j=1; j <= n-i; j++)
         System.out.print(" ");

         // star
         for(int k=1; k <= i; k++)
         System.out.print("*");

         // new line
         System.out.println();
      }
      scan.close();
   }
}
