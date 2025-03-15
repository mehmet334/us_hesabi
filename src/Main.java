import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir Taban Sayı giriniz: ");
        int tabansayi= scanner.nextInt();
        System.out.println("Bir Üs Sayı giriniz: ");
        int ussayi= scanner.nextInt();

        double deger=ushesabi(tabansayi,ussayi);
        System.out.println(tabansayi + "^" + ussayi + "=" + deger);
    }
    private static double ushesabi(int sayi,int us){
        if (us==0) return 1;
        if (us>0) return sayi *ushesabi(sayi,us-1);
        return 1.0 / ushesabi(sayi,-us);
    }
}