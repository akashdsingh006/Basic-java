import java.util.Scanner;

class BubbleSortAlgo {
  public static void main(String []args) {
    int num, i, j, temp;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter the number of integers to sort:");
    num = in.nextInt();
 
    int a[] = new int[num];
 
    System.out.println("Enter " + num + " integers: ");
 
    for (i = 0; i < num; i++) 
      a[i] = in.nextInt();
 
    for (i = 0; i < ( num - 1 ); i++) {
      for (j = 0; j < num - i - 1; j++) {
        if (a[j] > a[j+1]) 
        {
           temp = a[j];
           a[j] = a[j+1];
           a[j+1] = temp;
        }
      }
    }
 
    System.out.println("Sorted list of integers:");
 
    for (i = 0; i < num; i++) 
      System.out.println(a[i]);
  }
}
