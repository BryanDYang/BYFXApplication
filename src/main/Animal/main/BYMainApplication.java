package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.DataProvider;
import model.Dog;

import java.io.IOException;
import java.util.Objects;

public class BYMainApplication extends Application {

    @Override
    public void init() {
        System.out.println("Starting!!!!");
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void stop() {
        System.out.println("Terminated!!!!");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog(1, "Siberian Husky", 15, "Crafty", 599.99, true, "Whistles");
        Dog dog2 = new Dog(2, "Alaskan Malamute", 12, "Energetic", 999.99, true, "Climbs");
        Dog dog3 = new Dog(3, "Dalmatian", 13, "Energetic", 1999.99, true, "Gymnast");
        Dog dog4 = new Dog(4, "Dogo Argentino", 12, "Protective", 1599.99, true, "Whistles");
        Dog dog5 = new Dog(5, "Anatolian Shepherd", 12, "Intelligent", 2599.99, true, "Gymnast");

        DataProvider.addAnimal(dog1);
        DataProvider.addAnimal(dog2);
        DataProvider.addAnimal(dog3);
        DataProvider.addAnimal(dog4);
        DataProvider.addAnimal(dog5);

        launch(args);
    }
}