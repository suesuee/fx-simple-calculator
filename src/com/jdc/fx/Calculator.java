package com.jdc.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator {

	@FXML
	private TextField digit1;
	@FXML
	private TextField digit2;
	@FXML
	private Label result;

	private void clear() {
		digit1.clear();
		digit2.clear();
	}

	@FXML
	void divide() {
		try {
			double num1 = Double.parseDouble(digit1.getText());
			double num2 = Double.parseDouble(digit2.getText());
			result.setText("Divide: " + (num1 / num2));
			clear();
		} catch (Exception e) {
			if (e instanceof NumberFormatException) {
				result.setText("Invalid Input !!! Please enter number only...");
			} else {
				result.setText(e.getMessage());
			}
		}

	}

	@FXML
	void minus() {
		try {
			double num1 = Double.parseDouble(digit1.getText());
			double num2 = Double.parseDouble(digit2.getText());
			result.setText("Minus: " + (num1 - num2));
			clear();
		} catch (Exception e) {
			if (e instanceof NumberFormatException) {
				result.setText("Invalid Input !!! Please enter number only...");
			} else {
				result.setText(e.getMessage());
			}
		}
	}

	@FXML
	void multiply() {
		try {
			double num1 = Double.parseDouble(digit1.getText());
			double num2 = Double.parseDouble(digit2.getText());
			result.setText("Multiply: " + (num1 * num2));
			clear();
		} catch (Exception e) {
			if (e instanceof NumberFormatException) {
				result.setText("Invalid Input !!! Please enter number only...");
			} else {
				result.setText(e.getMessage());
			}
		}
	}

	@FXML
	void plus() {
		try {
			double num1 = Double.parseDouble(digit1.getText());
			double num2 = Double.parseDouble(digit2.getText());
			result.setText("Plus: " + (num1 + num2));
			clear();
		} catch (Exception e) {
			if (e instanceof NumberFormatException) {
				result.setText("Invalid Input !!! Please enter number only...");
			} else {
				result.setText(e.getMessage());
			}
		}
	}
}
