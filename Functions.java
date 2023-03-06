import java.util.Scanner;
public class Functions {
    public static void printmyname(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] args)
    {
        Scanner X = new Scanner(System.in);
        String name = X.next();
        printmyname(name);
        X.close();
    }
    
}
