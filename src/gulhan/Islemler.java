package gulhan;

import java.util.*;

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
        System.out.println();
        System.out.print("Seciminiz  : ");

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
            case 5:
                run.anaMenu();
                break;
            default:
                System.out.println("Yanlis bir tuslama yaptiniz");
                islemMenusu();
        }
    }

    private void silme() {
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            System.out.print("Silinecek öğrencinin kimlik numarasını girin: ");
            String id = scn.next();

            boolean sonuc = false;

            for (int i = 0; i < ogrenciList.size(); i++) {

                Ogrenci ogrenci = ogrenciList.get(i);

                if (ogrenci.getKimlikNo().equals(id)) {
                    sonuc = true;

                    System.out.println("Aşağıdaki öğrenciyi silmek istediğinizden emin misiniz? (E/H)");
                    System.out.println(ogrenci);
                    String cevap = scn.next();

                    if (cevap.equalsIgnoreCase("E")) {
                        ogrenciList.remove(i);
                        System.out.println("Öğrenci başarıyla silindi.");

                    } else {
                        System.out.println("İşlem iptal edildi.");
                    }
                    break;
                }
            }
            if (!sonuc) {
                System.out.println("Bu kimlik numarasina sahip ögrenci bulunamadi");
            }
        } else {
            System.out.print("Silinecek ögretmenin kimlik numarasını girin: ");
            String id = scn.next();

            boolean sonuc = false;
            for (int i = 0; i < ogretmenList.size(); i++) {

                Ogretmen ogretmen = ogretmenList.get(i);

                if (ogretmen.getKimlikNo().equals(id)) {
                    sonuc = true;

                    System.out.println("Aşağıdaki ögretmeni silmek istediğinizden emin misiniz? (E/H)");
                    System.out.println(ogretmen);
                    String cevap = scn.nextLine();

                    if (cevap.equalsIgnoreCase("E")) {
                        ogretmenList.remove(i);
                        System.out.println("ögretmen başarıyla silindi.");

                    } else {
                        System.out.println("İşlem iptal edildi.");
                    }
                    break;
                }
            }
            if (!sonuc) {
                System.out.println("Bu kimlik numarasina sahip ögretmen bulunamadi");
            }
        }

    }


    private void listeleme() {
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println(ogrenciList);
        } else System.out.println(ogretmenList);
    }

    private void arama() {
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            System.out.print("Aranan öğrencinin kimlik numarasını girin: ");
            String id = scn.next();

            boolean sonuc = false;
            for (int i = 0; i < ogrenciList.size(); i++) {

                Ogrenci ogrenci = ogrenciList.get(i);

                if (ogrenci.getKimlikNo().equals(id)) {
                    sonuc = true;
                    System.out.println(ogrenci);

                }
            }
            if (!sonuc) {
                System.out.println("Bu kimlik numarasina sahip ögrenci bulunamadi");
            }


        } else {
            System.out.print("Aranan ögretmenin kimlik numarasını girin: ");
            String id = scn.next();

            boolean sonuc = false;
            for (int i = 0; i < ogretmenList.size(); i++) {

                Ogretmen ogretmen = ogretmenList.get(i);

                if (ogretmen.getKimlikNo().equals(id)) {
                    sonuc = true;

                    System.out.println(ogretmen);

                }


            }
            if (!sonuc) {
                System.out.println("Bu kimlik numarasina sahip ögretmen bulunamadi");
            }
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



        int yas = 0;
        try {
            System.out.print("Yasini gir      : ");

            yas = Integer.parseInt(scn.next());


        } catch (NumberFormatException e) {
            System.out.println("Bir tam sayi giriniz");

        }
        System.out.print("Yasini gir      : ");
        yas = scn.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            System.out.print("Ogrenci no gir  : ");
            int ogrenciNo = scn.nextInt();

            System.out.print("Sinif gir       : ");
            String sinif = scn.next();

            Ogrenci ogrenci = new Ogrenci(name, lastName, kimlikNo, yas, ogrenciNo, sinif);

            ogrenciList.add(ogrenci);


            //System.out.println(ogrenci);


        } else {

            System.out.print("Brans gir       : ");
            String brans = scn.next();

            System.out.print("Sicil no gir    : ");
            String sicilNo = scn.next();

            Ogretmen ogretmen = new Ogretmen(name, lastName, kimlikNo, yas, brans, sicilNo);
            ogretmenList.add(ogretmen);

            // System.out.println(ogretmen);

        }

    }
}
