package Learnjava;


class Mystack{
    private int stacksize = 3;
    private int stack[] = new int[stacksize];
    private int TOP = -1;
    
    public void push(int data){
        if(TOP == stacksize-1){
            System.out.println("Stack Overflow..");
            
        }
        else{
            TOP++;
            stack[TOP]=data;
        }
        
    }
    public void pop(){
        if(TOP==-1){
            System.out.println("Stackunderflow");
        }
        else{
            System.out.println("The deleted item is:"+stack[TOP]);
            TOP--;
        }
        
    }
    
    public void view(){
        if(TOP==-1){
            System.out.println("Empty stack");
        }
        else{
            for(int i=TOP;i>=0;i--){
                System.out.print(stack[i]+"-------");
            }
        }
    }
}

public class Examplestack {
    public static void main(String[] args) {
        Mystack ob = new Mystack();
        ob.push(12);
        ob.push(17);
        ob.push(19);
        ob.view();
    }
    
}
