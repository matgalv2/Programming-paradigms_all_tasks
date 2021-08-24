package Lista8;

public class Test
{
    public static void main(String[] args) throws FullException, EmptyException
    {
        MyQueueCyclic<Integer> que = new MyQueueCyclic<>(3);

        que.enqueue(5);
        que.enqueue(4);
        que.enqueue(3);
//        que.enqueue(3);


        System.out.println(que.first());
        que.dequeue();

        System.out.println(que.first());
        que.dequeue();

        System.out.println(que.first());
        que.dequeue();


        que.enqueue(5);
        que.enqueue(5);
        que.enqueue(5);
//        que.enqueue(5);


        que.first();
    }
}