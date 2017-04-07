package at.spengergasse.gui;

import java.util.List;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


/**
 * Application
 * 
 * 
 *
 */
public class SimpleApplicationFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {	
		
		// miniicon setzen
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/at/spengergasse/gui/tower.png")));
		
		 // print commandline arguments to the terminal window
		 final Parameters params = getParameters();
	     final List<String> parameters = params.getRaw();
	     for (String s:parameters){
	    	 System.out.println(s);
	     }
	     // instanciate frame
		 new SimpleFrameFX(parameters);
	}
	
	

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
