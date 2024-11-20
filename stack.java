public class stack {
    private int[] arr;          
    private int size;          
    private int index = 0;    

   
    public stack(int size)
    {
        this.size = size;
        arr = new int[size];
    }

    
    public void push(int element) 
    {
        if (isFull()) {
            System.out.println("Stack is Full");
        }
        arr[index] = element;
        index++;
    }

    
     public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return arr[--index];
    }

    // Check if the stack is empty
    public boolean isEmpty()
    {
        if (index == 0) {
            return true;
        }
        return false;
    }

    // Check if the stack is full
    public boolean isFull()
    {
        if (index == size) {
            return true;
        }
        return false;
    }

    //getting size of stack
    public int size()
    {
        return index;
    }

    public static void main(String[] args) {
        stack stack = new stack(5); // Create a stack with size 5
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        System.out.print("2. Pop elements from stack: ");
        while (!stack.isEmpty())
        {
            System.out.printf(" %d", stack.pop());
        }

    System.out.println("\n3. Size of stack after pop operations: " + stack.size());

    }
}