package View;

import Controller.MyStage;
import Controller.QuitButton;
import Model.BackgroundImage;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelpDisplay {
		MyStage helpPane;
		Scene helpScene;
		ImageView instructions;
				
	public HelpDisplay() {

		helpPane = new MyStage();
		helpScene = new Scene(helpPane, 600, 800);

		createBackground();
		createQuitButton();
		addInstructions();
		
	
	}
	
	
	public void createBackground()
	{
		BackgroundImage helpBackground = new BackgroundImage("file:src/View/Menu.jpg");
		helpPane.add(helpBackground);

	}
	
	
	public void createQuitButton()
	{
		QuitButton quitButton = new QuitButton(5, 700);
		helpPane.add(quitButton);
		quitButton.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				Platform.exit();
			}
		});
	}
	
	public void addInstructions() {
		instructions = new ImageView(new Image("file:src/View/HowToPlay.png", 500, 700, true, true));
		helpPane.add(instructions);
		instructions.setLayoutX(50);
		instructions.setLayoutY(250);
		
		
	}
	
}
