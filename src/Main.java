import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {

    private int cookiesClicked;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Controls
        ChoiceBox<Object> choiceBox;
        choiceBox.getItems().add("Choice 1");
        choiceBox.getItems().add("Choice 2");
        choiceBox.getItems().add("Choice 3");
        String value = (String) choiceBox.getValue();
        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");
        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3);
        Font font = Font.font("Courier New", FontWeight.BOLD, 36);
        menuButton.setFont(font);

        Label label = new Label("cookie clicker" );

        Button button = new Button("My Button");
        button.setText("start");
        button.setMaxSize(700, 700);
            button.setText("Click for cookies");
        button.setOnAction(actionEvent -> {
            cookiesClicked +=1;
            primaryStage.setTitle("cookie clicker " );
            label.setText ("" + cookiesClicked);
        });
        Text text = new Text("Cookies CLicked");
        text.setX(800);
        text.setY(750);
        text.setFont(Font.font("Arial",14));

        // Layouts
        HBox hbox = new HBox(menuButton, text, label, choiceBox);
        VBox vbox1 = new VBox(hbox, button);

        // Scene and stage
        primaryStage.setTitle("cookie clicker");//title of the page
        Scene scene = new Scene(vbox1, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

