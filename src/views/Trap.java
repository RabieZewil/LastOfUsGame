package views;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Trap {
	
	public static void display() {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Trap");
		
		//Load the background image
		Image backgroundImage = new Image("trap.jpg"); 

		// Create a BackgroundSize object to fit the window size and center the image
		BackgroundSize backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false);
		BackgroundPosition backgroundPosition = BackgroundPosition.CENTER;

		// Create a BackgroundImage object with the image, repeat option, sizing, and position
		BackgroundImage backgroundImg = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, backgroundPosition, backgroundSize);

		// Create a Background object with the background image
		Background background = new Background(backgroundImg);
		
		Label l = new Label("You were Traped");
		Button close = new Button("OK!");
		close.setOnAction(e -> window.close());
		VBox layout = new VBox(10);
		layout.getChildren().addAll(l, close);
		layout.setAlignment(Pos.BOTTOM_CENTER);
		layout.setBackground(background); // Set the background for the layout
		Scene alert = new Scene(layout);
		window.setScene(alert);
		window.setMinWidth(500);
		window.setMinHeight(500);
		window.showAndWait();
	}
}
