import java.util.*;
public class Table 
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number - ");
        int num = x.nextInt();
        System.out.println("table Of "+ num);
        for (int i = 1; i<=10;i++)
        {
            System.out.println(num*i);
        }
     x.close();
    }
}
