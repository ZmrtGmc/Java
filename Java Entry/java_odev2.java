package not_ortalama; //Zümrüt Gemici
import java.util.Scanner;
public class java_odev2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int km,yas;
        double normal_tutar,yas_dis,discount=1,tip_dis,toplam=0,tip,oran;
        System.out.print("Mesafeyi Giriniz:");
        km=inp.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas=inp.nextInt();
        System.out.print("Yolculuk Tipinizi Giriniz (1= Tek Yön,2= Gidiş-Dönüş): ");
        tip=inp.nextDouble();
        if(km>0 && yas>0 ){
            if( tip>0 && tip<3 ) {
                //tüm bilgiler istenilen aralıktaysa
                //yaş aralığına göre indirim
                normal_tutar = km * 0.10;
                if (yas <= 0 && yas <= 12) {
                    //12 yaşından küçükse %50 indiirm
                    yas_dis = normal_tutar * 0.50;
                    discount = normal_tutar - yas_dis;
                } else if (yas >= 12 && yas <= 24) {
                    //genç kısım %10 indirim
                    yas_dis = normal_tutar * 0.10;
                    discount = normal_tutar - yas_dis;
                } else if (yas >= 65) {
                    //yaşlı %30 indirim
                    yas_dis = normal_tutar * 0.30;
                    discount = normal_tutar - yas_dis;
                }//zümrüt gemici
                if (tip == 2) {
                    //gidiş-dönüş %20 indirim olacak
                    tip_dis = discount * 0.20;
                    toplam = (discount - tip_dis) * 2;
                    System.out.println("Toplam Tutar: " + toplam);
                } else {
                    //tek gidiş
                    System.out.println("Toplam Tutar: " + normal_tutar);
                }
            } else {
                System.out.println("Hatalı Giriş Yaptınız!");
            }
        } else{
            System.out.println("Hatalı Giriş Yaptınız!");
        }
    }
}

