import java.util.Scanner;
public class Rhombus
{
    public static int rhombus(int p,int q)
    {
        return ((p*q)/2);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int dia1=s.nextInt();
        int dia2=s.nextInt();
        System.out.print("Area of Rhombus=");
        System.out.println(rhombus(dia1,dia2));
    }
}