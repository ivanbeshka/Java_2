package Lesson4.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class Controller {

    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    public void textFieldOnAction(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.setText("");
    }

    public void enterClicked(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.setText("");
    }
}
