import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total marks out of 500");
        a = sc.nextInt();
        b=((a/500)*100);
        if(b>=80){
            System.out.println("A"+b);
        }
        else if (b>60&&b<80) {
            System.out.println("B"+b);
        }
        else if(b>50&&b<60){
            System.out.println("C"+b);
        }
        else if(b>45&&b<50){
            System.out.println("D"+b);
        }
        else if(b>25&&b<45){
            System.out.println("E"+b);
        }
        else{
            System.out.println("F"+b);
        }
}}