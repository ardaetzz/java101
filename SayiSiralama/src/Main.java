import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        ArrayList<Integer> sayilar = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        sayi1 = input.nextInt();
        sayilar.add(sayi1);

        System.out.print("2. Sayı: ");
        sayi2 = input.nextInt();
        sayilar.add(sayi2);

        System.out.print("3. Sayı: ");
        sayi3 = input.nextInt();
        sayilar.add(sayi3);

        Collections.sort(sayilar);
        System.out.println(sayilar);
    }
}
