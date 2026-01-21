public class ex4 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < args.length; i++) {
      sum += Integer.parseInt(args[i]);
    }
    System.out.println("sum of all the number : " + sum);
  }
}

// output

// javac ex4.java
// java ex4 10 20 30
// sum of all the number : 60




