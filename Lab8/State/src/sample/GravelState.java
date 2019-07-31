package sample;

public class GravelState implements State {
    ControlMachine controlMachine;
    public GravelState(ControlMachine controlMachine){
        this.controlMachine = controlMachine;
    }
    @Override
    public String left() {
        return "3";
    }

    @Override
    public String accel() {
        return "7";
    }

    @Override
    public String right() {
        return "3";
    }

    @Override
    public String brake() {
        return "6";
    }
}
