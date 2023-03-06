import java.util.*;
public class Addition 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Numbers to Add");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Add= a + b;
        System.out.print("Addition of Two Numbers : ");
        System.out.println(Add); 
        sc.close();
    } 
}
