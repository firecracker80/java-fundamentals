package inheritance;

public class Review extends Commerce{
    String author;
    String restaurantName;
    String body;
    Float stars;

    public Review(String author, String restaurantName, String body, Float stars){
        this.author = author;
        this.restaurantName = restaurantName;
        this.body = body;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return super.toString();
    };

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public Float getStars() {
        return stars;
    }
}
