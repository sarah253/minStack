public class tests {
    
public static void test1 () {
    System.out.println("start test1");
    minStack minStack = new minStack();
    minStack.Push(-2);
    minStack.Push(0);
    minStack.Push(-3);
    minStack.Push(-6);
    // current minimum is -6, should returns -6.
    System.out.println("expected value : -6");
    System.out.println("value returned : "+ minStack.getMin());
    // pop last added item ; -6
    int item = minStack.Pop();
    System.out.println("expected value to be poped : -6");
    System.out.println("value returned by Pop() : "+ item);
   // current minimum is -3, should returns -3.
    System.out.println("expected value : -3");
    System.out.println("value returned : "+ minStack.getMin());
}

public static void test2(){
    System.out.println("start test2");
    minStack minStack = new minStack();
    minStack.Push(2);
    minStack.Push(0);
    minStack.Push(-3);
    // current minimum is -3, should returns -3.
    System.out.println("expected value : -3");
    System.out.println("value returned : "+ minStack.getMin());
    minStack.Pop();
    minStack.Pop();
    minStack.Push(-1);
    minStack.Push(-5);
    // current minimum is -5, should returns -5.
    System.out.println("expected value : -5");
    System.out.println("value returned : "+ minStack.getMin());
    minStack.Pop();
    // current minimum is -1, should returns -1.
    System.out.println("expected value : -1");
    System.out.println("value returned : "+ minStack.getMin());

}

}
