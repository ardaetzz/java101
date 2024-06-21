import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        int uzunKare;
        Scanner sc = new Scanner(System.in);

        System.out.print("A -> ");
        a = sc.nextInt();

        System.out.print("B -> ");
        b = sc.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs =  " + c);

    }
}