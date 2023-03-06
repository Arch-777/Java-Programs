import java.util.Scanner;
public class Array 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        int[] a = new int [10];
        for(int i=0;i<10;i++)
        {
            a[i]=x.nextInt();
        }
        System.out.println("Elements present in Array ");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
        x.close();
    }   
}
