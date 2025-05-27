public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        if(top < maxSize -1){
            stackArray[++top] = value;
        }else {
            System.out.println("Stack Overflow!");
        }
    }

    public int pop(){
        if (!isEmpty()){
            return stackArray[top--];
        }else {
            System.out.println("Stack Underflow!");
            return -1;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return stackArray[top];
        }else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){
        return top + 1;
    }

    public void display(){
        System.out.println("Stack: ");
        for (int i = 0; i<= top; i++){
            System.out.println(stackArray[i]+ " ");
        }
        System.out.println();
    }
}
