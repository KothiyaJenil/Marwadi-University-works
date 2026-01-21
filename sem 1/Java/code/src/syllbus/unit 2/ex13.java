class parentEx13 {
  void sum(int a, int b) {
    System.out.println("sum of a and b is " + (a + b));
  }
}

public class ex13 extends parentEx13{
  public static void main(String[] args) {
    parentEx13 obj = new parentEx13();
    obj.sum(10, 11);
  }
}

// output 
// sum of a and b is 12


