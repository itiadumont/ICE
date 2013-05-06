import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PrincipalWindow extends Application
{
	public void start(Stage stage)
	{
		Group root = new Group();
		Scene scene = new Scene(root, 800, 800, Color.ALICEBLUE);
		stage.setTitle("Fenêtre principale de l'application ICE");
		stage.setScene(scene);
		stage.show();
	}
	
	public void init() throws Exception
	{
		super.init();
	}
	
	public static void main (String[] args)
	{
		launch(args);
	}
}