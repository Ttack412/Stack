package usingstacks;

import java.util.ArrayList;

public class Stack {
    
    //base arratlist and other variables
    private ArrayList<Integer> myInputs = new ArrayList<>();
    int counter;
    int stackSize;
    int Output;
    
    //sets stackSize and Output
    Stack(int size){
        stackSize = size;
        Output = size - 1;
    }
    
    //adds inputs to array
    void push(int inputs){
        myInputs.add(inputs);
    }
    
    //takes nums off array
    void pop(int num){
        
        for(int i = 0; i < num; i++)
        {
            System.out.println(myInputs.get(Output--));

        }
    }
}
