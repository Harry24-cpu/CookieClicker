import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {

    private int cookiesClicked;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("");
        primaryStage.setTitle("cookie clicker");//title of the page
        AtomicInteger cookieClicker = new AtomicInteger();
        Label label = new Label("cookie clicker" );
        Button button = new Button("My Button");
        button.setText("start");
        button.setMaxSize(700, 700);
            button.setText("Click for cookies");
        button.setOnAction(actionEvent -> {
            cookiesClicked +=1;
            primaryStage.setTitle("cookie clicker " );
            label.setText ("" + cookiesClicked);
            Text text1 = new Text("");
            text.setX(800);
            text.setY(750);
        });

//layout
        HBox hbox = new HBox(text, label);
        VBox vbox1 = new VBox(hbox, button);

        Scene scene = new Scene(vbox1, 1000, 1000);
        primaryStage.setScene(scene);

        text.setFont(Font.font("Arial"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

