interface A {
  void methodA();
}

interface B {
  void methodB();
}

public class ex18 implements A, B {

  public void methodA() {
    System.out.println("interface A method");
  }

  public void methodB() {
    System.out.println("interface B method");
  }

  public static void main(String[] args) {
    ex18 obj = new ex18();
    obj.methodA();
    obj.methodB();
  }
}


// output
// interface A method
// interface B method



