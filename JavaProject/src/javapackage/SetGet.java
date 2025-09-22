package javapackage;
// getters and setters are methods used to access and update the values of private fields in a class

class Book {
    private String title;
    private String author;
    private double price;

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

public class SetGet {
    public static void main(String[] args) {
        Book bk = new Book();
        bk.setTitle("Maths");
        bk.setAuthor("Srinivasa Ramanujan");
        bk.setPrice(399.9);

        System.out.println("Book: " + bk.getTitle());
        System.out.println("Author: " + bk.getAuthor());
        System.out.println("Price: ₹" + bk.getPrice());
    }
}