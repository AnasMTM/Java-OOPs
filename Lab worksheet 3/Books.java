public class Books extends BorrowableItems{
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Books(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title  \t\t: " + getTitle());
        System.out.println("Author \t\t: " + getAuthor());
        System.out.println("ISBN   \t\t: " + getISBN());
        System.out.println("Stutas \t\t: " + ((isAvailable()) ? "Available" : "Unavailable"));
    }
}
