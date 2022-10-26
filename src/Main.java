
public class Main {
    public static void main(String[] args) {
        Book kgbt = new Book(2022, "Pelevin");
        Book goneWithTheWind = new Book(1939, "Mitchell");


        //kgbt.setYear(2010);
        int kgbtYear = kgbt.getYear(2010);
        System.out.println(kgbtYear);
    }

}
