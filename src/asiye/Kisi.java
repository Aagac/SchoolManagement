package asiye;

public class Kisi {
    private String name;
    private String lastName;
    private String kimlikNo;
    private int yas;

    public Kisi(String name, String lastName, String kimlikNo, int yas) {
        this.name = name;
        this.lastName = lastName;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKimlikNo() {
        return this.kimlikNo;
    }

    public int getYas() {
        return this.yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String toString() {
        return "Kisi{name='" + this.name + "', lastName='" + this.lastName + "', kimlikNo='" + this.kimlikNo + "', yas=" + this.yas + "}";
    }
}
