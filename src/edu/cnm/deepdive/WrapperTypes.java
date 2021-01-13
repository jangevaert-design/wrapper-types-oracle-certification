package edu.cnm.deepdive;

public class WrapperTypes {

  public static void main(String[] args) {
    int myInt = 5;
    Integer myInteger = new Integer(10);
    Integer myInteger2 = 20;
    Integer myInteger3 = Integer.valueOf(10);
    Integer myInteger4 = Integer.parseInt("3");
    Integer myInteger5 = null;
//  int myInt2 = null; does not compile because int is a primitive whereas Integer is a wrapper,
//  hence an object.

    System.out.println("MyInteger = " + myInteger);
    System.out.println("MyInteger2 = " + myInteger2);
    System.out.println("MyInteger3 = " + myInteger3);
    System.out.println("MyInteger4 = " + myInteger4);
    System.out.println("MyInteger5 = " + myInteger5);

    int myInt3 = myInteger3; //this is unboxing: converting wrapper to primitive.

    printSum(1, 5);// both method calls work because of autoboxing.
    printSum(myInteger, myInteger2);
  }

  private static void printSum(Integer first, Integer second) {
    System.out.println("\nsum = " + (first + second));
  }

}
