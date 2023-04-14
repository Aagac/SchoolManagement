package ahmet;

import java.util.Scanner;

import static ahmet.Islemler.kisiTuru;

public class Runner extends Islemler {
    static  Runner run=new Runner();
    public static void main(String[] args) {
        run.anaManu();


    }
    public void anaManu(){
        System.out.println("Gazi Mustafa Kemal Okulu na hosgeldiniz");
        System.out.println("hangi islemi yapmak istersiniz");
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t  ====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        Scanner input=new Scanner(System.in);
        String secim=input.next().toUpperCase();
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
                System.out.println("yanlis secim yaptin tekrar dene");
                anaManu();
        }
    }

    private void cikis() {
        System.out.println("bye bye");
    }

}
