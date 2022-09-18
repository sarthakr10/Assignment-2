import java.util.Scanner;

public class ifelse8 {
    public static void main(String[] args) {
        double a, b,percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total no. of class held");
        a = sc.nextInt();
        System.out.println("enter no. of class u attend");
        b = sc.nextInt();
        percentage=(b/a)*100;
        System.out.println("total %:"+percentage);
        if(percentage>75){
            System.out.println("ur allowed");
        }
        else{
            System.out.println("ur not allowed");
        }
    }
}