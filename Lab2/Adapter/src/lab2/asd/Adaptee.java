package lab2.asd;

import java.util.Arrays;

public class Adaptee {
    private String[] data = new String[20];
    private int start;
    private int end;
    public String startString(){
        return data[start];
    }
    public String endString(){
        return data[end];
    }
    public boolean empty(){
        return ( end == -1 );
    }
    public void add(String str){
        data[end] = str;
        end++;
    }
    public void remove(int pos){
//remove the String object at position 'pos' and bring
//forward all items after it
        for ( int i = pos; i < end; i++ ){
            data[i] = data[i+1];
        }
        data[end-1] = null;
        end--;
    }
    public String get(int pos){
        return data[pos];
    }
    public int getEnd(){
        return end;
    }
    public void print(){
        System.out.println(Arrays.toString(data));
    }
}
