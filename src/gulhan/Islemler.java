package gulhan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static gulhan.Runner.run;

public class Islemler {

    static String kisiTuru;
    static Scanner scn = new Scanner(System.in);
    static List<Ogrenci> ogrenciList = new ArrayList<>();
    static List<Ogretmen> ogretmenList = new ArrayList<>();

    public void islemMenusu() {
        System.err.println("*** " + kisiTuru + " ***");
        System.out.println();

        System.out.println("===== İŞLEMLER =====\n\n" +
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
                //  arama();
                islemMenusu();
                break;
            case 3:
                //  listeleme();
                islemMenusu();
                break;
            case 4:
                //  silme();
                islemMenusu();
            case 5:
                run.anaMenu();
                break;
            default:
                System.out.println("Yanlis bir tuslama yaptiniz");
                islemMenusu();
        }
    }

    private void ekleme() {
        System.err.println("*** " + kisiTuru + " ***");
        System.out.println();

            scn.nextLine();
            System.out.print("Adini gir       : ");
            String name = scn.nextLine();

            System.out.print("Soyadini gir    : ");
            String lastName = scn.next();

            System.out.print("Kimlik no gir   : ");
            String kimlikNo = scn.next();

            System.out.print("Yasini gir      : ");
            int yas = scn.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){

            System.out.print("Ogrenci no gir  : ");
            int ogrenciNo = scn.nextInt();

            System.out.print("Sinif gir       : ");
            String sinif = scn.next();

            Ogrenci ogrenci = new Ogrenci(name,lastName,kimlikNo,yas,ogrenciNo,sinif);
            ogrenciList.add(ogrenci);

            System.out.println(ogrenci);
            System.out.println(ogrenciList);

        }else {

            System.out.print("Brans gir       : ");
            String brans = scn.next();

            System.out.print("Sicil no gir    : ");
            String sicilNo = scn.nextLine();

            Ogretmen ogretmen = new Ogretmen(name,lastName,kimlikNo,yas,brans,sicilNo);
            ogretmenList.add(ogretmen);

            System.out.println(ogretmen);
            System.out.println(ogretmenList);
        }

    }
}
