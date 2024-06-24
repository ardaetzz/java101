import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double normalTutar, yasIndirimi, yasIndirimOrani, indirimliTutar, biletIndirimi, toplamTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();
        normalTutar = mesafe * 0.10;

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        yasIndirimOrani = yas < 12 ? 0.50 : yas <= 24 ? 0.10 : yas >= 65 ? 0.30 : 1;
        yasIndirimi = normalTutar * yasIndirimOrani;
        indirimliTutar = yasIndirimOrani == 1 ? normalTutar : (normalTutar - yasIndirimi);

        System.out.print("Yolculuk tipini giriniz(1 => Tek Yön, 2=> Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();
        biletIndirimi = indirimliTutar * 0.20;

        if(yolculukTipi > 0 && yolculukTipi <= 2 && mesafe > 0 && yas >= 0) {
            toplamTutar = yolculukTipi == 1 ? indirimliTutar : (indirimliTutar - biletIndirimi) * 2;
            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        } else{
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
