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
            System.out.println("Stack overflow!");
        }
    }
}
