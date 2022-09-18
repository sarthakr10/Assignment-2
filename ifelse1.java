import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        int len,bre;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        len= sc.nextInt();
        System.out.println("enter breath");
        bre=sc.nextInt();
        if(len==bre){
            System.out.println("square");
        }
        else{
            System.out.println("rectangle");
        }
    }
}
