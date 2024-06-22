import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz(C°): ");
        heat = input.nextDouble();

        if(heat < 5){
            System.out.println("> Kayak yapabilirsiniz!");
        } else if(heat >= 5 && heat <= 25){
            if(heat <= 15){
                System.out.println("> Sinemaya gidebilirsiniz!");
            }
            if(heat >= 10){
                System.out.println("> Piknik yapabilirsiniz!");
            }
        } else if(heat > 25){
            System.out.println("> Yüzmeye gidebilirsiniz.");
        }
    }
}
