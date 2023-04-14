package yildiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static yildiz.Runner.run;


public class Islemler {

    static String kisiTuru;
    static Scanner scn=new Scanner(System.in);
    static List<Kisi> ogrenciList=new ArrayList<>();
    static List<Kisi> ogretmenList=new ArrayList<>();
   public void islemMenusu(){
       System.out.println("sectigin kisituru ***"+kisiTuru+"***"+"asagidaki islemlerden hangisini yapmak istersin");
       System.out.println("============= İŞLEMLER =============\n" +
               "\t\t 1-EKLEME\n" +
               "\t\t 2-ARAMA\n" +
               "\t\t 3-LİSTELEME\n" +
               "\t\t 4-SİLME\n" +
               "\t\t 5-ANA MENÜ\n");
       int secilenIslem= scn.nextInt();
        switch (secilenIslem){
            case 1:  
           ekleme();
            islemMenusu();
            break;

            case 3:
               // listeleme();
                islemMenusu();
                break;
            case 4:
                //silme();
                islemMenusu();
                break;
            case 5:
              run.anaMenu();
              break;
            default:
                System.out.println("yanlis tuslama yaptiniz tekrar deneyin");
                islemMenusu();
                break;
        }
   }

    private void ekleme() {
        System.err.println("***" + kisiTuru + "***ekleme sayfasina hosgeldiniz");
        System.out.println("adini gir");
        String adi = scn.next();
        System.out.println("soyadini gir");
        String soyad = scn.next();
        System.out.println("kimlik no  gir");
        String kimlikNo = scn.next();
        System.out.println("yasini gir");
        int yas = scn.nextInt();
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci icin
            System.out.println("ogrenci no gir");
            int ogrenciNo = scn.nextInt();
            System.out.println("sinif gir");
            String sinif = scn.next();
        Ogrenci ogrenci = new Ogrenci(adi, soyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciList.add(ogrenci);
            System.out.println("ogrenci = " + ogrenci);
            System.out.println("ogrenciList = " + ogrenciList);

        } else {//ogretmen icin
            System.out.println("bolum gir");
           String bolum = scn.next();
            System.out.println("sicil no gir");
            String sicilNo = scn.next();
            Ogretmen ogretmen=new Ogretmen(adi,soyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println("ogretmen = " + ogretmen);
            System.out.println("ogretmenList = " + ogretmenList);
        }
    }
}