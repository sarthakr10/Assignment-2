import java.util.Scanner;

public class ifelse7 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur no.");
        a = sc.nextInt();
        if(a>0){
            System.out.println(+a);}
        else{
            int value = Math.abs(a);
            System.out.println(+value);
            }

    }
}