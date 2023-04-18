package ahmet;

import java.util.*;

import static ahmet.Runner.run;

public class Islemler extends Kisi {

    static String kisiTuru;
    static Scanner scn = new Scanner(System.in);
    static List<Kisi> ogrenciList = new ArrayList<>();
    static List<Kisi> ogretmenList = new ArrayList<>();
    Ogrenci ogr = new Ogrenci();


    public void islemMenusu() {
        System.out.println("sectigin kisi turu " + kisiTuru + " ***" +
                " asagidaki islemlerden hangisini yapmak istiyorsun");

        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n");
        int secilenIslem = scn.nextInt();
        switch (secilenIslem) {
            case 1:
                ekleme();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                //listeleme();
                islemMenusu();
                break;
            case 4:
                // silme();
                islemMenusu();
                break;
            case 5:
                run.anaManu();
                break;
            default:
                System.out.println("yanlis tuslama yaptin tekrar dene");
                islemMenusu();
                break;

        }


    }

    private void arama() {
        System.err.println("*** " + kisiTuru + " *** ekleme sayfasina hosgeldiniz");
        boolean flag=true;//bulamama ihtimaline karsin create edildi

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("Kimlik no gir");
            String kimlikNo= scn.next();

            for (Kisi each:ogrenciList) {
                if (each.getKimlikNo().equalsIgnoreCase(kimlikNo)){
                    System.out.println("aradigin ögrenci "+each.getName());
                    flag=false;// false oldugu icin loop durdu disardaki if calismayacak
                }
            }
            if (flag) System.out.println("404 not found ogrenci bulunamadi");
        }else {
            System.out.println("Kimlik no gir");
            String kimlikNo= scn.next();

            for (Kisi each:ogretmenList) {
                if (each.getKimlikNo().equalsIgnoreCase(kimlikNo)){
                    System.out.println("aradigin ögrenci "+each.getName());
                    flag=false;// false oldugu icin loop durdu disardaki if calismayacak
                }
            }
            if (flag) System.out.println("404 not found ogrenci bulunamadi");
        }





    }

    private void ekleme() {
        System.err.println("*** " + kisiTuru + " *** ekleme sayfasina hosgeldiniz");
        scn.nextLine();
        System.out.println("adini gir");
        String adi = scn.nextLine();

        System.out.println("soyadini gir");
        String soyad = scn.next();

        System.out.println("kimlik no gir");
        String kimlikNo = scn.next();

        System.out.println("yasini gir");
        int yas = scn.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci icin
            System.out.println("ogrenci no gir");
            int ogrenciNo = scn.nextInt();

            System.out.println("sinifini gir");
            String sinif = scn.next();

            Ogrenci ogrenci = new Ogrenci(adi, soyad, kimlikNo, yas, ogrenciNo, sinif);
            System.out.println("ogrenciList.add(ogrenci) = " + ogrenciList.add(ogrenci));
            System.out.println("ogrenci = " + ogrenci);

        } else {//ogretmen icin
            System.out.println("bolum gir");
            String bolum = scn.next();

            System.out.println("sicil no gir");
            String sicilNo = scn.next();

            Ogretmen ogretmen = new Ogretmen(adi, soyad, kimlikNo, yas, bolum, sicilNo);
            System.out.println("ogretmenList.add(ogretmen) = " + ogretmenList.add(ogretmen));
            System.out.println("ogretmenList = " + ogretmenList);

        }


    }


}
