package OOP.StackAndQueue.Stack.Practice;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int [] arr = {1,3,5,5,2,1,2,65};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
