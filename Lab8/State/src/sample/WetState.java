package sample;

public class WetState implements State{
    ControlMachine controlMachine;
    public WetState(ControlMachine controlMachine){
        this.controlMachine = controlMachine;
    }
    @Override
    public String left() {
        return "4";
    }

    @Override
    public String accel() {
        return "9";
    }

    @Override
    public String right() {
        return "4";
    }

    @Override
    public String brake() {
        return "7";
    }
}
