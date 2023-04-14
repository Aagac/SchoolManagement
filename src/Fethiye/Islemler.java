package Fethiye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Fethiye.Runner.run;

public class Islemler {

    static Scanner scn=new Scanner(System.in);

    static String kisiTuru;

    static List< Kisi >ogrenciList=new ArrayList<>();
    static List< Kisi >ogretmenList=new ArrayList<>();

    public void islemMenusu(){

        System.out.println("Sectigin kisi turu "+kisiTuru+" ***"+ " Asagidaki islemlerden hangisini yapmak istersin?");
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n");

        int secilenIslem=scn.nextInt();

        switch (secilenIslem){
            case 1:
                ekleme();
                islemMenusu();

                break;

            case 2:
               // arama();
                islemMenusu();

                break;

            case 3:
               // listeleme();
                islemMenusu();

                break;

            case 4:
               // silme();
                islemMenusu();

                break;
            case 5:
                run.anaMenu();
                break;

            default:
                System.out.println("Yanlis tuslama yaptin tekrar dene.");
                islemMenusu();
                break;
        }



    }

    private void ekleme() {
        System.err.println("*** "+ kisiTuru + " *** ekleme sayfasina hosgeldiniz");
        scn.nextLine();

        System.out.println("adini gir");
        String adi=scn.nextLine();

        System.out.println("Soyadini gir");
        String soyAd= scn.next();

        System.out.println("kimlik no gir");
        String kimlikNo= scn.next();

        System.out.println("yasini gir");
        int yas= scn.nextInt();

        if (kisiTuru.equals("OGRENCI")){

            System.out.println("Ogenci no gir");
            int ogenciNo=scn.nextInt();

            System.out.println("sinifini gir");
            String sinif= scn.next();

            Ogrenci ogrenci=new Ogrenci(adi,soyAd,kimlikNo,yas,ogenciNo,sinif);
            ogrenciList.add(ogrenci);
            System.out.println("ogrenci = " + ogrenci);
            System.out.println("ogrenciList = " + ogrenciList);


        }else {

            System.out.println("bolum gir");
            String bolum=scn.next();

            System.out.println("Sicil no gir");
            String sicilno=scn.next();

            Ogretmen ogretmen=new Ogretmen(adi,soyAd,kimlikNo,yas,bolum,sicilno);

            System.out.println("ogretmen = " + ogretmen);

            ogretmenList.add(ogretmen);
            System.out.println("ogretmenList = " + ogretmenList);

        }






    }

}
