import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double fArmut = 2.14, fElma = 3.67, fDomates = 1.11, fMuz = 0.95, fPatlican = 5.0, toplam;
        int kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo?: ");
        kgArmut = input.nextInt();

        System.out.print("Elma kaç kilo?: ");
        kgElma = input.nextInt();

        System.out.print("Domates kaç kilo?: ");
        kgDomates = input.nextInt();

        System.out.print("Muz kaç kilo?: ");
        kgMuz = input.nextInt();

        System.out.print("Patlıcan kaç kilo?: ");
        kgPatlican = input.nextInt();

        toplam = (kgArmut * fArmut) + (kgElma * fElma) + (kgDomates * fDomates) + (kgMuz * fMuz) + (kgPatlican * fPatlican);
        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
