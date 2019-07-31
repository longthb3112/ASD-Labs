package lab5.asd;

public class MoveCommand implements Command {
   Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    @Override
    public void execute() {
        Shape shape = Receiver.getShape();
        Position position = shape.getPosition();
        position.y = position.y + 3;
        shape.setPosition(position);
        Receiver.setShape(shape);
        System.out.println("Executed Move Command");
    }

    @Override
    public void undo() {
        Shape shape = Receiver.getShape();
        Position position = shape.getPosition();
        position.y = position.y - 3;
        shape.setPosition(position);
        Receiver.setShape(shape);
        System.out.println("Executed Undo Move Command");
    }
}
