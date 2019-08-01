package lab9.asd;

import java.util.*;

public class DecoratorProfiler<E> extends AbstractList<E> implements Profiler{
    private List list;

    public DecoratorProfiler(List list) {
        this.list = list;
    }


    @Override
    public E get(int index) {
        return (E) list.get(index);
    }

    @Override
    public int size() {
        long startTime = System.nanoTime();
        int size = list.size();
        long endTime = System.nanoTime();
        System.out.println("size function time (nano second): " + (endTime - startTime));
        return size;
    }
    @Override
    public boolean add(Object e){
        long startTime = System.nanoTime();
        boolean result = list.add(e);
        long endTime = System.nanoTime();
        System.out.println("add function time (nano second): " + (endTime - startTime));
        return result;

    }
    public boolean remove(Object o){
        long startTime = System.nanoTime();
        boolean result = list.remove(o);
        long endTime = System.nanoTime();
        System.out.println("remove function time (nano second): " + (endTime - startTime));
        return result;
    }

    public boolean contains(Object o){
        long startTime = System.nanoTime();
        boolean result = list.contains(o);
        long endTime = System.nanoTime();
        System.out.println("contains function time (nano second): " + (endTime - startTime));
        return result;
    }



}
