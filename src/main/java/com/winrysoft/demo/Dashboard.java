package com.winrysoft.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Dashboard {

    private User user;

    @FXML
    private Label username;
    @FXML
    private Label password;

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void loginAction() {

    }

    public void setSignup() {
        mainApp.setSignupScreen();
    }

    public void setLogin() {
        mainApp.setSignupScreen();
    }

    public void setUser(User user) {

        this.user = user;

        username.setText("Hello " + user.getUsername());

        password.setText("Your password is " + user.getPassword());

    }
}
