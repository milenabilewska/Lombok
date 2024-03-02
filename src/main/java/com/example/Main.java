import com.example.Osoba;

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Anna", "Nowak");
        System.out.println(osoba);
        System.out.println(osoba.toString());
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());

    }
}