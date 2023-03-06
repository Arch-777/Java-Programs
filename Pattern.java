import java.util.Scanner;
public class Pattern 
{
 public static void main(String[] args)
 {
    Scanner X = new Scanner(System.in);  
    System.out.println("Enter A NUMBER TO PRINT PATTERN");
    int n = X.nextInt();
  for(int i=5;i>=n;i--)
  {
    for(int j=1;j<=i;j++)
    {
        System.out.print(" ");
        System.out.print("*");
    }
    System.out.print("\n");
  }
  X.close();
 }   
}
