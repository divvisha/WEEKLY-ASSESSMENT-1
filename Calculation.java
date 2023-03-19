import java.util.Scanner;
public class Calculation
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Sum of the input number:"+(a+b));
        System.out.println("Difference of the input number:"+(a-b));
        System.out.println("Product of the input number:"+(a*b));
        System.out.println("Quotient of the input number:"+(a/b));
        System.out.println("Remainder of the input number:"+(a%b));
    }
}