import gulhan.Kisi;

public class Ogretmen extends Kisi {

    private String brans;
    private String sicilNo;

    public Ogretmen(String name, String lastName, String kimlikNo, int yas, String brans, String sicilNo) {
        super(name, lastName, kimlikNo, yas);
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String brans, String sicilNo) {
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {

    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return   "Brans   = " + brans + "\n" + "" +
                 "SicilNo = " + sicilNo;
    }
}
