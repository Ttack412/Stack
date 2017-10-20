package usingstacks;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("How many numbers would you like to stack?"); 
        //gets inputted number
        int stackSize = scanner.nextInt();
        
        //Makes a stack and an ArrayList
        Stack myStack = new Stack(stackSize);
        ArrayList<Integer> myInputs = new ArrayList<>();
     
        //makes collects numbers based on the first number entered and adds them to the stack
        System.out.println("Please enter your integers");
        for(int i = 0; i < stackSize; i++)
        {
            myInputs.add(scanner.nextInt());
            myStack.push(myInputs.get(i));
        }
        
        System.out.println("How many numbers would you like to take off the stack?");
        int unStack = scanner.nextInt();
        
        System.out.println("Here are your numbers");
        
        //takes the seceted amount off of the stack
        myStack.pop(unStack);
    }
    
}
