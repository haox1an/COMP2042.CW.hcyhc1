package View;

import Controller.QuitButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import p4_group_8_repo.BackgroundImage;
import p4_group_8_repo.MyStage;

public class HelpDisplay {
		MyStage helpPane;
		Scene helpScene;
	
	public HelpDisplay() {
		helpPane = new MyStage();
		helpScene = new Scene(helpPane, 600, 800);
		helpPane.start();
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
		
		quitButton.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				Platform.exit();

			}
		});
		
	}
	
	
}
