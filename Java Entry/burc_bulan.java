package not_ortalama;
import java.util.Scanner;
public class burc_bulan {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int ay,gun;
        System.out.print("Doğdunuz ay:");
        ay=inp.nextInt();
        System.out.print("Doğdunuz gün: ");
        gun=inp.nextInt();

        switch (ay){
            case 1:
                if(gun>=1 && gun<=31){
                    if(gun<22)
                    {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                    break;
                } else {
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
            case 2:
                if(gun>=1 && gun<=31){
                    if(gun<20)
                    {
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                    break;
                } else {
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
            default:
                System.out.println("Hatalı bir ay girdiniz!");
        }

    }
}
/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */
