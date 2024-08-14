package class_1208;

public class Book {
    private String title;
    private String autor;
    private long publishDate;
    private boolean reserved;

    public Book(String title, String autor, long publishDate, boolean reserved) {
        this.title = title;
        this.autor = autor;
        this.publishDate = publishDate;
        this.reserved = reserved;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public long getPublishDate() {
        return publishDate;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserveBook(){
        if(!this.isReserved()){
            this.reserved = true;
            System.out.println("Reserved successfully!");
        }
        System.out.println("This book is not free!");
    }

    public void returnBook(){
        if(this.isReserved()){
            this.reserved = false;
            System.out.println("Returned successfully!");
        }
        System.out.println("This book is not reserved!");
    }

    public String toString(){
        String result =("Title: " + this.getTitle() +
                "\nAuthor: " + this.getAutor() +
                "\nPublish Date: " + this.getPublishDate() +
                "\nStatus: " + (this.isReserved() ? "reserved." : "free"));
        return result;  
    }
}
