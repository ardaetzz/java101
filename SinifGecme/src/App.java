import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, taban = 55, ortalama = 0, toplam = 0;
        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100) {
            notlar.add(mat);
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100) {
            notlar.add(fizik);
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if(turkce >= 0 && turkce <= 100) {
            notlar.add(turkce);
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100) {
            notlar.add(kimya);
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100) {
            notlar.add(muzik);
        }

        for(int i = 0; i < notlar.size(); i++) {
            toplam += notlar.get(i);
        }

        ortalama = toplam / 5;

        System.out.println(ortalama >= 55 ? "Başarıyla geçtiniz. (" + ortalama + ")" : "Sınıf tekrarı yapmalısınız. (" + ortalama + ")");

    }
}
