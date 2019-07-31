package sample;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private Button btnLeft;
    @FXML
    private Button btnAccel;
    @FXML
    private Button btnRight;
    @FXML
    private Button btnBrake;
    @FXML
    private ChoiceBox cbRoad;
    @FXML
    private TextArea txtResult;
    private ControlMachine controlMachine = new ControlMachine(this);
    public void setText(String text){
        txtResult.setText(text);
    }

    public void initialize() {
        cbRoad.setOnAction(this::oncbRoadChange);
        // existing code ...
    }

    private void oncbRoadChange(Event event) {
        String value = (String) cbRoad.getValue();
        txtResult.setText("");
        switch (value){
            case "Regular":
                controlMachine.setState(new RegularState(controlMachine));
                break;
            case "Gravel":
                controlMachine.setState(new GravelState(controlMachine));
                break;
            case "Wet":
                controlMachine.setState(new WetState(controlMachine));
                break;
            case "Ice":
                controlMachine.setState(new IceState(controlMachine));
                break;
             default:
                 controlMachine.setState(new RegularState(controlMachine));
                 break;
        }
    }

    @FXML protected void onbtnLeftClicked(ActionEvent e) {
        controlMachine.left();

    }
    @FXML protected void onbtnAccelClicked(ActionEvent e) {
        controlMachine.accel();

    }
    @FXML protected void onbtnRightClicked(ActionEvent e) {
        controlMachine.right();

    }
    @FXML protected void onbtnBrakeClicked(ActionEvent e) {
        controlMachine.brake();

    }

}
