public class ex8 {
  public static void main(String[] args) {
    int number = Integer.parseInt(args[0]);

    if (number % 2 == 0) {
      System.out.print("number is even");
    } else {
      System.out.print("number is odd");
    }
  }
}


// output 
// javac ex8.java
// java ex8 10
// number is even


