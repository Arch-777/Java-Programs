import java.util.*;
public class NestedIF 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int a = 100;
        if(a==x)
        {
            System.out.println("Equal");
        } 
        else 
        {
            if(a>x)
            {
                System.out.println("Lesser");
            }
            else
            {
                System.out.println("Greater");
            }
        }
        sc.close();
    }    
}
