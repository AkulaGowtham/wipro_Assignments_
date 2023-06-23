import java.util.*;
class Positivenum{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number");
    int num = sc.nextInt();
    if(num>0){
      System.out.println("positive");
    }
    else if(num==0){
      System.out.println("ZERO");
    }
    else{
      System.out.println("Negative");
    }
  }
}
