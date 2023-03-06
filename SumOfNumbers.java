import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args)
    {
        Scanner x = new Scanner (System.in);
        int sum = 0;
        int n = x.nextInt();
        for(int i =0;i<=n; i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        x.close();
    }
    
}
