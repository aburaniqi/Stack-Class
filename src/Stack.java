public class Stack <T>{
    private static final int capacity = 10;
    private Object[] array;
    private int size;

    public Stack(){
        this(capacity);
    }

    public Stack(int capacity){
        this.array = new Object[capacity];
        this.size = 0;
    }

    public void push(T element) throws StackFullException{
        if(size == this.array.length){
            throw new StackFullException("Stack is full");
        }
        this.array[size++] = element;
    }

    public T pop() throws StackEmptyException{
        if(size == 0){
            throw new StackEmptyException("Stack is empty");
        }
        return (T) this.array[--size];
    }

    public T peek() throws StackEmptyException{
        if(size == 0){
            throw new StackEmptyException("Stack is empty");
        }
        return (T) this.array[size - 1];
    }

    public String list(){
        String out = "";
        for (int i = 0; i < size; i++) {
            out += this.array[i] + "; ";
        }
        return out;
    }
}
