package at.spengergasse.gui;
/**
 * 
 */


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Locale;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

/**
 * @author Leo Fanzott
 *
 */
public class SimpleActionListenerFX implements EventHandler<ActionEvent>, MouseListener {
	
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
		if(source==simpleFrame.getStarteSpielBTN())

		//**********************************************************************
		// close
		if (source==simpleFrame.getCloseBTN()||
			source==simpleFrame.getMenuCloseMI()){
			simpleFrame.close();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

