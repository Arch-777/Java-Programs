public class AddCO 
{
    int A,B,C,T1,T2;
    float A1,B1,T3;
        AddCO(int a, int b)
        {
            A=a;
            B=b;
            T1= A+B;
            System.out.println("Addition of two integers = "+T1);
        }
        AddCO(int a, int b, int c)
        {
            A=a;
            B=b;
            C=c;
            T2= A+B+C;
            System.out.println("Addition of three integers = "+T2);
        }
        AddCO(double a,double b)
        {
            A1=(float)a;
            B1=(float)b;
            T3=A1+B1;
            System.out.println("Addition of two float values = "+T3);
        }
        void distroy()
        {}
        public static void main(String[] args)
        {
            AddCO A1 = new AddCO(10,20);
            AddCO A2 = new AddCO(10,20,30);
            AddCO A3 = new AddCO(10.101,20.202);
            A1.distroy();
            A2.distroy();
            A3.distroy();
        }
}
