package not_ortalama;

import java.util.Enumeration;

public class palindrom_Sayi {
    //palindrom ise true
    static boolean isPalindrom(int number){
        //is: sorgulama programlamın jargonudur
        int temp=number,revernumber=0,lastNumber;
        while(temp!=0) {
            lastNumber=temp%10;
            revernumber=(revernumber*10)*lastNumber;
            temp /=10;
        }
        if(number==revernumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int sayi=247;
        System.out.println(isPalindrom((sayi)));

    }
}
