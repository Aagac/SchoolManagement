package gulhan;

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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return  "Name      = " + name + "\n" +
                "lastName  = " + lastName + "\n" +
                "KimlikNo  = " + kimlikNo + "\n" +
                "Yas       = " + yas;
    }
}
