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

    @FXML
    void shredFileBrowseOnAction(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Select files to shred.");
        File file = chooser.showOpenDialog(new Stage());
        shredFilePathTextField.setText(file.getAbsolutePath());
    }

    @FXML
    void randomDataPathOnAction(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Select files to shred.");
        File file = chooser.showOpenDialog(new Stage());
        randomDataPathTextField.setText(file.getAbsolutePath());
    }

    @FXML
    void shredButtonOnAction(ActionEvent event) {
        logTextArea.clear();
        String toLogTextArea = new String();
        String params = new String();

        if( forceCheckBox.isSelected() ) params += "-f ";
        if( iterationsCheckBox.isSelected() ) params += "--iterations=" + iterationsSpinner.getValue().toString()+" ";
        if( randomDataSourceCheckBox.isSelected() ) params += "--random-source=" + randomDataPathTextField.getText() + " ";
        if( shortAndRemoveCheckBox.isSelected() ) params += "-u ";
        if( removeCheckBox.isSelected() ) params += "--remove=" + removeModeChoiceBox.getSelectionModel().getSelectedItem().toString() + " ";
        if( exactCheckBox.isSelected() ) params += "-x ";
        if( zeroCheckBox.isSelected() ) params += "-z ";

        String command = "shred " + params + shredFilePathTextField.getText();
        logTextArea.setText(command);



    }


}
