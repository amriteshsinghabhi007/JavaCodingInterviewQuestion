package DSA.Stack;

public class StackImplemantation {
    int [] arr;
    int topOfStack;
    public StackImplemantation(int size){
      this.arr = new int [size];
      this.topOfStack = -1;
        System.out.println("STack is created with the size of : "+size);
    }
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if (topOfStack == arr.length-1){
//            System.out.println("Stack is full");
            return true;
        }
        else {
            return false;
        }
    }
    //PUSH
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is inserted successfully");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int stacktop = arr[topOfStack];
            topOfStack --;
            return stacktop;
        }
    }
    public static void main(String[] args) {
        StackImplemantation si = new StackImplemantation(4);
        //isempty
        boolean result = si.isEmpty();
        System.out.println(result);
        //isFull
        boolean result1 = si.isFull();
        System.out.println(result1);
        //push
        si.push(1);
        si.push(2);
        si.push(3);
        si.push(4);
        si.push(5);
        //pop
        int popresult = si.pop();
        System.out.println(popresult);
        int popresult1 = si.pop();
        System.out.println(popresult1);
    }
}
