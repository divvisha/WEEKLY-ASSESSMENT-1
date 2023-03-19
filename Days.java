import java.util.Scanner;
3public class Days
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int month=s.nextInt();
        int year=s.nextInt();
        if((month==1)||(month==3)||(month==5)||(month==7)||month==8||month==10||month==12)
        {
            System.out.println("This month has 31 Days.");
        }
        else if((month==4)||(month==6)||(month==9)||(month==11))
        {
            System.out.println("This month has 30 Days.");
        }
        else
        {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            {
                System.out.println("This month has 29 Days.");
            }
            else
            {
                System.out.println("This month has 28 Days.");
            }
        }
    }
}