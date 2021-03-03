package tools;

public class ArraySet<T> implements ISet<T> {

    private T[] data;
    private int size;
    
    public ArraySet(int size)
    {
        data = (T[]) new Object[size];
        this.size = size;
    } 

    @Override
    public boolean add(T obj) 
    {
        boolean inserted = false;
        for(int i=0; i<size; i++)
        {
            if(data[i]==null)
            {
                data[i] = obj;
                inserted = true;
                break;
            }
        }
        return inserted;
    }

    @Override
    public void clear() 
    {
        data = (T[]) new Object[size];
    }

    @Override
    public boolean contains(T obj) 
    {
        boolean found = false;
        for(int i=0; i<size; i++)
        {
            if(data[i]==obj)
            {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public boolean isEmpty() 
    {
        //we want to return true when the list is empty
        //if any items are found the list is not empty
        //so if foundItem is true, we want to return false
        boolean foundItem = false;
        for(int i=0; i<size; i++)
        {
            if(data[i]!=null)
            {
                foundItem = true;
                break;
            }
        }
        return !foundItem;
    }

    @Override
    public boolean remove(T obj) 
    {
        boolean found = false;
        for(int i=0; i<size; i++)
        {
            if(data[i]==obj)
            {
                data[i] = null;
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public int size() 
    {
        return size;
    }
    
}
