package gulhan;

import java.util.Scanner;

public class Runner extends Islemler {
    static Runner run = new Runner();

    public static void main(String[] args) {

        run.anaMenu();
    }

    public void anaMenu() {
        System.err.println("GAZI MUSTAFA KEMAL OKULU HOSGELDINIZ");
        System.out.println();
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "====================================\n\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");

        System.out.println();


        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Seciminiz  : ");
        String secim = input.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Yanlis secim yaptin");
                anaMenu();
                break;
        }
    }

    private void cikis() {
        System.out.println("bye bye");
    }
}
