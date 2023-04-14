package yildiz;

import java.util.Scanner;

import static yildiz.Islemler.kisiTuru;

public class Runner extends Islemler {
   static Runner run=new Runner() ;
    public static void main(String[] args) {

    run.anaMenu();

    }


    public  void anaMenu(){
        System.out.println("Gazi Mustafa Kemal Okulu'na Hosgeldiniz");
        System.out.println("Hangi islemi yapmak istersiniz");
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        Scanner input=new Scanner(System.in);
        String secim= input.next().toUpperCase();
        switch (secim){
            case"1":
                kisiTuru="Ogrenci";
                islemMenusu();
                break;
            case "2":
                kisiTuru="Ogretmen";
                islemMenusu();
                break;
            case "Q" :
                //cikis();
                break;
            default:
                System.out.println("yanlis secim yaptin tekrar dene");
                anaMenu();
                break;
        }






    }
}
