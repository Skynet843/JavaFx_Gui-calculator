package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class MainContoler {
	 @FXML
	    private Label label2;

	    @FXML
	    private Label label1;
	    boolean con=true,con2=true;
	    String value;
	    
	    private double n1=0,n2=0;
	    
	@FXML
public void processNumber(ActionEvent event) {
		if(con) {
	   String value=((Button)event.getSource()).getText();
	   label1.setText(label1.getText() + value);
	   con =true;
		}else {
			label1.setText("");
			String value=((Button)event.getSource()).getText();
			   label1.setText(label1.getText() + value);
			   con =true;
		}
   }
public void processOperators(ActionEvent event) {
	if(label2.getText()=="") {
		con =false;
		n1=Double.valueOf(label1.getText());
		value=((Button)event.getSource()).getText();
		
		label2.setText(label2.getText()+ " "+label1.getText()+" "+value );
		
		
		
	}else {
		con =false;
		n2=Double.valueOf(label1.getText());
		double ans=Calculation.math(n1, n2, value);
		n1=ans;
		String temp=label1.getText();
		label1.setText(Double.toString(ans));
		value=((Button)event.getSource()).getText();
		label2.setText(label2.getText()+ " "+temp+" "+value );
		
		
	}
	
	
	   
   }
public void clear(ActionEvent event) {
	label1.setText("");
	label2.setText("");
	n1=0;
	n2=0;
	 con=true;
}
public void equal(ActionEvent event) {
	label2.setText("");
	double ans=Calculation.math(n1, Double.valueOf(label1.getText()), value);
	label1.setText(Double.toString(ans));
	n1=0;
	n2=0;
	 con=true;
}
    
    

}
