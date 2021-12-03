package edu.pnu.collection;
enum Command{ADD,FIND,CLEAR,LIST,QUIT,INVALID};
public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void add(Object o){
        Object[] newArray = new Object[size + 1];
        for(int i=0; i<size; i++){
            newArray[i] = this.data[i];
        }
        newArray[size] = o;
        size++;
        this.data = newArray;
    }

    public Object get(int i){
        return this.data[i];
    }

    public void clear(){
        this.data = null;
    }
}
