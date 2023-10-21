package not_ortalama;

import java.util.Scanner;

public class vücut_kitle_indeksi {
    public static void main(String[] args) {
        //formül: kilo/boy*boy
        double kilo,boy,indeksi;
        String isim;
        Scanner inp=new Scanner(System.in);
        System.out.print("Adınızı Giriniz:");
        isim=inp.nextLine();
        System.out.print("Kilonuzu Giriniz:");
        kilo=inp.nextDouble();
        System.out.print("Boyunuzu(metre cinsinden) Giriniz:");
        boy=inp.nextDouble();
        indeksi=kilo/(boy*boy);
        System.out.println("----------------------------------------");
        System.out.println("Adınız: "+isim);
        System.out.println("Vücut Kitle İndeksiniz: "+indeksi);



    }
}
