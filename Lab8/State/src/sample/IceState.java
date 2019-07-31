package sample;

public class IceState implements State{
    ControlMachine controlMachine;
    public IceState(ControlMachine controlMachine){
        this.controlMachine = controlMachine;
    }
    @Override
    public String left() {
        return "1";
    }

    @Override
    public String accel() {
        return "3";
    }

    @Override
    public String right() {
        return "1";
    }

    @Override
    public String brake() {
        return "2";
    }
}
