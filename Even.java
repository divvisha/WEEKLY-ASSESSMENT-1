public class Even
{
    public static void main(String[] args)
    {
        int a=20;
        System.out.print("Even numbers are\n");
        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                System.out.println(" " + i);
            }
        }
    }
}