public class task4 {
    static int [] numbers=new int[9];
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
    }
    public static void part1(){
        for (int i=0; i<9;i++) {
            numbers[i]=0;
        }
        for (int i=0; i<9;i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("end part1");
    }
    public static void part2(){
        for (int i=0; i<9;i++) {
            if (1%2!=0) {
                numbers[i]+=1;
            }
        }
        for (int i=0; i<9;i++) {
            System.out.println(numbers[i]);
        }
    }
    public static void part3(){
        for (int i=0; i<9;i++) {
            if (1%2==0) {
                numbers[i]+=2;
            }
        }
        for (int i=0; i<9;i++) {
            System.out.println(numbers[i]);
        }
    }
    public static void part4(){
        for (int i=0; i<9;i++) {
            if (1%3==0) {
                numbers[i]+=3;
            }
        }
        for (int i=0; i<9;i++) {
            System.out.println(numbers[i]);
        }
    }
}
