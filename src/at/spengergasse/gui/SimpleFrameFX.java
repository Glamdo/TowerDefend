package at.spengergasse.gui;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * 
 * Frame
 * 
 * 
 *
 */
public class SimpleFrameFX extends Stage {

	// buttons
	final private Button starteSpielBTN;
	final private Button closeBTN;
		
	// menu items
	final MenuItem menuCloseMI;

	// reference to the listener
	final private SimpleActionListenerFX simpleListener;	
	
	// arguments to the frame
	final private List<String> args;
	
	/**
	 * 
	 */
	public SimpleFrameFX(List<String> args){	
		
		// set arguments
		this.args=args;
		
		// instanciate listener
		simpleListener=new SimpleActionListenerFX(this);
				
		// top level pane: includes menubar + borderpane
		VBox vBox=new VBox();
		
		// borderpane
		BorderPane borderPane=new BorderPane();
		
		
		// gridpane contains rows and columns
		GridPane gridPane=new GridPane();
		gridPane.setPadding(new Insets(10,10,10,10));

		// gap between the components
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		//flowpane for buttons
		FlowPane buttonPane=new FlowPane();	
		// starteSpiel button
		starteSpielBTN=new Button("Spiel starten");
		// add action handler
		starteSpielBTN.addEventHandler(ActionEvent.ACTION, simpleListener);
		// Close Button
		closeBTN = new Button("Schließen");
		closeBTN.addEventHandler(ActionEvent.ACTION, simpleListener);
		// hbox for read pupil button and text field to enter filename
		HBox hBox=new HBox();
		hBox.setPadding(new Insets(2, 2, 2, 2));

		// add components
		buttonPane.getChildren().add(starteSpielBTN);
		buttonPane.getChildren().add(hBox);
		buttonPane.getChildren().add(closeBTN);
		
		// add panes to borderpane
		borderPane.setBottom(buttonPane);
		borderPane.setCenter(gridPane);
		
		// set properties of the frame
		setTitle("TowerDefend");
		setResizable(false);
		centerOnScreen();

		// create and add a menu
		MenuBar menuBar = new MenuBar();
        // Menu file, the underscore defines the following character for mnemonic
		// there is method setMnemonicParsing - default is true
        Menu menuFile = new Menu("_File");
 
    
        // menu close
        menuCloseMI = new MenuItem("_Close");
        // add listener
		menuCloseMI.addEventHandler(ActionEvent.ACTION, simpleListener);
		menuCloseMI.setMnemonicParsing(true);
        menuCloseMI.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+C")
        );
        // add menu items to menu file
        menuFile.getItems().addAll(menuCloseMI);
        // menu default     
        menuBar.getMenus().addAll(menuFile);
        
        // add menu bar and borderpane to vbox
        vBox.getChildren().addAll(menuBar,borderPane);

		// set the scene and add borderpane to the scene
		Scene scene=new Scene(vBox, 460, 170);
		setScene(scene);
		
		// show frame
		show();

	}


	public Button getCloseBTN() {
		return closeBTN;
	}

	public MenuItem getMenuCloseMI() {
		return menuCloseMI;
	}




	public Button getStarteSpielBTN() {
		return starteSpielBTN;
	}


	/**
	 * @return the args
	 */
	public List<String> getArgs() {
		return args;
	}

	
}

