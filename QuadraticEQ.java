import java.lang.Math;
import java.util.Scanner;
public class QuadraticEQ 
{
    public static void main(String[] args)
    {
        Scanner X = new Scanner (System.in);
        System.out.println("Enter Value of a,b,c - ");
        double a = X.nextDouble();
        double b = X.nextDouble();
        double c = X.nextDouble();
        double x,y;
        double t=b*b-4*a*c;
        if(t>0)
        {
            x=(-b+ Math.sqrt(t))/(2*a);
            y=(-b- Math.sqrt(t))/(2*a);
            System.out.println(x);
            System.out.println(y);
        }
        else
        {
            Double real = -b / (2*a);
            Double img = Math.sqrt(-t) / (2*a);
            System.out.printf("\n  Roots Are unreal %.2f",real);
            System.out.printf("\n %.2f",img);
        }
        X.close();
    }   
}
