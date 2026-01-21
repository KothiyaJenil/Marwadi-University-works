class student {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

public class ex21 {
  public static void main(String[] args) {
    student obj = new student();
    obj.setName("jenil");
    obj.setAge(20);
    System.out.println("Name : " + obj.getName());
    System.out.println("Age : " + obj.getAge());
  }
}

// output
// Name : jenil
// Age : 20


