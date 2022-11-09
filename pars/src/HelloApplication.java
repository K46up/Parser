import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("resources/pogoda.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1383, 799);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        Weather weather = new Weather(city);
    }
}
