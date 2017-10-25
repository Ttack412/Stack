package usingstacks;

import java.util.ArrayList;

public class Stack <T>{
    
    //base arratlist and other variables
    private ArrayList<T> myInputs = new ArrayList<>();
    int Output;
    
    //sets stackSize and Output
    Stack(int size){
        Output = size;
    }
    
    //adds inputs to array
    void push(T inputs){
        myInputs.add(inputs);
    }
    
    //takes objects off array
    void pop(int num){
        
        for(int i = 0; i < num; i++)
        {
            System.out.println(myInputs.get(Output--));

        }
    }
}
