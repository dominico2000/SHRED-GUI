package shredgui;


import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class Controller {

    @FXML
    public TextField shredFilePathTextField;

    public CheckBox forceCheckBox;
    public CheckBox iterationsCheckBox;
    public CheckBox randomDataSourceCheckBox;
    public CheckBox shortAndRemoveCheckBox;
    public CheckBox removeCheckBox;
    public CheckBox exactCheckBox;
    public CheckBox zeroCheckBox;

    public Spinner iterationsSpinner;
    public TextField randomDataPathTextField;
    public Button randomDataPathButton;
    public ChoiceBox removeModeChoiceBox;

    public TextArea logTextArea;





    //region Enable and disable elements by options checkboxes
    @FXML
    public void iterationCheckBoxAction(ActionEvent actionEvent) throws IOException {
        if( iterationsCheckBox.isSelected() ) {
            iterationsSpinner.setDisable( false );
        }
        else {
            iterationsSpinner.setDisable( true );
        }
    }

    @FXML
    public void randomDataSourceCheckBoxAction(ActionEvent actionEvent) throws IOException {
        if( randomDataSourceCheckBox.isSelected() ) {
            randomDataPathTextField.setDisable( false );
            randomDataPathButton.setDisable( false );
        }
        else {
            randomDataPathTextField.setDisable( true );
            randomDataPathButton.setDisable( true );
        }
    }

    @FXML
    public void removeCheckBoxAction(ActionEvent actionEvent) throws IOException {
        if( removeCheckBox.isSelected() ) {
            removeModeChoiceBox.setDisable( false );
        }
        else {
            removeModeChoiceBox.setDisable( true );
        }
    }
    //endregion

    

}
