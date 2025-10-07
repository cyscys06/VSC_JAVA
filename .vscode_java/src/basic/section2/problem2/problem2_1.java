package basic.section2.problem2;
import basic.section2.myclass2.MovieReview;

public class problem2_1 
{
    public static void main(String[] args)
    {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        MovieReview[] movies = new MovieReview[]{movie1, movie2};
        // 배열 선언 방식: 
        // 1. 초기값이 없는 대신 크기를 직접 지정 해주기
        // 2. 크기가 없는 대신 초기값을 직접 지정 해주기
        // -> 초기값 선언과 크기 지정은 동시에 하면 안되고 둘중 하나만 해야 함

        for (MovieReview m : movies)
        {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
    }    
}
