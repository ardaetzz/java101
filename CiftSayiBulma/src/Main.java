/*
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        double ortalama = 0;
        ArrayList<Integer> sayilar = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 0; i <= sayi; i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
                sayilar.add(i);
            }
        }

        ortalama = (double) toplam / sayilar.size();
        for(int eleman : sayilar) {
            System.out.println(eleman);
        }
        System.out.println("ortalama : " + ortalama);
    }
}
