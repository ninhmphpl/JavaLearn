package OOP.StackAndQueue.Stack.Practice;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;
    private int size = 0;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.push(element);
        size++;

    }
    public T pop (){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        return stack.removeFirst();
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

}
