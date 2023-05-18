import java.util.*;

public class TimelyGreet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name");

    String name = sc.nextLine();
    Date date = new Date();
    int time = date.getHours();

    if (time >= 0 && time < 12) {
      System.out.println("Good morning " + name);

    } else if (time >= 12 && time < 17) {
      System.out.println("Good afternoon " + name);
    } else {
      System.out.println("Good evening " + name);
    }
    sc.close();
  }

}
