import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double boy, kg, vke;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden girin: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu girin: ");
        kg = input.nextDouble();

        vke = kg / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + vke);
    }
}
