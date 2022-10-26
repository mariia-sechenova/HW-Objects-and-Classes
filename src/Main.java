
public class Main {
    public static void main(String[] args) {
        Book kgbt = new Book(2022, "Pelevin");
        Book goneWithTheWind = new Book(1939, "Mitchell");


        kgbt.setYear();
        int kgbtYear = kgbt.getYear();
        System.out.println(kgbtYear);
    }

}
