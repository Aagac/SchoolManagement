package ahmet;

import java.util.Scanner;



public class Runner extends Islemler {

    static Runner run=new Runner();

    static {
        Ogrenci ogrenci = new Ogrenci("ali","john","1234",12,
                223,"12A");
        ogrenciList.add(ogrenci);

        Ogretmen ogretmen = new Ogretmen("gulhan","tezcan","12345",33,
                "BT","155A");
        ogretmenList.add(ogretmen);
    }

    public static void main(String[] args) {
        run.anaMenu();
    }
    public void anaMenu(){
        System.out.println(G+"Gazi Mustafa Kemal Okulu na hosgeldiniz"+G);
        System.out.println("hangi islemi yapmak istersiniz");
        System.out.println("\t====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        Scanner input=new Scanner(System.in);
        String secim = input.next().toUpperCase();

        switch (secim){
            case "1":
                kisiTuru = "OGRENCI";//burada kisi turune ogrenci elbisesi giydiriyoruz
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";//burada kisi turune ogretmen elbisesi giydiriyoruz
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("yanlis secim yaptin tekrar dene");
                anaMenu();
                break;
        }


    }

    private void cikis() {
        System.out.println("bye bye");
    }
}
