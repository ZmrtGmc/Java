package not_ortalama;
import java.util.Scanner;

public class kullanici_giriş {
    public static void main(String[] args) {

        String username,password;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        username=inp.nextLine();

        System.out.print("Şifreniz:");
        password=inp.nextLine();

        //kullancıı adı:zmrt şifre:java101

        if(username.equals("zmrt") && password.equals("java101") )
        {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Bilgileriniz Yanlış");
        }
    }
}