package lab5.asd;

public class ScaleComand implements Command{
    Object state;
    @Override
    public void execute() {
        Shape shape = Receiver.getShape();
        shape.setLength(shape.getLength() * 2);
        Receiver.setShape(shape);
        System.out.println("Executed Scale Command");
    }

    @Override
    public void undo() {
        Shape shape = Receiver.getShape();
        shape.setLength(shape.getLength() / 2);
        Receiver.setShape(shape);
        System.out.println("Executed Undo Scale Command");
    }
}
