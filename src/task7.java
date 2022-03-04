import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num1=new int[20];
        int[] num2=new int[20];
        for (int i=0; i<20;i++) {
            System.out.println("enter char");
            num1[i]= input.next().charAt(0);
        }
        left(num1,num2);

    }
    public static void left(int[] num1 ,int[] num2){
        num2[19]=num1[0];
        for (int i=0; i<19; i++) {
            num2[i]=num1[i+1];
        }
        for (int i=0; i<20; i++) {
            System.out.println(num2[i]);
        }
    }
}
