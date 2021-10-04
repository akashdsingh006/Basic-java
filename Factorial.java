import java.util.*;
class Test 
{ 
    static int factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
        return n*factorial(n-1); 
    } 
    
    public static void main(String[] args)  
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Number");
        int n=in.nextInt();
        System.out.println("Factorial of "+ num + " is " + factorial(n)); 
    } 
}  
