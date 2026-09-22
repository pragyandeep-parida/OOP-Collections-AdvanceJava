package OOP_6.generics;

import java.util.Arrays;

public class customArraylist
{
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;                           //also working as index value

    public customArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num)
    {
        if (isFull()){
            resize();
        }
       data[size++] = num;
    }

    private void resize()
    {
        int[] temp = new int[data.length * 2];

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

    public int remove(){
        int remove = data[--size];
        return remove;
    }

    public int get(int index)
    {
        return data[index];
    }

    public int size()
    {
        return size;
    }

    public void set(int index, int value)
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
//        ArrayList arr = new ArrayList();

        customArraylist arr = new customArraylist();
//
//        arr.add(12);
//        arr.add(13);
//        arr.add(14);

        for (int i = 0; i < 14; i++) {
            arr.add(2 * i);
        }

        System.out.println(arr);

    }
}
