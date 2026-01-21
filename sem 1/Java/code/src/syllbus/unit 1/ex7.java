import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter your department (BCA or MCA) : ");
    String dept = sc.nextLine();

    if (dept == "BCA") {
      System.out.println("you are in under graduate");
    } else {
      System.out.println("you are in post graduate");
    }

    sc.close();
  }
}

// output 

// javac ex7.java
// java ex7      
// enter your department (BCA or MCA) : BCA
// you are in post graduate




