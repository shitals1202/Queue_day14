package Day14.Queue;

class Main{
	public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
       ;
 
        System.out.printf("The front element is %d\n", q.peek());
 
        q.dequeue();
        q.dequeue();
        q.dequeue();
  
 
        if (q.isEmpty()) {
            System.out.print("The queue is empty");
        }
        else {
            System.out.print("The queue is not empty");
        }
    }
}