package example.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTIme = new MovieReview();
        aboutTIme.title = "어바웃타임";
        aboutTIme.review = "인생 시간 영화";


        System.out.println("영화 제목 : " + inception.title + ", 리뷰 : " + inception.review );
        System.out.println("영화 제목 : " + aboutTIme.title + ", 리뷰 : " + aboutTIme.review );
    }
}
