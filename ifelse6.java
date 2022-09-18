import java.util.Scanner;

public class ifelse6 {
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b && a>c)
            System.out.println("a is oldest");
        if (b>a && b>c)
            System.out.println("b is oldest");
        if (c>b && a<c)
            System.out.println("c is oldest");
        if (a<b && a<c)
            System.out.println("a is youngest");
        if (b<a && b<c)
            System.out.println("b is youngest");
        if (c<a && c<b)
            System.out.println("c is youngest");




 }
}