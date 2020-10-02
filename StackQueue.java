class Stack
{
	int stck[];
	int tos;
	Stack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	void push(int item)
	{
		if(tos==stck.length-1)
			System.out.println("Stack is full");
		else
			stck[++tos]=item;
	}
	int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack UnderFlow");
			return 0;
		}
		else
			return stck[tos--];
	}
}
class Queue
{
    int front, rear, cap; 
    int queue[]; 
  
    Queue(int c) 
    { 
        front = rear = 0; 
        cap = c; 
        queue = new int[cap]; 
    } 
  
    void Enq(int data) 
    { 
        if (cap == rear) { 
            System.out.printf("Queue is full"); 
        } 
        else { 
            queue[rear] = data; 
            rear++; 
        } 
} 
    void Deq() 
    { 
        if (front == rear) { 
            System.out.printf("Queue is empty"); 
        }
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
            if (rear < cap) 
                queue[rear] = 0; 
            rear--; 
        } 
    }
    void display() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("Queue is Empty"); 
        } 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d <-- ", queue[i]); 
        } 
    } 
    void Front() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
    } 
} 
class StackQueue
{
public static void main(String[] args) 
    { 
        Queue q = new Queue(4); 
	Stack s=new Stack(4); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        q.display(); 
        q.Enq(5); 
        q.Enq(7); 
        q.Enq(8); 
        q.Enq(10); 
        q.display(); 
        q.Enq(10); 
        q.display(); 
        q.Deq(); 
        q.Deq(); 
        q.display(); 
        q.Front(); 
    } 
} 