import java.util.Scanner;

public class task5 {
    static char [] chars=new char[30];
    static char checker;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter your letter");
        checker=input.next().charAt(0);
        start();
    }
    public static void start(){
        for (int i=0; i<30; i++) {
            System.out.println("enter number index= "+i);
            chars[i]=input.next().charAt(0);
        }
    compare();
    }
    public static void compare(){
        int firsttime=0;
        int counter = 0;
        for (int i=0; i<30; i++){
            if (chars[i]==checker) {
                System.out.println("found match at index "+i);
                counter++;
                if (counter==1)
                     firsttime=i;
            }
        }
                /*
        int counterr =0;
        while(counterr<30){
            if (chars[counterr]==checker) {
                System.out.println("found match at index "+i);
                counter++;
                if (counter==1)
                    firsttime=counterr;
            }
            counter++;
        }
         */
        if (counter!=0) {
            System.out.println(counter);
            System.out.println("first char at " + firsttime);
        }
        else
            System.out.println("no chars");

    }
}
