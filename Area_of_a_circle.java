import java.util.*;
class circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a;
        float b;
        double p=3.14;
        a=sc.nextInt();
        b=(float)(p*a*a);
       System.out.format("%.2f",b);
    }
}