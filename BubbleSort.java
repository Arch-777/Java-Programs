import java.util.Scanner;
class BubbleSort 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        int[] a = new int [10];//array Declaration
        System.out.println("Enter Random Elements in array");
        for(int i=0;i<10;i++)//insertion of elements in array
        {
            a[i]=x.nextInt();
        }
        System.out.println("Array After Sorting");
        int n=a.length;
        for(int i=0; i<10;i++)//sorting elements in array
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<10;i++)//Display sorted array
        {
            System.out.println(a[i]);
        }
        x.close();
    }   
}