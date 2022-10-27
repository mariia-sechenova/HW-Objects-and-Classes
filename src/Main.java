
public class Main {
    public static void main(String[] args) {
        Book kgbt = new Book("KGBT", "Pelevin", 2022);
        Book goneWithTheWind = new Book("Gone With the Wind","Mitchell", 1939);

        int kgbtYear = kgbt.getYear(2010);

        System.out.println(kgbt.getTitle() + " "+ kgbt.getAuthor() + " " + kgbt.getYear(2010) );

    }

}
