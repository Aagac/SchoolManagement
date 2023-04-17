package sureyya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static sureyya.Runner.run;

public class Islemler {

    static String kisiTuru;
    static Scanner scn= new Scanner(System.in);
    static List<Kisi > ogrenciList = new ArrayList<>();
    static List<Kisi > ogretmenList = new ArrayList<>();


    public void islemMenusu(){
        System.out.println("sectiginiz kisi turu *** " + kisiTuru + " ***" + "asagidaki islemlerden hangisini seciyorsunuz");
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n");
        int secilenIslem = scn.nextInt();
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
              //  listeleme();
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
                System.out.println("Yanlis tuslsms yaptiniz tekrar deneyiniz");
                islemMenusu();
                break;
        }



    }

    private void ekleme() {
        System.err.println("***" +kisiTuru+ "ekleme syfasina hosgeldiniz");
        System.out.println("Ad gir");
        String ad=scn.nextLine();

        System.out.println("soyad gir");
        String soyad=scn.nextLine();

        System.out.println(" Kimlik No gir");
        String kimlikNo=scn.nextLine();

        System.out.println("yas gir");
        int yas= scn.nextInt();

        if(kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("Ogrenci No Gir");
            int ogrenciNo= scn.nextInt();

            System.out.println("Sinif Gir");
            String sinif=scn.next();

            Ogrenci ogrenci=new Ogrenci(ad,soyad,kimlikNo,yas,ogrenciNo,sinif);
            ogrenciList.add(ogrenci);
            System.out.println("\"ogrenci\" = " + "ogrenci");
            System.out.println("\"ogrenciList\" = " + "ogrenciList");

        }else {
            System.out.println(" Bolum gir");
            String bolum=scn.nextLine();

            System.out.println(" Sicil No gir");
            String sicilNo=scn.nextLine();

            Ogretmen ogretmen = new Ogretmen(ad,soyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);

            System.out.println("\"ogretmen\" = " + "ogretmen");
            System.out.println("\"ogretmenList\" = " + "ogretmenList");


        }


    }

}
