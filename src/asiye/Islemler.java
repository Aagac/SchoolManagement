
package asiye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Islemler {
        static String kisiTuru;
        static Scanner scn;
        static List<Kisi> ogrenciList;
        static List<Kisi> ogretmenList;

        public Islemler() {
        }

        public void islemMenusu() {
            System.out.println("sectigin kisi turu ***" + kisiTuru + "******asagidaki islemlerden hangisini yapmak istiyorsun ");
            System.out.println("============= İŞLEMLER =============\n\t\t 1-EKLEME\n\t\t 2-ARAMA\n\t\t 3-LİSTELEME\n\t\t 4-SİLME\n\t\t 5-ANA MENÜ\n");
            int secilenIslem = scn.nextInt();
            switch (secilenIslem) {
                case 1:
                    this.ekleme();
                    this.islemMenusu();
                    break;
                case 2:
                    this.islemMenusu();
                    break;
                case 3:
                    this.islemMenusu();
                    break;
                case 4:
                    this.islemMenusu();
                    break;
                case 5:
                    Runner.run.anaMenu();
                    break;
                default:
                    System.out.println("yanlis bir tuslama yaptiniz tekrar deneyiniz");
                    this.islemMenusu();
            }

        }

        private void ekleme() {
            System.err.println("*** " + kisiTuru + "*** ekleme sayfasina hosgeldiniz");
            scn.nextLine();
            System.out.println("adini gir");
            String adi = scn.nextLine();
            System.out.println("soyadini gir");
            String soyad = scn.next();
            System.out.println("kimlikNo gir");
            String kimlikNo = scn.next();
            System.out.println("yasini gir");
            int yas = scn.nextInt();
            String sinif;
            if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
                System.out.println("ogrenci no gir");
                int ogrenciNo = scn.nextInt();
                System.out.println("sinif gir");
                sinif = scn.next();
                Ogrenci ogrenci = new Ogrenci(adi, soyad, kimlikNo, yas, ogrenciNo, sinif);
                ogrenciList.add(ogrenci);
                System.out.println("ogrenci = " + ogrenci);
                System.out.println("ogrenciList = " + ogrenciList);
            } else {
                System.out.println("bolum gir");
                String bolum = scn.nextLine();
                System.out.println("sicilNo gir");
                sinif = scn.next();
                Ogretmen ogretmen = new Ogretmen(adi, soyad, kimlikNo, yas, bolum, sinif);
                System.out.println("ogretmen = " + ogretmen);
                ogretmenList.add(ogretmen);
            }

        }

        static {
            scn = new Scanner(System.in);
            ogrenciList = new ArrayList();
            ogretmenList = new ArrayList();
        }
    }


