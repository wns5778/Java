package Class1;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] movies = new MovieReview[] {inception, aboutTime};

        for (MovieReview s : movies) {
            System.out.println("영화 제목: "+s.title+", 리뷰: "+s.review);
        }

    }
}
