import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, choice = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        username = input.nextLine();

        System.out.print("Şifre: ");
        password = input.nextLine();

        if(username.equals("admin")){
            if(password.equals("root")){
                System.out.println("Giriş başarılı");
            } else{
                System.out.print("Şifre hatalı! Yeni bir şifre belirlemek ister misiniz? (e/h):");
                choice = input.nextLine();
            }
        } else{
            System.out.println("Hatalı giriş!");
        }

        switch(choice){
            case "e":
                System.out.print("Yeni şifrenizi girin: ");
                password = input.nextLine();
                if(password.equals("root")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    break;
                } else{
                    System.out.println("Şifre oluşturuldu");
                }
                break;
        }
    }
}
