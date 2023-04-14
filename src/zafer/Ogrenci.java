package zafer;

public class Ogrenci extends Kisi{

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
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo=" + ogrenciNo +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
