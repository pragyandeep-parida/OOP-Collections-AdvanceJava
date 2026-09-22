package OOP_6.generics;

import java.util.Arrays;

public class customGenArraylist<T>
{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;                           //also working as index value

    public customGenArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num)
    {
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize()
    {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++)
        {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull()
    {
        return size==data.length;
    }

    public T remove(){
        T remove = (T)(data[--size]);
        return remove;
    }

    public T get(int index)
    {
        return (T)(data[index]);
    }

    public int size()
    {
        return size;
    }

    public void set(int index, T value)
    {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "customArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args)
    {
        customGenArraylist list2 = new customGenArraylist();

        for (int i = 0; i < 14; i++)
        {
         list2.add(i * 2);
        }

        System.out.println(list2);
    }

}

