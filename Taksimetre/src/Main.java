import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmPrice = 2.20, totalPrice;
        int km;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        totalPrice = (km * kmPrice) + 10;
        if(totalPrice < 20){
            totalPrice = 20 + 10;
        }

        System.out.println("Total Price: " + totalPrice);
    }
}