import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int r, merkezAci;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yarıçap girin: ");
        r = sc.nextInt();

        System.out.print("Alanı hesaplanacak parçanın merkez açısını girin: ");
        merkezAci = sc.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double parcaAlan = (pi * (r*r) * merkezAci) / 360;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Açısı verilen parçanın alanı: " + parcaAlan);
    }
}
