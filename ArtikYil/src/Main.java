import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        boolean artikMi = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if(yil % 4 == 0 && (yil % 100 == 0 && yil % 400 == 0)) {
            artikMi = true;
        }

        if(artikMi) {
            System.out.println(yil + " bir artık yıldır!");
        } else{
            System.out.println(yil + " bir artık yıl değildir!");
        }
    }
}