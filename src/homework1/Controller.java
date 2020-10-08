package homework1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class Controller {

Vehicle[]vehicles = new Vehicle[3000];
int count = -1;

@FXML
javafx.scene.control.Label vehicleNumber;
@FXML
ChoiceBox types;

    @FXML
    private void handleAddVehicleAction(ActionEvent event) {
        // Button was clicked, do something...
        if(count<3000){
            count++;
            vehicleNumber.setText(Integer.toString(count +1));
            Vehicle vehicle = new Vehicle();
            vehicle.setType(types.getSelectionModel().getSelectedItem().toString());
            vehicles[count]=vehicle;

        }

    }

    @FXML
    private void handleRemoveVehicleAction(ActionEvent event) {
        // Button was clicked, do something...
        if(count>=0){
            vehicles[count]=null;
            vehicleNumber.setText(Integer.toString(count));
            count--;
        }


    }
}
