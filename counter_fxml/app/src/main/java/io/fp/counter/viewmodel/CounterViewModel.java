package io.fp.counter.viewmodel;

import io.fp.counter.model.CounterModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterViewModel {
    
    private CounterModel model;

    @FXML
    public void initialize(){
        model = new CounterModel();
    }

    @FXML
    private Label numberOfClicks;

    public static final String PREFIX = "Nummber of clicks: ";

    @FXML
    public void handleClickMe(ActionEvent event) {
        model.increaseCounter();;
        updateNumberOfClicks(model.getCounter());
    }

    private void updateNumberOfClicks(int counter){
        numberOfClicks.setText(PREFIX+model.getCounter());
    }
    
}
