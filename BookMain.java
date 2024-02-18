package example;

import javax.crypto.SealedObject;

public class BookMain {

    public static void main(String[] args) {

        Book book1 = new Book();

        Book book2 = new Book("Hello Java", "Seo");

        Book book3 = new Book("JPA 프로그래밍", "Kim", 700);


    }
}
