package lab9.asd;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Profiler linkListProfiler = new DecoratorProfiler(new LinkedList());
        linkListProfiler.add(1);
        linkListProfiler.contains(1);
        System.out.println(linkListProfiler.size());
        linkListProfiler.remove(1);

        Profiler arrayListProfiler = new DecoratorProfiler(new ArrayList());
        arrayListProfiler.add(1);
        arrayListProfiler.contains(1);
        System.out.println(arrayListProfiler.size());
        arrayListProfiler.remove(1);
    }
}
