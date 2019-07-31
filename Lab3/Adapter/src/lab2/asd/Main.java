package lab2.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("------------QUEUE------------");
        Queue queue1 = new Adapter();
        queue1.enQueue("a");
        queue1.print();
        queue1.enQueue("b");
        queue1.print();
        queue1.deQueue();
        queue1.print();
        queue1.deQueue();
        queue1.print();

        System.out.println("------------STACK------------");
        Stack stack1 = new Adapter();
        stack1.push("a");
        stack1.print();
        stack1.push("b");
        stack1.print();
        stack1.pop();
        stack1.print();
        stack1.pop();
        stack1.print();
    }
}
