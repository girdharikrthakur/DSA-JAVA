import java.util.Arrays;

public class ArrayQueueImp {
    

    private int [] items=new int[5];
    private int rear;
    private int count;
    private int front;
    



    public void enqueue(int item){
        if(count==items.length){
            throw new IllegalStateException("Queue is Full");
        }
        items[rear]=item;
        rear=(rear+1)%items.length;
        count++;
    }

    public int dequeue(){
        int item=items[front];
        items[front]=0;
        front=(front+1)%items.length;
        count--;
        return item;
    }


@Override
    public String toString(){
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        ArrayQueueImp q=new ArrayQueueImp();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(15);
        q.enqueue(40);
        q.enqueue(30);
        q.dequeue();
        q.enqueue(3);

 

        System.out.println(q.toString());
    }
}


