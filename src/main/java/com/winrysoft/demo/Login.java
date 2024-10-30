package com.winrysoft.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login {
    @FXML
    private Label error;
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void loginAction() {

        User user = new User(username.getText(), password.getText());

        if (mainApp.loginUser(username.getText(), password.getText()) != null) {
            System.out.println("Success");
            mainApp.setUser(user);

            mainApp.setDashboard();
        } else {
            error.setText("Username/password is wrong");
        }

    }

    public void setSignup() {
        mainApp.setSignupScreen();
    }

}
