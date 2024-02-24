package example.extendex.shopex;

public class ShopMain {

    public static void main(String[] args) {

        Book book = new Book("Java", 10000, "han", "12345");
        Album album = new Album("바다 앨범", 12000, "지훈");
        Movie movie = new Movie("인터스텔라", 25000, "외국감독", "외국배우");

        book.print();
        album.print();
        movie.print();

        int totalPrice = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println();
        System.out.println("상품 가격의 총 합 : " + totalPrice);


    }
}
