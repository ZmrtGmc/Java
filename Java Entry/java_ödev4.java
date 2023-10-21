package not_ortalama;

import java.util.Scanner;
public class java_ödev4 {
    static boolean z(int isPrime, int y) {
        if (y == 1 || y == 0) {
            return true;
        } else if (isPrime % y == 0) {
            return false;
        } else {
            return z(isPrime, y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int zmrt = input.nextInt();
        int y = zmrt - 1;
        if (z(zmrt, y) == true) {
            System.out.println(zmrt + " Asal Sayıdır.");
        } else {
            System.out.println(zmrt + " Asal Sayı Değildir.");
        }
    }
}
