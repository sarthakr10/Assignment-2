import java.util.Scanner;

public class ifelse2 {
        public static void main(String[] args) {
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            a = sc.nextInt();
            System.out.println("enter number ");
            b =sc.nextInt();
            if(a>b){
                System.out.println("A is greater:"+a);
            }
            else{
                System.out.println("B is greatest:"+b);
            }
}}