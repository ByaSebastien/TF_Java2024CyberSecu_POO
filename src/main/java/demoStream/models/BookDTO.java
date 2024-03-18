package demoStream.models;

public class BookDTO {
    private String title;
    private String author;

    public BookDTO(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static BookDTO fromEntity(Book b){
        return new BookDTO(b.getTitle(),b.getAuthor());
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
