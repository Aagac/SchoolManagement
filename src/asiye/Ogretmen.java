package asiye;

public class Ogretmen extends Kisi {
    private String bolum;
    private String sicilNo;

    public Ogretmen(String name, String lastName, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(name, lastName, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    public String getBolum() {
        return this.bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return this.sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String toString() {
        String var10000 = this.bolum;
        return "Ogretmen{bolum='" + var10000 + "', sicilNo='" + this.sicilNo + "'" + super.toString() + "}";
    }
}