public class MethodOverloading {
    int radius,length,breadth,side; 
    static final double pi =3.14;   
    void Area(double r)
    {
        radius=(int)r;
        double Cir=pi*(radius*radius);
        System.out.println("Area of circle = "+Cir);
    } 
    void Area(int s) 
    {
        side=s;
        int Squ=side*side;
        System.out.println("area of Square = "+Squ);
    }  
    void Area(int l,int b)
    {
        length=l;
        breadth=b;
        int Rec=length*breadth;
        System.out.println("Area of Rectangle = "+Rec);
    }
    void distroy()
    {}
    public static void main(String[] args)
    {
        MethodOverloading A1 = new MethodOverloading();
        A1.Area(5.00);
        A1.Area(10);
        A1.Area(5,6);
    }
    
}
