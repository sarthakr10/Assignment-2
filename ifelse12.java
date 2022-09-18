import java.util.Scanner;

public class ifelse12 {
    public static void main(String[] args) {


        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year%4==0){
            if(year%400==0&&year%100!=0){
                System.out.println("its a leap year");
            }
            else{
                System.out.println("its not a leap year");
            }
        }
        else{
            System.out.println("its not a leap year");
        }


    }
}