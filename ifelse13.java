import java.util.Scanner;

public class ifelse13 {
    public static void main(String[] args) {
        int age;
        char sex;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur age ");
        age = sc.nextInt();
        System.out.println("if ur male type M if women type F");
        sex = sc.next().charAt(0);
        if (sex == 'F'){
            System.out.println("Ull work in urban area");
        }
        if(sex == 'M'){
            if(age>=20&&age<40){
                System.out.println("Ucan work anywhere");
            } else if (age>=40&&age<=60) {
                System.out.println("Ull work in urban ");
            }
            else{
                System.out.println("u cant work");
            }
        }
    }
}