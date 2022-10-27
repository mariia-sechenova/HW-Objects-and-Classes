public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = "KGBT";
        this.author = "Pelevin";
        this.year = Integer.parseInt("2022");
    }
    private class Author {
        private final Book.Author author;
        private Author(Author author) {
            this.author = author;
        }

    }

    public Book(int year, String author) {
        this.year = year;
        this.author = author;
        System.out.println(this.year + " " + this.author);
    }

    public int getYear(int year){
        return year;
    }

    public void setYear() {
        this.year = year;
    }


    public String getAuthor(){
        return author;
    }

    public void setAuthor(){
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

}
