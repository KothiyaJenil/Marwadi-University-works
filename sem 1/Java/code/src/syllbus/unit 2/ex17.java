interface iVehicle {
  void run();
}

public class ex17 implements iVehicle {
  public void run() {
    System.out.println("bike is running.....");
  }
  public static void main(String[] args) {
    iVehicle obj = new ex17();
    obj.run();
  }
}


// output
// bike is running.....


