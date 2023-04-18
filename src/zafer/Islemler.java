package zafer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static zafer.Runner.run;

public class Islemler {
        //renk kodlari
        public static final String W = "\u001B[37m";
        public static final String R = "\u001B[31m";
        public static final String G = "\u001B[32m";
        public static final String Y = "\u001B[33m";
        public static final String B = "\u001B[34m";


    static String kisiTuru;
    static Scanner scn = new Scanner(System.in);
    static List < Kisi > ogrenciList = new ArrayList<>();
    static List < Kisi > ogretmenList = new ArrayList<>();

    public void islemMenusu(){
        System.out.println("sectigin kisi turu *** "+kisiTuru+" ***" +
                " asagidaki islemlerden hangisini yapmak istiyorsun");

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
                arama();
                islemMenusu();
                break;
            case 3:
             //   listeleme();
                islemMenusu();
                break;
            case 4:
             //   silme();
                islemMenusu();
            case 5:
                run.anaMenu();
                break;
            default:
                System.out.println("yanlis bir tuslama yaptiniz tekrar deneyim");
                islemMenusu();
                break;

        }
    }

    private void arama() {
        System.err.println(R+"*** "+R+ W+kisiTuru+ W+" *** ekleme sayfasina hosgeldiniz"+R);
        boolean flag = true;//bulamama ihtimaline karsi create ediildi

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
           // scn.nextLine();
            System.out.println("kimlik no gir");
            String kimlikNo=scn.next();

            for (Kisi each : ogrenciList   ) {
                    if (each.getKimlikNo().equals(kimlikNo)){
                        System.out.println("aradigin ogrenci adi"+R+each.getName());
                        flag = false;
                    }
            }
            if (flag) System.out.println("404 not found ogrenci bulunamadi");

        }else {
            System.out.println("kimlik no gir");
            String kimlikNo=scn.next();
            for (Kisi each : ogretmenList   ) {
                if (each.getKimlikNo().equals(kimlikNo)){
                    System.out.println("aradigin ogrenci adi"+R+each.getName());
                    flag = false;
                }
            }
            if (flag) System.out.println("404 not found ogrenci bulunamadi");


        }



    }

    private void ekleme() {
         System.err.println("*** "+kisiTuru+ " *** ekleme sayfasina hosgeldiniz");
        scn.nextLine();

        System.out.println("adini gir");
        String adi=scn.nextLine();

        System.out.println("soyadini gir");
        String soyad=scn.next();

        System.out.println("kimlik no gir");
        String kimlikNo=scn.next();

        System.out.println("yasini gir");
        int yas=scn.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){//ogrenci icin
            System.out.println("ogrenci no gir");
            int ogrenciNo=scn.nextInt();

            System.out.println("sinif gir");
            String sinif=scn.next();

            Ogrenci ogrenci = new Ogrenci(adi,soyad,kimlikNo,yas,
                    ogrenciNo,sinif);
            ogrenciList.add(ogrenci);

            System.out.println("ogrenci = " + ogrenci);
            System.out.println("ogrenciList = " + ogrenciList);


        }else {//ogretmen icin

            System.out.println("bolum gir");
            String bolum =scn.next();

            System.out.println("sicil no gir");
            String sicilNo =scn.next();

            Ogretmen ogretmen = new Ogretmen(adi,soyad,kimlikNo,yas,
                    bolum,sicilNo);
            ogretmenList.add(ogretmen);

            System.out.println("ogretmen = " + ogretmen);
            System.out.println("ogretmenList = " + ogretmenList);

        }








    }
}
