package not_ortalama;

import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        //değişken tanımalama
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfını tanımlıyoruz
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri alıyoruz
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        double ort=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamanız :"+ort);

        String durum= (ort>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        System.out.println(durum);


    }
}
