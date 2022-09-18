import java.util.Scanner;

    public class ifelse3 {
        public static void main(String[] args) {
            int quantity,x,a;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter quantity");

            quantity= sc.nextInt();
         a= quantity*100;
         if(a>1000){
             x=a-(a/10);
             System.out.println("total amount is"+x);
         }
         else{
             System.out.println("total amount is"+a);
         }
}}