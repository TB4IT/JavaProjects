import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("kac deger gırıceksın : ");
        int sor = klavye.nextInt();

        double[] dizi = new double[sor];
        int toplam = 0;
        for (int i = 0; i < sor; i++) {
            System.out.print((i + 1) + " . sayıyı gir : ");
            dizi[i] = klavye.nextInt();
        }
        double ssapma = sapma(dizi);
        System.out.println("standart sapma :" + ssapma);
    }

    public static double sapma(double dizi[]) {
        double toplam=0;
        for (double eleman : dizi) {
            toplam += eleman;
        }
        System.out.println("sayı toplamı : " + toplam);
        double ortalama = toplam / dizi.length;
        System.out.println("ortalaması :" + ortalama);
        double sapma=0;
        double varyans=0;
        for (double num : dizi) {
            varyans +=( Math.pow(num -ortalama , 2));
        }
        System.out.println("varyans :"+varyans);

        double sap=varyans/(dizi.length-1);
        return Math.sqrt(sap );

    }
}






