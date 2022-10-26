public class Book {
    private int year;
    private String Author;


    public Book(int year, String Author) {
        this.year = year;
        this.Author = Author;

        System.out.println(this.year + " " + this.Author);

    }

    public int getYear(int year){
        return year;
    }

    public void setYear() {
        this.year = year;

    }


    public String getAuthor(){
        return Author;
    }

    public void setAuthor(){
        this.Author = Author;
    }

}
