/**
 * JavaFXExample.java
 *
 * @author harleenchadha
 *
 * 01-Nov-2015
 */
package com.nagarro.nagp.assignment;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * The Class JavaFXExample takes an input from the user and flash the input in
 * different transition effects
 */
public class JavaFXExample extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Transitions Effects");
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(pane, 300, 300);

		Text sceneTitle = new Text("Welcome");
		sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
		pane.add(sceneTitle, 0, 0, 2, 1);
		Label text = new Label("Enter Text:");
		pane.add(text, 0, 1);
		final TextField textField = new TextField();
		pane.add(textField, 1, 1);

		Button btn = new Button("Click");
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		hbox.getChildren().add(btn);
		pane.add(hbox, 1, 4);

		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				GridPane pane2 = new GridPane();
				pane2.setAlignment(Pos.CENTER);
				pane2.setHgap(10);
				pane2.setVgap(10);
				pane2.setPadding(new Insets(25, 25, 25, 25));
				Scene scene2 = new Scene(pane2, 300, 300);

				Text text1 = new Text();
				text1.setText(textField.getText());
				pane2.add(text1, 1, 0);
				FadeTransition ft = new FadeTransition(Duration.millis(3000),
						text1);
				ft.setFromValue(1.0);
				ft.setToValue(0.1);
				ft.setCycleCount(Timeline.INDEFINITE);
				ft.setAutoReverse(true);
				ft.play();

				Text text2 = new Text();
				text2.setText(textField.getText());
				pane2.add(text2, 1, 3);
				ScaleTransition st = new ScaleTransition(Duration.millis(2000),
						text2);
				st.setByX(1.5f);
				st.setByY(1.5f);
				st.setCycleCount(4);
				st.setAutoReverse(true);
				st.play();

				Text text3 = new Text();
				text3.setText(textField.getText());
				pane2.add(text3, 1, 6);
				RotateTransition rt = new RotateTransition(Duration
						.millis(3000), text3);
				rt.setByAngle(180);
				rt.setCycleCount(4);
				rt.setAutoReverse(true);
				rt.play();

				primaryStage.setScene(scene2);
				primaryStage.show();
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}
