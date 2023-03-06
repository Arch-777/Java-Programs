public class Area 
{
    int radius,length,breadth,side; 
    static final double pi =3.14;   
    Area(double r)
    {
        radius=(int)r;
        double Cir=pi*(radius*radius);
        System.out.println("Area of circle = "+Cir);
    } 
    Area(int s) 
    {
        side=s;
        int Squ=side*side;
        System.out.println("area of Square = "+Squ);
    }  
    Area(int l,int b)
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
        Area A1 = new Area(5.00);
        Area A2 = new Area(10);
        Area A3 = new Area(5,6);
        A1.distroy();
        A2.distroy();
        A3.distroy();
    }
}
