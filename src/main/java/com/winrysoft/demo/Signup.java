package com.winrysoft.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Signup {

    @FXML
    private TextField username;
    @FXML
    private TextField password;

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void signupAction() {

        mainApp.addUser(new User(username.getText(), password.getText()));
        System.out.println("Success");

    }

    public void setLogin() {
        mainApp.setLoginScreen();
    }
}
