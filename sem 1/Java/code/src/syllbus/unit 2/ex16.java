abstract class absEx16 {
  abstract void displayAge(int age);
}

public class ex16 extends absEx16 {
  void displayAge(int age) {
    System.out.println("my age is " + age);
  }

  public static void main(String[] args) {
    ex16 obj = new ex16();
    obj.displayAge(20);
  }
}

// output
// my age is 20


