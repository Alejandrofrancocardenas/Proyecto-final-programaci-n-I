package co.edu.uniquindio.proyectofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("gestion.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Sistema de Gestión de Pacientes");
        stage.setScene(scene);
        stage.show();


}

    public static void main(String[] args) {
        launch();
    }
}