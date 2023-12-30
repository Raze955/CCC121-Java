package data_structures;

public class Stack {
    public Stack(int n){
        this.a = new String[n];
    }
    private final String[] a;
    private int top=-1;
    public String get(){
        String stack = "";
        System.out.print("{");
        for(int i = 0; i < a.length; i++){
            if(i != a.length-1) System.out.print(a[i] +", ");
            else System.out.print(a[i]);
        }
        System.out.print("}");
        return stack;
    }
    public void push(String c) throws IndexOutOfBoundsException{
        if(top+1 == getSize()) throw new IndexOutOfBoundsException("data_structures.Stack full, no room to push, size=100");
        top = top + 1;
        a[top]= c;
    }
    public String pop() throws IndexOutOfBoundsException{
        if(isEmpty()) throw new IndexOutOfBoundsException("The stack is empty!");
        String temp = a[top];
        top = top - 1;
        return temp;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == getSize();
    }
    public String top() throws IndexOutOfBoundsException{
        if(isEmpty()) throw new IndexOutOfBoundsException("The stack is empty!");
        return a[top];
    }

    public String peek(int index) throws IndexOutOfBoundsException{
        if(isEmpty()) throw new IndexOutOfBoundsException("The stack is empty!");
        return a[index];
    }

    public int getSize(){
        return a.length;
    }

    public int getActualSize(){
        return top + 1;
    }

    public String stack(){
        StringBuilder stack = new StringBuilder();
        for(int i = 0; i < getSize(); i++){
            stack.append(a[i]);
            //if(a[i+1].equals("")) break;
        }
        return stack.toString();
    }
}