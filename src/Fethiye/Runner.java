package Fethiye;

import java.util.Scanner;

public class Runner extends Islemler{

    static Runner run=new Runner();

    public static void main(String[] args) {

       run.anaMenu();

    }

    public void anaMenu(){
        System.out.println("Gazi Mustafa Kemal Okuluna Hosgeldiniz");
        System.out.println("Hangi islemi yapmak istersiniz?");
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");

        Scanner input=new Scanner(System.in);

        String secim= input.next();

        switch (secim){
            case "1":
                kisiTuru="OGRENCI";
               islemMenusu();
                break;

            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;

            case "Q":
                cikis();
                break;

            default:
                System.out.println("Yanlis secim yaptin tekrar dene.");
                anaMenu();
                break;
        }

    }

    private void cikis() {
        System.out.println("bye bye");
    }

}
