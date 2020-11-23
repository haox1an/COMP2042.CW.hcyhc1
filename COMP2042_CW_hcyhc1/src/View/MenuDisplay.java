package View;

import Controller.FroggerButton;
import Controller.QuitButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import p4_group_8_repo.BackgroundImage;
import p4_group_8_repo.MyStage;

public class MenuDisplay {
	MyStage mainPane;
	Scene menuScene;
	Stage menuStage;
	
	FroggerButton startButton;
	FroggerButton helpButton;
	QuitButton quitButton;
	
	
	public MenuDisplay() {
		
		mainPane = new MyStage();
		menuScene = new Scene(mainPane, 600, 800);
		menuStage = new Stage();
		menuStage.setScene(menuScene);
		createBackground();
		createStartButton();
		createHelpButton();
		createQuitButton();
		addMusic();
		
	}
	
	public Stage getStage() {
		return menuStage;
	}
	
	public void createBackground() {
		BackgroundImage menuBackground = new BackgroundImage("file:src/View/Menu.jpg");
		mainPane.add(menuBackground);
	}
	
	
	public void createStartButton() 
	{
		startButton = new FroggerButton("START", 50, 200);
		mainPane.add(startButton);
		
		startButton.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
				{
					DisplayGame game = new DisplayGame();
					game.createGame();
				}
			});	
		}
	
	public void createHelpButton() 
	{
		helpButton = new FroggerButton("HELP", 50, 500);
		mainPane.add(helpButton);
		
		helpButton.setOnAction(new EventHandler<ActionEvent>()
			{
					
			@Override
			public void handle(ActionEvent event)
			{
				HelpDisplay help = new HelpDisplay();
				menuStage.setScene(help.helpScene);
			}
		});	
	}
	
	public void createQuitButton()
	{
		quitButton = new QuitButton(5, 700);
		mainPane.add(quitButton);
		
		quitButton.setOnAction(new EventHandler<ActionEvent>()
		{	
		@Override
		public void handle(ActionEvent event)
		{
			Platform.exit();
		}
	});	
		
	}
	
	public void addMusic() {
		mainPane.playMusic();
	}
	
	
	
}
