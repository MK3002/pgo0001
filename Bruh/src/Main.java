import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.imie = "Jan";
        st.nazwisko = "Kowalski";
        st.adres = "pochyla";
        st.email = "JanKowal@gmail.com";
        st.numerIndeksu = 9999;
        st.oceny= new ArrayList<>();
        st.oceny.add(4.5);
        st.oceny.add(4.5);
        st.oceny.add(4.5);
        st.oceny.add(4.5);
        st.oceny.add(4.5);
        st.oceny.add(4.5);
        st.oceny.add(4.5);
        st.oceny.add(4.5);
        double srednia= st.obliczSrednia();
        System.out.println(srednia);
        }
    }
