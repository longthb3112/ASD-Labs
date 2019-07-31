package lab2.asd;

public class Adapter implements Stack, Queue{

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    private Adaptee adaptee;
    @Override
    public void push(String str) {
        adaptee.add(str);
    }
    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }

    @Override
    public void enQueue(String str) {
        adaptee.add(str);
    }

    @Override
    public String deQueue() {
        int start = 0;
       String str = adaptee.get(start);
       adaptee.remove(start);
       return str;
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }
    public void print(){
        adaptee.print();
    }
}
