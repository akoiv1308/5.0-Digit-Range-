//importing scanner, array, collections //
import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

class Main {
  public static void main(String [] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a digit: \n");
    // setting int value to be used for determination of the range //
    int value = userInput.nextInt();
    // since integers can be negative, convert integer to the absolute value;
    value = Math.abs(value);
    userInput.close();
    // if integer contains only one digit, report the range of 1; no need to run a code //
    if(value < 10) {
      System.out.println("\nThe range is 1");
    }
    else {
      // Printing out the result //
      System.out.println("\nThe range is " + digitRange(value));
    }
  }
  // Static method to determine the length of the integer //
  public static int digitsLength(int value) {
      int i;
      // loops until int value has no digits left //
      for(i = 0; value > 0; i++) {
        // divide int value by 10 to get each digit. //
        value = value / 10;
        // array list will contain integer's digit in oppsite order // for example: int 345 -> {5,4,3}
      }
    // returning i - the number of digits //
    return i;
  }
  // main static method - digitRange //
  public static int digitRange(int value) {
    // creating an array list - digits //
    ArrayList<Integer> digits = new ArrayList<Integer>();
    while(digitsLength(value) > 0) {
      // adding last digit of the integer by using mod that will defined integer by 10 and return whetever is left; and getting rid of a digit by dividing int value by 10 //
      digits.add(value % 10);
      value = value / 10;
    }
    // setting two integers - largest and lowest - to identify two digits //
    int largest = digits.get(0);
    int smallest = digits.get(0);
    // looping through each digit //
    for(int x = 1; x < digits.size(); x++) {
      // if a digit is larger than particular(current) digit, it becomes the largest digit in the number //
      if(digits.get(x) > largest) {
        largest = digits.get(x);
      }
      // same process, but with the smallest digit in int :) //
      else if (smallest > digits.get(x)) {
        smallest = digits.get(x);
      }
    }
    // return the range by subtracting the largest and the smallest digit and adding a 1 to the result //
    return (largest - smallest) + 1;
    // There is an easier way to solve this problem by just using "collections" that organizes array list(just like commands in excel). Parameters, such as Collections.min and .max allow to find the smallest and the largest number //
     /*
    int smallest = Collections.min(digits);
    int largest = Collections.max(digits);
    return (largest - smallest) + 1;
    */
  }
}
