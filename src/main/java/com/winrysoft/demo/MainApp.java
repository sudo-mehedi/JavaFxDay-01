package com.winrysoft.demo;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage window;

    private User user;

    List<User> users = new ArrayList<>();

    public void setUser(User user) {
        this.user = user;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        this.window = window;
        setLoginScreen();
    }

    public void setLoginScreen() {
        window.setTitle("Login Screen");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));

            Parent root = loader.load();

            Login loginController = loader.getController();

            loginController.setMainApp(this);

            Scene scene = new Scene(root);

            window.setScene(scene);

            window.show();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public void setSignupScreen() {
        window.setTitle("Signup Screen");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));

            Parent root = loader.load();

            Signup signupController = loader.getController();
            signupController.setMainApp(this);
            Scene scene = new Scene(root);

            window.setScene(scene);

            window.show();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public void setDashboard() {

        window.setTitle("Dashboard");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));

            Parent root = loader.load();

            Dashboard dashboardController = loader.getController();
            dashboardController.setMainApp(this);
            dashboardController.setUser(user);
            Scene scene = new Scene(root);

            window.setScene(scene);

            window.show();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public void addUser(User user) {
        users.add(user);
    }

    public User loginUser(String username, String password) {

        User authUser = null;

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                authUser = user;
                break;
            }
        }

        return authUser;
    }

}
