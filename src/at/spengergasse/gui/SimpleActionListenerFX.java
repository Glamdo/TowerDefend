package at.spengergasse.gui;
/**
 * 
 */


import java.io.IOException;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/**
 * @author Leo Fanzott
 *
 */
public class SimpleActionListenerFX implements EventHandler<ActionEvent> {
	
	// reference to panel
	final private SimpleFrameFX simpleFrame;
	// reference to the model
	
	/**
	 * 
	 * @param simpleFrame
	 */
	public SimpleActionListenerFX(SimpleFrameFX simpleFrame){
		this.simpleFrame=simpleFrame;
		// set values of the text fields
	}

	/* (non-Javadoc)
	 * @see javafx.event.EventHandler#handle(javafx.event.Event)
	 */
	@Override
	public void handle(ActionEvent arg0) {
		// get component which is source of the event
		Object source=arg0.getSource();
		//**********************************************************************
		// starteSpiel button
		//if(source==simpleFrame.get)

		//**********************************************************************
		// close
		if (source==simpleFrame.getCloseBTN()||
			source==simpleFrame.getMenuCloseMI()){
			simpleFrame.close();
		}
	}
}

