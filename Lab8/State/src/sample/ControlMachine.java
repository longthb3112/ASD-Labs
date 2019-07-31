package sample;

public class ControlMachine {
    Controller controller;
    private State currentState = new RegularState(this);
    public void setState(State state){
        currentState = state;
    }
    public ControlMachine(Controller controller){
        this.controller = controller;
    }
    public void left(){
        controller.setText(currentState.left());

    }
    public void accel(){
        controller.setText(currentState.accel());
    }
    public void right(){
        controller.setText(currentState.right());
    }
    public void brake(){
        controller.setText(currentState.brake());
    }
}
