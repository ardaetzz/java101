import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, muzik, turkce;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        int toplam = mat + fizik + kimya + tarih + muzik + turkce;
        double sonuc = toplam / 6;

        System.out.print("Notunuz: " + sonuc + "\n" + (sonuc >= 60 ? "Sınıfı geçiyorsunuz!" : "Malesef sınıf tekrarı yapmalısınız!"));
    }
}
