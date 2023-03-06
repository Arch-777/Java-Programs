import java.util.Scanner;
public class Project 
{
    static int bjp=0,congress=0,aap=0,bsp=0,nota=0;
    static float p1,p2,p3,p4,p5,total;
    static float[] a= new float[4];
    static int i;
    public static void ElectionResult()
    {
        //int wonByVote;
        if (bjp > congress && bjp > aap && bjp > bsp && bjp > nota)
        {
            System.out.print("\n** BJP won the election **\n");
        }
        else if (congress > aap && congress > bsp)
        {
            System.out.print("\n** Congress won the election **\n");
        }
        else if (aap > bsp)
        {
            System.out.print("\n** AAP won the election** \n");
        }
        else if(nota >bsp )
        {
          System.out.print("\n* No one won the election *\n");
        }
        else if(bjp == congress && bjp == aap && bjp == bsp && bjp == nota)
        {
            System.out.print("\n* No one won the election *\n");
        }
        else
        {
          System.out.print("\n** BSP won the election **\n");
        } 
    }
    public static void CalculateVote(int vote)
    {
        switch(vote)
        {
        case 1:    
                bjp+=1;
                break;
        case 2: 
                congress+=1;
                break;
        case 3:
                aap+=1;
                break;
        case 4:
                bsp+=1;
                break;
        case 5:
                nota+=1;
                break;
        }
    } 
    public static void percent()
    {
    a[0]=bjp;
    a[1]=congress;
    a[2]=aap;
    a[3]=bsp;
    a[4]=nota;
    total=bjp+congress+aap+bsp+nota;
    p1=(a[0]*100)/total;
    p2=(a[1]*100)/total;
    p3=(a[2]*100)/total;
    p4=(a[3]*100)/total;
    p5=(a[4]*100)/total;
    System.out.print("\n BJP      =%.2f %"+p1);
    System.out.print("\n Congress =%.2f %"+p2);
    System.out.print("\n AAP      =%.2f %"+p3);
    System.out.print("\n BSP      =%.2f %"+p4);
    System.out.print("\n NOTA     =%.2f %"+p5);
    }
    public static void main(String args[])
    {
        int choose;
        Scanner X = new Scanner(System.in);
        do{
            System.out.print("*********Welcome to the simple voting system project*********\n");
            System.out.print("|       press 1.BJP             |       press 2.Congress    |\n");
            System.out.print("|       press 3.APP             |       press 4.BSP         |\n");
            System.out.print("|                        press 5 for NOTA                   |\n");
            System.out.print("|                      |press 6 for display|                |\n");
            System.out.println("Please enter the selection");
            choose = X.nextInt();
            if(choose==6)
            {
                ElectionResult();
                percent();  
            }
            else
            {
                CalculateVote(choose);
            }
        }while(choose!=6);
        X.close();

    }
}
