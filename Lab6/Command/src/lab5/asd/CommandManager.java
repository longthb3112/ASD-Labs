package lab5.asd;

import java.util.Stack;

public class CommandManager {
    private Stack<Command> commands = new Stack<>();
    private Stack<Command> executedCommands = new Stack<>();

    public void RunNextCommand(){
        if(!commands.isEmpty()) {
            Command command = commands.pop();
            command.execute();
            executedCommands.push(command);
        }
    }
    public void addCommad(Command command){
        commands.push(command);
    }
    public boolean hasNext(){
        return !commands.isEmpty();
    }
    public void undo(){
        if(!executedCommands.isEmpty()){
            Command command = executedCommands.pop();
            command.undo();
        }
    }
    public boolean canUndo(){
        return !executedCommands.isEmpty();
    }

}
