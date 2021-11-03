package app.view.forms.JavaFXWindow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WithdrawalScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label textLabel;

    private ATMMainWindow mainWindow;

    private final String TEXT = "FOR TEST PURPOSES ONLY!\n";
    private int sum = 0;

    @FXML
    void add50(ActionEvent event) {
        addSum(50);
    }

    @FXML
    void add100(ActionEvent event) {
        addSum(100);
    }

    @FXML
    void add500(ActionEvent event) {
        addSum(500);
    }

    @FXML
    void add1000(ActionEvent event) {
        addSum(1000);
    }

    private void addSum(int sum) {
        this.sum += sum;
        updateLabel();
    }

    private void updateLabel() {
        textLabel.setText(TEXT + "current sum: " + sum);
    }

    public int getSum() {
        return sum;
    }

    @FXML
    void initialize() {
    }

    public void setMainWindow(ATMMainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public void notifyZeroSum() {
        textLabel.setText("Сумма не введена!");
    }
}
