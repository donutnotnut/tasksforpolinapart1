import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num1=new int[20];
        int[] num2=new int[20];
        for (int i=0; i<20;i++) {
            System.out.println("enter number");
            num1[i]= input.nextInt();
        }
        num2[0]=num1[19];
        for (int i=1; i<20; i++) {
            num2[i]=num1[i-1];
        }
        for (int i=0; i<20; i++) {
            System.out.println(num2[i]);
        }
    }
}
