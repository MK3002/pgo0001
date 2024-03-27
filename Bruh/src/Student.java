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
        if (oceny.size()==0) {
            System.out.println("IllegalArgumentExpectation: brak danych");
        }
        if (oceny.size()==20) {
            System.out.println("IllegalArgumentExpectation2: zbyt duża ilość danych");
        }
        double avg=0;
        for(int i=0; i<oceny.size(); i++) {
            avg+=oceny.get(i);
        }
        avg/=oceny.size();
        return avg;
}
}
