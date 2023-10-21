package not_ortalama;
import java.util.Scanner;

public class kdv_hesaplama {
        public static void main(String[] args) {
            //kullanıcıdan veri alıcam

            //miktar eğer 1000 tl den büyükse kdv oranı 0.18
            //ama miktar 0 ve 1000 arasındaysa kdv oranı 0.20 olacak

            double miktar, kdvOrani=0.8,kdvnew=2.0,kdvTutari,kdvlitutar;

            Scanner inp=new Scanner(System.in);
            System.out.print("Miktar Tutarınız :");
            miktar=inp.nextDouble();

            if(miktar <= 1000)
            {
                kdvOrani=kdvnew;
                kdvTutari=miktar*kdvOrani;
                kdvlitutar=miktar*kdvTutari;

                System.out.println(("KDV'siz fiyat:"+miktar));
                System.out.println(("KDV oranı:"+kdvOrani));
                System.out.println("KDV Tutarı:"+kdvTutari);
                System.out.println("KDV'li Tutarı: "+kdvlitutar);
            } else {
                kdvTutari=miktar*kdvOrani;
                kdvlitutar=miktar*kdvTutari;

                System.out.println(("KDV'siz fiyat:"+miktar));
                System.out.println(("KDV oranı:"+kdvOrani));
                System.out.println("KDV Tutarı:"+kdvTutari);
                System.out.println("KDV'li Tutarı: "+kdvlitutar);
            }

        }
}
