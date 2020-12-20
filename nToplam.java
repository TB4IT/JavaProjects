import java.util.Scanner;

public class nToplam {
    public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);
        System.out.println("sayı girin :");
        int q= klavye.nextInt();
        int y=yaz(q);
        double k = Topla(q);
        System.out.println("1 den ne kadar toplam :" + k);
        double ort=k/q;
        System.out.println("ortalama :"+ort);
        double sapma=Math.sqrt(ort);
        System.out.println("Standart sapma : "+sapma );

    }

    static int Topla(int sayi) {
        if (sayi == 1)

            return 1;

        else {

            return sayi + Topla(sayi - 1);

        }
    }


    static int yaz(int sayi) {
        if(sayi<0){
            return sayi;
        }
        if (sayi == 1)
            System.out.println(sayi);

        else {
            System.out.println(sayi);

        }
        return yaz(sayi - 1);

    }
}








