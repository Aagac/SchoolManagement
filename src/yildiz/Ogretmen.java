package yildiz;

public class Ogretmen extends Kisi {
    private String bolum;
    private String sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String name, String lastName, String kimlikNo, int yas) {
        super(name, lastName, kimlikNo, yas);
    }

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String name, String lastName, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(name, lastName, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +super.toString()+ '}';
    }
}
