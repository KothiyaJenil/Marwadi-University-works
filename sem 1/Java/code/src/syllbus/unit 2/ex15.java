class Parent {
  void ParentChild() {
    System.out.println("this is parent class");
  }
}

class Child1 extends Parent {
  void childOne() {
    System.out.println("this is child one method");
  }
}

class Child2 extends Parent {
  void childTwo() {
    System.out.println("this is child two method");
  }
}

public class ex15 {
  public static void main(String[] args) {
    Child1 c1 = new Child1();
    Child2 c2 = new Child2();
    c1.ParentChild();
    c1.childOne();
    c2.childTwo();
    c2.ParentChild();
  }
}


// output
// this is parent class
// this is child one method
// this is child two method
// this is parent class



