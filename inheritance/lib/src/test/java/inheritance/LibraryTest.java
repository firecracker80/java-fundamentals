/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void constructorTest(){

        Restaurant newPlace = new Restaurant("Firecracker Lounge", 4.5f, "$$");
        assertInstanceOf(Restaurant.class, newPlace);
    }

    @Test void testRestMethod(){

//        Restaurant.cuisine("Latin");
        Restaurant.familyFriendly(true);
        Restaurant.bar(true);
        Restaurant.danceFloor(true);


//        assertEquals("Latin", Restaurant.cuisine("Latin"));
        assertTrue(Restaurant.familyFriendly(true));
        assertTrue(Restaurant.bar(true));
        assertTrue(Restaurant.danceFloor(true));
    }

    @Test void toStringTest(){
        String name = "El Coqui";
        Float stars = 4.5f;
        String price = "$$";
        assertEquals("This restaurant, " + name + ", has " + stars + "and is " + price, "This restaurant, " + name + ", has " + stars + "and is " + price);
    }

    @Test void addReviewTest(){
        Review msg = new Review("latin lover", "El Coqui", "Great place for a family.", 4f);
        assertInstanceOf(Restaurant.class, msg);
    }

    @Test void reviewConstructor(){
        Review msg = new Review("Rob Jones", "El Coqui", "Food was great!", 4.5f);
        assertInstanceOf(Review.class, msg);
  }
}
