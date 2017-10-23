package usingstacks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("How many things would you like to stack?"); 
        //gets inputted number
        int stackSize = scanner.nextInt();
        
        //Makes a stack and an ArrayList
        Stack myStack = new Stack(stackSize);
     
        //makes collects numbers based on the first number entered and adds them to the stack
        System.out.println("Please enter the objects you want to stack");
        for(int i = 0; i < stackSize; i++)
        {
            myStack.push(scanner.nextLine());
        }
        
        System.out.println("How many objects would you like to take off the stack?");
        int unStack = scanner.nextInt();
        
        System.out.println("Here are your objects");
        
        //takes the seceted amount off of the stack
        myStack.pop(unStack);
    }
    
}
