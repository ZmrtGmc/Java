package not_ortalama;

public class switch_case {
    public static void main(String[] args){
        int gun = 2;
        switch (gun) {
            case 6:
                System.out.println("Bugün cumartesi");
                break;
            case 7:
                System.out.println("Bugün pazar");
                break;
            default:
                System.out.println("Bugün hafta içi");
        }
        // Çıktısı "Bugün hafta içi"
    }
}
