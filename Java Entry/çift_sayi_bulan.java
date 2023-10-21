package not_ortalama;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class çift_sayi_bulan {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int z;

        System.out.print("Sayi Giriniz:");
        z=inp.nextInt();

        for (int i=1;i<z;i++){
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }

}
