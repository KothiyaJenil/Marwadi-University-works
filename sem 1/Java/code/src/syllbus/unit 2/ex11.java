interface IEx11 {

  void displayName(String name);
}

public class ex11 implements IEx11 {
  public void displayName(String name) {
    System.out.println("My name is " + name);
  }
  public static void main(String[] args) {
    IEx11 obj = new ex11();
    obj.displayName("jenil");
  }
}


// output
// My name is jenil 

