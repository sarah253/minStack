
import java.util.Stack;

public class minStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public minStack(){
        mainStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    public void Push(int val){
        if(!minStack.isEmpty() && val <= minStack.peek()){
            mainStack.push(val);
            minStack.push(val);
        }
        if (minStack.isEmpty()){
            mainStack.push(val);
            minStack.push(val);
        }
        else{
            mainStack.push(val);
        }
    }
    public int Pop(){
        if(mainStack.isEmpty()){
            throw new RuntimeException("");
        }else{
            int currentValue = mainStack.pop();
            if(currentValue == minStack.peek()){
                minStack.pop();
            }
            return currentValue;
        }
    }

    public int getMin(){
        if (minStack.isEmpty()) {
            throw new RuntimeException("");
        }
        return minStack.peek();
    } 

}




