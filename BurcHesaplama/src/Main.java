import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğdunuz Ayı Girin(1-12): ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Günü Girin(1-31): ");
        day = input.nextInt();

        if(day >= 1 && day <= 31 && month >= 1 && month <= 12) {
            if(month == 1){
                if(day <= 21){
                    System.out.println("Oğlak Burcu");
                }
                if(day >= 22){
                    System.out.println("Kova Burcu");
                }
            }
            if(month == 2){
                if(day <= 19){
                    System.out.println("Kova Burcu");
                }
                if(day >= 20){
                    System.out.println("Balık Burcu");
                }
            }
            if(month == 3){
                if(day <= 20){
                    System.out.println("Balık Burcu");
                }
                if(day >= 21){
                    System.out.println("Koç Burcu");
                }
            }
            if(month == 4){
                if(day <= 20){
                    System.out.println("Koç Burcu");
                }
                if(day >= 21){
                    System.out.println("Boğa Burcu");
                }
            }
            if(month == 5){
                if(day <= 21){
                    System.out.println("Boğa Burcu");
                }
                if(day >= 22){
                    System.out.println("İkizler Burcu");
                }
            }
            if(month == 6){
                if(day <= 22){
                    System.out.println("İkizler Burcu");
                }
                if(day >= 23){
                    System.out.println("Yengeç Burcu");
                }
            }
            if(month == 7){
                if(day <= 22){
                    System.out.println("Yengeç Burcu");
                }
                if(day >= 23){
                    System.out.println("Aslan Burcu");
                }
            }
            if(month == 8){
                if(day <= 22){
                    System.out.println("Aslan Burcu");
                }
                if(day >= 23){
                    System.out.println("Başak Burcu");
                }
            }
            if(month == 9){
                if(day <= 22){
                    System.out.println("Başak Burcu");
                }
                if(day >= 23){
                    System.out.println("Terazi Burcu");
                }
            }
            if(month == 10){
                if(day <= 22){
                    System.out.println("Terazi Burcu");
                }
                if(day >= 23){
                    System.out.println("Akrep Burcu");
                }
            }
            if(month == 11){
                if(day <= 21){
                    System.out.println("Akrep Burcu");
                }
                if(day >= 22){
                    System.out.println("Yay Burcu");
                }
            }
            if(month == 12){
                if(day <= 21){
                    System.out.println("Yay Burcu");
                }
                if(day >= 22){
                    System.out.println("Oğlak Burcu");
                }
            }
        } else{
            System.out.print("Size verilen değerler arasında bir değer girmelisiniz.");
        }
    }
}
