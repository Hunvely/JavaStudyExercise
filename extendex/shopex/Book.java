package example.extendex.shopex;

public class Book extends Item {

    private String author;
    private String bookNum;

    public Book(String name, int price, String author, String bookNum) {
        super(name, price);
        this.author = author;
        this.bookNum = bookNum;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : " + author + " | bookNum" + bookNum);
    }
}
