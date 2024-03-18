package demoGenerique;

public class SimpleList<T extends Object> {

    private T[] array;
    private int count;
    private int lenght;

    public SimpleList(int lenght) {
        this.lenght = lenght;
        this.array = (T[]) new Object[lenght];
        this.count = 0;
    }

    public void add(T value) {
        if (count < lenght) {
            this.array[count++] = value;
        }
    }

    public void removeAt(int i){
        if(i >= 0 && i < lenght){
            array[i] = null;
        }
    }

    public T getValue(int i){
        if(i >= 0 && i < lenght){
            return array[i];
        }
        return null;
    }
}
