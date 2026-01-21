interface IParent {
  void parent();
}

interface IChild extends IParent {
  void child();
}

public class ex12 implements IChild {

  public void parent() {
    System.out.println("this is parent interface");
  }

  public void child() {
    System.out.println("this is child interface");
  }

  public static void main(String[] args) {
    IChild obj = new ex12();
    obj.parent();
    obj.child();
  }
}


// output -->
// this is parent interface
// this is child interface



