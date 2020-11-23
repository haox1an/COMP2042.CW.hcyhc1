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
	}
	
	
	
}
