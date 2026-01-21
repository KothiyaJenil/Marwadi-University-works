class Animal {
  void sound() {
    System.out.println("Animal Sound");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog barks");
  }
}

public class ex19 {
  public static void main(String[] args) {
    Animal obj = new Dog();
    obj.sound();
  }
}


// output
// Dog barks



