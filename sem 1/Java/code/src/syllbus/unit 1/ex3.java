import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter your name : ");
    String name = sc.nextLine();
    System.out.print("enter your DOB : ");
    String DOB = sc.nextLine();
    System.out.print("enter your enrollment : ");
    Long enrNo = sc.nextLong();
    System.out.print("enter your GR no. : ");
    Long grNo = sc.nextLong();
    sc.nextLine();
    System.out.print("enter your department : ");
    String dept = sc.nextLine();

    System.out.println("\nyour name : " + name);
    System.out.println("your DOB : " + DOB);
    System.out.println("your enrollment no : " + enrNo);
    System.out.println("your GR no : " + grNo);
    System.out.println("your department : " + dept);

    sc.close();
  }
}

// output

// javac ex3.java
// java ex3
// enter your name : abc
// enter your DOB : 12/10/2010
// enter your enrollment : 7164 
// enter your GR no. : 946811
// enter your department : FoCA

// your name : abc
// your DOB : 12/10/2010
// your enrollment no : 7164
// your GR no : 946811
// your department : FoCA



