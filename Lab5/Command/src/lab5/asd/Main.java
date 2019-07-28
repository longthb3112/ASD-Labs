package lab5.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Command command1 = new CreateCommand();
        Command command2 = new MoveCommand();
        Command command3 = new ScaleComand();
        CommandManager manager = new CommandManager();
        manager.addCommad(command3);
        manager.addCommad(command2);
        manager.addCommad(command1);

        while (manager.hasNext()){
            manager.RunNextCommand();
            System.out.println(Receiver.getShape());
        }
        while (manager.canUndo()){
            manager.undo();
            System.out.println(Receiver.getShape());
        }
    }
}
