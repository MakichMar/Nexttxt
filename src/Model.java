import java.io.Serializable;

public class Model implements Serializable {

    private String name;
    private String surname;
    private int year;
    private double more;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMore() {
        return more;
    }

    public void setMore(double more) {
        this.more = more;
    }
}
