package inheritance;

public class Restaurant {

    private String name;
    private Float stars;
    private Float price;

    public Restaurant(String name, Float stars, Float price){
        this.name = name;
        this.stars = stars;
        this.price = price;
    }


    public static String toString(String cuisine) {
        cuisine = "Latin";
        return cuisine;
    };

//    public static String cuisine(String foodName){
//        foodName = "";
//        cuisine("");
//        return foodName;
//    }

    public static boolean familyFriendly(boolean family) {
        family = true;
        if(family = true){
        return true;
        } else{
            return false;
        }
    };
    public static boolean bar(boolean drinks){
        drinks = false;
        if(true){
            return true;
        } else{
            return false;
        }
    };
    public static boolean danceFloor(boolean bustAMove){
        bustAMove = false;
        if(true){
            return true;
        } else{
            return false;
        }
    };

    public String getName(){
        return name;
    }

    public Float getStars(){
        return stars;
    }

    public Float getPrice(){
        return price;
    }

    public static addReview(){
        Review();
    }
}
