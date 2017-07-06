
import java.util.*;

import static java.lang.System.exit;

class SpecialStack {

    private int stackSize;

    Stack<Integer> stackobj = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    SpecialStack(int size){
           this.stackSize = size;
    }

    void push(int ele) {
        if (!isFull()) {
            stackobj.push(ele);
            if (minStack.empty()) {
                minStack.push(ele);

            } else {
                if (minStack.peek() >= ele) {
                    minStack.push(ele);
                } else {
                    minStack.push(minStack.peek());
                }
            }

            System.out.println("Element is pushed successfully");
            stackSize--;
        }
        else{
            System.out.println("Stack is full. Element can't be pushed");
        }

    }

    void pop() {
        if (!stackobj.empty()) {
            minStack.pop();
            int  ele  = stackobj.pop();
            System.out.println("Popped out element is: "+ele);
        }
        else{
            System.out.println("Stack is Empty");
        }
    }

    boolean isFull(){
        if(stackSize > 0){
            return false;
        }
        else{
            return true;
        }
    }

    void isEmpty() {
        if (stackobj.empty()) {
            System.out.println("Stack is Empty");

        }
        else{
            System.out.println("Stack contains element");
        }
    }


    void getMin() {

        if (!stackobj.empty()) {
            int ele = minStack.peek();
            System.out.println("Minimun element is: "+ele);
        }

        else{
            System.out.println("Stack is empty");
        }
    }
}

public class Exercise7{
    public static void main(String[] args) {

        int c;
        SpecialStack obj = new SpecialStack(5);

            System.out.println("Operations: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check Empty");
            System.out.println("4. Check Full");
            System.out.println("5. Get Min");
            System.out.println("6. Exit");
            do{
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int ele = sc.nextInt();
                    obj.push(ele);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.isEmpty();
                    break;

                case 4:
                    boolean full =  obj.isFull();
                    if(full == true)
                        System.out.println("Stack is Full");
                    else
                        System.out.println("Stack is not full");
                    break;

                case 5:
                    obj.getMin();
                    break;

                case 6:
                    exit(0);

                default:
                    System.out.println("Entered choice is wrong");
            }
        }while(c != 6 );
    }
}