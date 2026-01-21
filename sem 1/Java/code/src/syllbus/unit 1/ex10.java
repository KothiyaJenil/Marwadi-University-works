import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];

    System.out.println("enter 10 value of an array : ");
    for (int i = 0; i < 10; i++) {
      System.out.print("enter " + (i + 1) + " value : ");
      arr[i] = sc.nextInt();
    }

    System.out.println();

    for (int i = 0; i < 10; i++) {
      System.out.println((i + 1) + " of value of array is : " + arr[i]);
    }

    sc.close();
  }
}

// output


// javac ex10.java
// java ex10
// enter 10 value of an array : 
// enter 1 value : 10
// enter 2 value : 20
// enter 3 value : 30
// enter 4 value : 40
// enter 5 value : 50
// enter 6 value : 60
// enter 7 value : 70
// enter 8 value : 80
// enter 9 value : 90
// enter 10 value : 100

// 1 of value of array is : 10
// 2 of value of array is : 20
// 3 of value of array is : 30
// 4 of value of array is : 40
// 5 of value of array is : 50
// 6 of value of array is : 60
// 7 of value of array is : 70
// 8 of value of array is : 80
// 9 of value of array is : 90
// 10 of value of array is : 100




