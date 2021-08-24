package Lista8;

import java.util.ArrayList;

public class MyQueueCyclic<E> implements MyQueue<E>
{
    private ArrayList<E> queue;
    private int f;
    private int r;


    public MyQueueCyclic(int size)
    {
        queue = new ArrayList<>(size);
        f = r = 0;

        for (int i = 0; i < size + 1; i++)
        {
            queue.add(null);
        }
    }

    @Override
    public void enqueue(E x) throws FullException
    {
        if(isFull())
        {
            throw new FullException("MyQueueCyclic: enqueue " + x);
        }
        else
        {
            queue.set(r,x);
            r = (r+1) % queue.size();
        }

    }

    @Override
    public void dequeue()
    {
        if(!isEmpty())
        {
            queue.set(f, null);
            f = (f+1) % queue.size();
        }
    }

    @Override
    public E first() throws EmptyException
    {
        if(isEmpty())
        {
            throw new EmptyException("MyQueueCyclic: first");
        }
        else
        {
            return queue.get(f);
        }
    }

    @Override
    public boolean isEmpty()
    {
        return r == f;
    }

    @Override
    public boolean isFull()
    {
        return (r+1) % queue.size() == f;
    }
}