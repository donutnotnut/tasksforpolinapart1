import java.util.Scanner;

public class task1 {
    public static void main(String[] args)
    {
        int [] first;
        first=new int [6];
        kelet(first);
        pelet(first);
    }
    public static void kelet( int [] x)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0; i<6; i++)
        {
            System.out.println("enter item "+i);
            x[i]=input.nextInt();
        }
    }
    public static void pelet(int [] ar)
    {
        System.out.println("The numbers in array:");
        for(int i=0; i<6; i++)
            System.out.println("item number "+i+" is "+ar[i]);
    }

}
