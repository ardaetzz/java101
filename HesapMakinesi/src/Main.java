import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, choice, sonuc = 0;
        boolean isValid = false;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Girin: ");
        n1 = input.nextInt();

        System.out.print("2. Sayıyı Girin: ");
        n2 = input.nextInt();

        System.out.print("Bir işlem seçin (1:Toplama, 2:Çıkarma, 3:Çarpma, 4:Bölme)");
        choice = input.nextInt();

        switch(choice){
            case 1:
                sonuc = n1 + n2;
                isValid = true;
                break;
            case 2:
                sonuc = n1 - n2;
                isValid = true;
                break;
            case 3:
                sonuc = n1 * n2;
                isValid = true;
                break;
            case 4:
                sonuc = n1 / n2;
                isValid = true;
                break;
            default:
                System.out.println("Geçersiz bir işlem girdiniz!");
                isValid = false;
                break;
        }

        System.out.println(isValid ? "Sonuç = " + sonuc : "");
        
    }
}
