import java.util.Scanner;
public class Condition2 {
    public static void main(String[] args)
    {
        Scanner X = new Scanner(System.in);
        int date = X.nextInt();
        String result;
        result = (date == 23)?"Birthday" : "Nothing Special";
        System.out.println(result);
        X.close();
    }
    
}
