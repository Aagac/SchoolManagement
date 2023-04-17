package sureyya;

import java.util.Scanner;

public class Runner extends Islemler {
    static Runner run = new Runner();

    public static void main(String[] args) {

        run.anaMenu();

    }

    public void anaMenu() {
        System.out.println("Ataturk Lisesi ne Hosgeldiniz");
        System.out.println("Hangi islemi secmek istersiniz");
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        Scanner input = new Scanner(System.in);
        String secim = input.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("yanlis secim tekrar deneyin");
                anaMenu();
                break;


        }
    }

    private void cikis() {
        System.out.println("gule gule");
    }

}
