package inheritance;

public class Restaurant {

    private String name;
    private Float stars;
    private String price;

    public Restaurant(String name, Float stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }


    public String toString() {
        return "This restaurant, " + this.name + ", has " + this.stars + "and is " + this.price;
    }

    ;

    public static String cuisine(String foodType){
        foodType = "";
        cuisine("");
        return foodType;
    }


    ;
    public static boolean familyFriendly(boolean family) {
        family = true;
        if (family = true) {
            return true;
        } else {
            return false;
        }
    }

    ;

    public static boolean bar(boolean drinks) {
        drinks = false;
        if (true) {
            return true;
        } else {
            return false;
        }
    }

    ;

    public static boolean danceFloor(boolean bustAMove) {
        bustAMove = false;
        if (true) {
            return true;
        } else {
            return false;
        }
    }

    ;

    public String getName() {
        return name;
    }

    public Float getStars() {
        return stars;
    }

    public String getPrice() {
        return price;
    }


    public void addReview(){
        Review rating = new Review("", "", "",stars);
    }
}
