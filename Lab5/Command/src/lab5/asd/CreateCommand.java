package lab5.asd;

public class CreateCommand implements Command {
    Object state;

    @Override
    public void execute() {
        Shape shape = new Shape();
        shape.setLength(5);
        shape.setWidth(5);
        shape.setPosition(new Position(0,0));
        Receiver.setShape(shape);
        System.out.println("Executed Create Command");
    }

    @Override
    public void undo() {
        Receiver.setShape(new Shape());
        System.out.println("Executed Undo Create Command");
    }
}
