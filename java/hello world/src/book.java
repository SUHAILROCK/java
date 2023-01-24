public class book {
    // name
    private int id;
    private String name;
    private String author;

    // state
    public book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return id + " " + name + " " + author;
    }

    public static void main(String[] args) {
        book book = new book(77, "Ide", "Data");
        System.out.println(book);
    }
}
