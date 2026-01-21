abstract class Animal {
  abstract void sound();
}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Dog barks");
  }
}

public class ex20 {
  public static void main(String[] args) {
    Animal obj = new Dog();
    obj.sound();
  }
}

// output
// Dog barks


