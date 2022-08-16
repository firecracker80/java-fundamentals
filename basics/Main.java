// import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.time.Month;
import java.time.ZoneId;

public class Main {
  public static void main(String[] args) {
    // System.out.println("test");
    System.out.println(pluralize(2, "heart"));
    System.out.println(pluralize(4, "boy"));
    System.out.println(pluralize(0, "me"));
    System.out.println(flipNHeads("1"));
    System.out.println(clock());
  }
  private static String pluralize(int count, String singular){
    if (count > 0){
      return singular + "s";
    }
    return singular;
  }
  private static String flipNHeads(String flips){
    System.out.println("test");
    int n = 1;
    // int min = 0;
    // int max = 1;
    // int range = max - min + 1;
    int tcount = 0; 

    if (java.lang.Math.random() < 0.5){
      System.out.println("heads");
      tcount++;
    } else if (java.lang.Math.random() == 1){
      System.out.println("It took " + tcount + "flips to flip " + n + "heads in a row.");
    } else {
      System.out.println("tails");
      tcount++;
      
    }
    return flips;
//Retreived from w3schools.
  }
  private static LocalDateTime clock(){
    LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));
    
    for(int i=1;i!=0;i++){
      long millis = System.currentTimeMillis();
      try {
        Thread.sleep(1000 - millis % 1000);
      } catch (InterruptedException e) {
        
        e.printStackTrace();
      }
      //Retreived from stackoverflow.
      System.out.println(now);
    }
    return now;
  
  } 
    
}
