
package asiye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static asiye.Runner.run;

public class Islemler {

        static String kisiTuru;
        static Scanner scn = new Scanner(System.in);
        static List<Kisi> ogrenciList = new ArrayList<>();
        static List<Kisi> ogretmenList = new ArrayList<>();

        public Islemler() {
        }

        public void islemMenusu() {
            System.out.println("sectigin kisi turu ***" + kisiTuru + "******+" +
                    "asagidaki islemlerden hangisini yapmak istiyorsun ");

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
                   //silme();
                    islemMenusu();
                    break;
                case 5:
                   run.anaMenu();
                    break;
                default:
                    System.out.println("yanlis bir tuslama yaptiniz tekrar deneyiniz");
                  islemMenusu();
                  break;
            }

        }
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";


    private void arama() {


        System.err.println(R+"*** " +R+ kisiTuru + "*** ekleme sayfasina hosgeldiniz"+R);
boolean flag = true;//bulumama ihtimaline karsi create edildi
        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            scn.nextLine();
            System.out.println("kimlik no gir");
            String kimlikNo= scn.next();


            for (Kisi each : ogrenciList){

                if (each.getKimlikNo().equalsIgnoreCase(kimlikNo)){
                    System.out.println("aradigin ögrenci adi "+R+each.getName());
                    flag =false;  //burda aradigin kisiyi buldun artik arama demis oluyoruz false cekerek
                }   //buraya else yazip     if (flag) System.out.println("404 not found orgenci bulunamadi");de yapabilirdik mantik ayni

            }
            if (flag) System.out.println("404 not found orgenci bulunamadi");



        }else {
            System.out.println("kimlik no gir");
            String kimlikNo= scn.next();
            for (Kisi each : ogretmenList){

                if (each.getKimlikNo().equalsIgnoreCase(kimlikNo)){
                    System.out.println("aradigin ögrenci adi "+R+each.getName());
                    flag =false;
                }

            }
            if (flag) System.out.println("404 not found orgenci bulunamadi");

        }

    }

    private void ekleme() {
            System.err.println("*** " + kisiTuru + "*** ekleme sayfasina hosgeldiniz");
            scn.nextLine();

            System.out.println("adini gir");
            String adi = scn.nextLine();

            System.out.println("soyadini gir");
            String soyad = scn.next();

            System.out.println("kimlik no gir");
            String kimlikNo = scn.next();

            System.out.println("yasini gir");
            int yas = scn.nextInt();

            if (kisiTuru.equalsIgnoreCase("OGRENCI")) {// ogrenci icin
                System.out.println("ogrenci no gir");
                int ogrenciNo = scn.nextInt();

                System.out.println("sinif gir");
                String sinif = scn.next();

                Ogrenci ogrenci = new Ogrenci(adi, soyad, kimlikNo, yas,
                        ogrenciNo, sinif);

                ogrenciList.add(ogrenci);
                System.out.println("ogrenci = " + ogrenci);
                System.out.println("ogrenciList = " + ogrenciList);


            } else { //ogretmen icin

                System.out.println("bolum gir");
                String bolum = scn.next();

                System.out.println("sicilNo gir");
                String sicilNo = scn.next();

                Ogretmen ogretmen = new Ogretmen(adi, soyad, kimlikNo, yas,
                        bolum, sicilNo);

                ogretmenList.add(ogretmen);

                System.out.println("ogretmen = " + ogretmen);
                System.out.println("ogretmenList = " + ogretmenList);

            }

        }


    }


