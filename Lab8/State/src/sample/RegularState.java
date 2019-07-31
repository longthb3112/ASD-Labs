package sample;

public class RegularState implements State {
    ControlMachine controlMachine;
    public RegularState(ControlMachine controlMachine){
        this.controlMachine = controlMachine;
    }
    @Override
    public String left() {
        return "5";
    }

    @Override
    public String accel() {
        return "9";
    }

    @Override
    public String right() {
        return "5";
    }

    @Override
    public String brake() {
        return "8";
    }
}
