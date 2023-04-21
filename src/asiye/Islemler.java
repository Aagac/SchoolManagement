
package asiye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static asiye.Runner.run;

public class Islemler {

    //renk kodlari
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";


    static String kisiTuru;
    static Scanner scn = new Scanner(System.in);
    static List<Ogrenci> ogrenciList = new ArrayList<>();
    static List<Ogretmen> ogretmenList = new ArrayList<>();

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
               listeleme();
                islemMenusu();
                break;

            case 4:
                silme();
                islemMenusu();
                break;
            case 5 :
                gunceleme();
                islemMenusu();
                break;
            case 6:
                run.anaMenu();
                break;
            default:
                System.out.println("yanlis bir tuslama yaptiniz tekrar deneyiniz");
                islemMenusu();
                break;
        }

    }
    private void gunceleme() {
        System.out.println(" *** " + kisiTuru + " *** gunceleme sayfasina hosgeldiniz");

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci icin
            System.out.println("kimlik no gir");
            String kimlikNo = scn.next();

            for (Ogrenci w : ogrenciList    ) {
                if (kimlikNo.equals(w.getKimlikNo())){
                    System.out.println("guncellemek icin sectigin ogrenci "+w.getName() +" "+w.getLastName()+" 'dir");

                    System.out.println("guncellemek istedigin adini gir");
                    String adi = scn.nextLine();

                    if(adi.equals(w.getName())){
                        w.setName(w.getName());//egr kullanici ayni ismi girerse ayni ismi set ettik yani degisen bir isim olmadi
                    }else w.setName(adi);//kullanici farkli isim girdiyse yeni isim set edildi

                    System.out.println("guncellemek istedigin soyadini gir");
                    String soyad = scn.next();
                    w.setLastName(soyad);

                    System.out.println("guncellemek istedigin yasini gir");
                    int yas = scn.nextInt();
                    w.setYas(yas);

                    System.out.println("guncellemek istedigin ogrenci no gir");
                    int ogrenciNo = scn.nextInt();
                    w.setOgrenciNo(ogrenciNo);

                    System.out.println("guncellemek istedigin sinif gir");
                    String sinif = scn.next();
                    w.setSinif(sinif);

                }

            }

        } else {//ogretmen icin

            System.out.println("degistirmek isteidign ogretmenin kimlik no gir");
            String kimlikNo = scn.next();

            for (Ogretmen w : ogretmenList) {
                if (kimlikNo.equals(w.getKimlikNo())) {
                    System.out.println("guncellemek icin sectigin ogretmen " + w.getName() + " " + w.getLastName() + " 'dir");

                    scn.nextLine();
                    System.out.println("guncellemek istedigin adini gir");
                    String adi = scn.nextLine();

                    if (adi.equals(w.getName())) {
                        w.setName(w.getName());//egr kullanici ayni ismi girerse ayni ismi set ettik yani degisen bir isim olmadi
                    } else w.setName(adi);//kullanici farkli isim girdiyse yeni isim set edildi

                    System.out.println("guncellemek istedigin soyadini gir");
                    String soyad = scn.next();
                    w.setLastName(soyad);

                    System.out.println("guncellemek istedigin yasini gir");
                    int yas = scn.nextInt();
                    w.setYas(yas);

                    System.out.println("guncellemek istedigin bolum gir");
                    String bolum = scn.next();
                    w.setBolum(bolum);

                    System.out.println("guncellemek istedigin sicil no gir");
                    String sicil = scn.next();
                    w.setSicilNo(sicil);

                }

            }
        }

    }

    private void silme() {
        System.err.println(" *** " + kisiTuru + " *** silme sayfasina hosgeldiniz");
        boolean flag = true;

        switch (kisiTuru) {
            case "OGRENCI":
                System.out.println("kimlik no gir");
                String kimlikNo = scn.next();
                for (Kisi w : ogrenciList)
                    if (kimlikNo.equals(w.getKimlikNo())) {
                        System.out.println("silinen ogrenci bilgileri " + w.getName() + " " + w.getLastName());
                        ogrenciList.remove(w);
                        flag = false;
                        break;
                    }
                if (flag) System.out.println(" kimlik nosu "+kimlikNo+ " olan bir ogrenci yoktur 404");
                break;

            case "OGRETMEN":
                System.out.println("kimlik no gir");
                String kimlikNo2 = scn.next();
                for (Kisi w : ogretmenList) {
                    if (kimlikNo2.equals(w.getKimlikNo())) {
                        System.out.println("silinen OGRETMEN bilgileri "+w.getName()+" "+w.getLastName());
                        ogretmenList.remove(w);
                        flag=false;
                        break;
                    }
                }if (flag) System.out.println(" kimlik nosu "+kimlikNo2+ " olan bir OGRETMEN yoktur 404");
                break;

        }


    }

    private void listeleme() {
        System.err.println(Y + "*** " + kisiTuru + " *** listeleme sayfasina hosgeldiniz" + Y);
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println(ogrenciList);
        } else {
            for (Kisi w : ogretmenList) {
                System.out.println(w.toString());
                // System.out.println(w.getName());
            }
        }

    }




    private void arama() {

        System.err.println(R + "*** " + R +W+ kisiTuru +W+ "*** arama sayfasina hosgeldiniz" + R);
        boolean flag = true;//bulumama ihtimaline karsi create edildi

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            scn.nextLine();
            System.out.println("kimlik no gir");
            String kimlikNo = scn.next();


            for (Kisi each : ogrenciList) {

                if (each.getKimlikNo().equalsIgnoreCase(kimlikNo)) {
                    System.out.println("aradigin ögrenci adi " + R + each.getName());
                    flag = false;  //burda aradigin kisiyi buldun artik arama demis oluyoruz false cekerek
                }   //buraya else yazip     if (flag) System.out.println("404 not found orgenci bulunamadi");de yapabilirdik mantik ayni

            }
            if (flag) System.out.println("404 not found orgenci bulunamadi");


        } else {
            System.out.println("kimlik no gir");
            String kimlikNo = scn.next();
            for (Kisi each : ogretmenList) {

                if (each.getKimlikNo().equalsIgnoreCase(kimlikNo)) {
                    System.out.println("aradigin ögrenci adi " + R + each.getName());
                    flag = false;
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


