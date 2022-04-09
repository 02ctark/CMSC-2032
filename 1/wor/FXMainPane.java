
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
@SuppressWarnings("unused")
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button Hello, Howdy, Chinese, Clear, Exit;
	
	Label label;
	TextField textField;
	
	HBox HBox1;
	HBox HBox2;
	
	
	//student Task #4:
	//  declare an instance of DataManager
	
	DataManager dataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		
		Hello = new Button("Hello");
		Howdy = new Button("Howdy");
		Chinese = new Button("Chinese");
		Clear = new Button("Cafads");
		Exit = new Button("Exit");
		
		label = new Label("Feedback");
		
		textField = new TextField();
		

		
		//  instantiate the HBoxes
		HBox1 = new HBox();
		HBox2 = new HBox();
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		//  set margins and set alignment of the components
		HBox.setMargin(Hello, new Insets(10));
		HBox.setMargin(Howdy, new Insets(10));
		HBox.setMargin(Chinese, new Insets(10));
		HBox.setMargin(Clear, new Insets(10));
		HBox.setMargin(Exit, new Insets(10));
		
		HBox1.setAlignment(Pos.CENTER);
		HBox2.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		
		HBox2.getChildren().addAll(label, textField);
		
		
		//  add the buttons to the other HBox
		HBox1.getChildren().addAll(Hello, Howdy, Chinese, Clear, Exit);
		
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(HBox1, HBox2);
		
		Hello.setOnAction(new ButtonHandler());
		Howdy.setOnAction(new ButtonHandler());
		Chinese.setOnAction(new ButtonHandler());
		Clear.setOnAction(new ButtonHandler());
		Exit.setOnAction(new ButtonHandler());
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
		public class ButtonHandler implements EventHandler<ActionEvent>{
			
			public void handle(ActionEvent event){
				
				if( event.getTarget() == Hello) {
					
					textField.setText(dataManager.getHello());
					
				}else if(event.getTarget() == Howdy) {
					
					textField.setText(dataManager.getHowdy());
					
				}else if( event.getTarget() == Chinese) {
					
					textField.setText(dataManager.getChinese());
				}else if( event.getTarget() == Clear) {
					
					textField.setText("");
				}else if ( event.getTarget() == Exit) {
					
					Platform.exit(); 
					System.exit(0);
					
				}
					
			
				
			}
		
	}



	
}
