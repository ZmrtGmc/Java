package not_ortalama;
import java.util.Scanner;
public class java_odev3 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int adet,sayi,buyuk=0,kucuk=0;
        System.out.print("Kaç tane sayı gireceksiniz:");
        adet=inp.nextInt();
        for(int i=1;i<=adet;i++){
            System.out.print(i+" Sayıyı Giriniz:");
            sayi = inp.nextInt();
            if(i==1){
                buyuk=sayi;
                kucuk=sayi;
            }else{
                if(buyuk<sayi){
                    buyuk=sayi;
                }else if(kucuk>sayi){
                    kucuk=sayi;
                }
            }
        }
        System.out.println("Girilen En Büyük Sayi: "+buyuk);
        System.out.println("Girilen En Küçük Sayi: "+kucuk);
    }
}
