import java.util.*;
class Area
{
  public static void main(String args[])
  {
      int a,b,c;
      float k;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      k=(float)(a+b+c)/2;
      double h=Math.sqrt(k*(k-a)*(k-b)*(k-c));
      System.out.format("%.2f",h);
     
   } 
}