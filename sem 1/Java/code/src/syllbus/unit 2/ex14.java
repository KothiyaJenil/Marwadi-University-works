class GrantParent {
  void GPMethod() {
    System.out.println("this is grant parent class");
  }
}

class Parent extends GrantParent {
  void PMethod() {
    System.out.println("this is parent class");
  }
}

public class ex14 extends Parent {
  public static void main(String[] args) {
    Parent obj = new Parent();
    obj.GPMethod();
    obj.PMethod();
  }
}


// output
// this is grant parent class
// this is parent class



