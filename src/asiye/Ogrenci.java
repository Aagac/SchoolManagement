package asiye;

public class Ogrenci extends Kisi {
    private int ogrenciNo;
    private String sinif;

    public Ogrenci(String name, String lastName, String kimlikNo, int yas, int ogrenciNo, String sinif) {
        super(name, lastName, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public Ogrenci(int ogrenciNo, String sinif) {
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public Ogrenci() {
    }

    public int getOgrenciNo() {
        return this.ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return this.sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String toString() {
        int var10000 = this.ogrenciNo;
        return "Ogrenci{ogrenciNo=" + var10000 + ", sinif='" + this.sinif + "'" + super.toString() + "}";
    }
}
