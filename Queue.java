package Day14.Queue;

class Queue{
	private static Node rear = null, front = null;
	public static int dequeue(){
		if(front == null){
			System.out.println("Queue is underflow");
			System.exit(1);
		}
		Node temp =front;
		System.out.println("Removing "+ temp.data);
		    front = front.next;
        if (front == null) {
            rear = null;
        }
        int item = temp.data;
        return item;
    }
	
	 public static void enqueue(int item)     
    {
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);
 		if (front == null)
        {
            
            front = node;
            rear = node;
        }
        else {
           
            rear.next = node;
            rear = node;
        }
    }
    public static int peek()
    {
      
        if (front != null) {
            return front.data;
        }
        else {
            System.exit(1);
        }
 
        return -1;
    }
    public static boolean isEmpty() {
        return rear == null && front == null;
    }
}
