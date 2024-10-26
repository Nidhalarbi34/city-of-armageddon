package com.city;

import com.city.controller.Images;
import com.city.controller.Controller;
import com.city.controller.IntroMenuController;
import com.city.model.Game;
import com.city.utils.ResourceContainer;
import com.city.utils.ResourceUtils;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showIntro();
    }

  private void showIntro() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/IntroMenu.fxml"));
            Parent intro = fxmlLoader.load();
            IntroMenuController controller = fxmlLoader.getController();
            controller.setNextScreenHandler(this::showNextScreen);

            Scene scene = new Scene(intro);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showNextScreen() {
        try {
            ResourceContainer.loadAll();
            BorderPane root = FXMLLoader.load(ResourceUtils.getResourceURL("/view/view.fxml"));
            System.out.println("\n\nZ -> Up\n" +
                "Q -> Left\n" +
                "S -> Down\n" +
                "D -> Right\n" +
                "H -> Interact\n" +
                "J -> Attack with weapon 1\n" +
                "K -> Attack with weapon 2\n" +
                "L -> Attack with weapon 3\n" +
                "Escape or I -> Open/close Inventory\n"
            );
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("City Of Armageddon");
            scene.getStylesheets().add(ResourceUtils.getResourceURL("/view/style/stylesheet.css").toExternalForm());
            Font.loadFont(ResourceUtils.getResourceURL("/view/font/Wantedo.ttf").toExternalForm(), 24);
            primaryStage.getIcons().add(Images.ICON.get());
            primaryStage.centerOnScreen();
            primaryStage.toFront();
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    
}