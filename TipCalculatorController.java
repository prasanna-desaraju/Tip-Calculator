package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipCalculatorController {
    @FXML
    private TextField billAmountField;
    @FXML
    private TextField tipPercentageField;
    @FXML
    private Label totalTipLabel;
    @FXML
    private Label totalAmountLabel;

    @FXML
    protected void handleCalculateTip() {
        try {
            double billAmount = Double.parseDouble(billAmountField.getText());
            double tipPercentage = Double.parseDouble(tipPercentageField.getText());
            double tipAmount = billAmount * (tipPercentage / 100);
            double totalAmount = billAmount + tipAmount;

            totalTipLabel.setText(String.format("%.2f", tipAmount));
            totalAmountLabel.setText(String.format("%.2f", totalAmount));
        } catch (NumberFormatException e) {
            totalTipLabel.setText("Invalid input");
            totalAmountLabel.setText("Invalid input");
        }
    }
}
