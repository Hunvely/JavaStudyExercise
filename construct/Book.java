package example;

public class Book {
    String titie;
    String author;
    int page;

    Book() {
        this(" ", " ", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {

        this.titie = title;
        this.author = author;
        this.page = page;
        System.out.println("제목 : " + title + ", 저자 : " + author + ", 페이지 수 : " + page);
    }

}
