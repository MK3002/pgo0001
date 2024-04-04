import java.util.ArrayList;
import java.util.List;
public class Student {
    public String imie;
    public String nazwisko;
    public int numerIndeksu;
    public String email;
    public String adres;
    public ArrayList<Double> oceny;

    public double obliczSrednia() {
        if (oceny.size() == 0) {
            System.out.println("IllegalArgumentExpectation: brak danych");
        }
        if (oceny.size() > 20) {
            throw new IllegalArgumentException("zbyt duża ilość danych, maksymalnie 20");
        }
        double avg = 0;
        for (int i = 0; i < oceny.size(); i++) {
            avg += oceny.get(i);
        }
        avg /= oceny.size();
        if (avg < 2.26) {
            avg = 2;
        }
        if (avg >= 2.26 && avg < 2.76) {
            avg = 2.5;
        }
        if (avg >= 2.76 && avg < 3.26) {
            avg = 3;
        }
        if (avg>=3.26 && avg<3.76) {
            avg=3.5;
        }
        if (avg>=3.76 && avg<4.26) {
            avg=4;
        }
        if (avg>=4.26 && avg<4.76){
            avg=4.5;
        }
        if (avg>=4.76) {
            avg=5;
        }

        return avg;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numerIndeksu == student.numerIndeksu;
    }
}