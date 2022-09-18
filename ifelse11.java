import java.util.Scanner;

public class ifelse11 {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        c= sc.next().charAt(0);
        if(c>='A'&&c<='Z'){
            System.out.println("its a upper case");
        } else if (c>='a'&&c<='z') {
            System.out.println("its a lower case");
        }
        else{
            System.out.println("its not alphabate");
        }
    }
}