import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar : ");
        tutar = input.nextDouble();

        kdvOran = tutar >= 0 && tutar < 1000 ? kdvOran = 0.18 : 0.08;

        double kdvTutar = tutar * kdvOran;
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV'li Tutar : " + (tutar + kdvTutar));
    }
}