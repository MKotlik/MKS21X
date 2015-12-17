import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JTextField tempInput;
    private JLabel tempOutput;

    private boolean DEBUG = false; //Toggle debugging print statements!

    public TempConversionWindow() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
        this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	tempInput = new JTextField(10);
	tempOutput = new JLabel("Temp Output");
	
	JButton cConvert = new JButton("Convert C to F");
	cConvert.addActionListener(this);
	cConvert.setActionCommand("CtoF");
	
	JButton fConvert = new JButton("Convert F to C");
	fConvert.addActionListener(this);
	fConvert.setActionCommand("FtoC");
	
	pane.add(tempInput);
	pane.add(tempOutput);
	pane.add(cConvert);
	pane.add(fConvert);

	if (DEBUG){System.out.println("Debugging enabled");}
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("CtoF")){
	    if (DEBUG){System.out.println("CtoF Clicked");}
	    if (DEBUG){System.out.println("Text field content: " + tempInput.getText());}
	    if (!tempInput.getText().equals("")){
		try {
		    double input = Double.parseDouble(tempInput.getText());
		    String output = Double.toString(TempConvert.CtoF(input));
		    if (DEBUG){System.out.println("Output: " + output);}
		    tempOutput.setText(output);
		} catch (NumberFormatException e1){
		    if (DEBUG){System.out.println("NumberFormatException caught; text field contained non-number");}
		    tempOutput.setText("Digits only please");
		}
	    } else {
		if (DEBUG){System.out.println("No input entered");}
	    }
	}
	if(event.equals("FtoC")){
	    if (DEBUG){System.out.println("FtoC Clicked");}
	    if (DEBUG){System.out.println("Text field content: " + tempInput.getText());}
	    if (!tempInput.getText().equals("")){
		try {
		    double input = Double.parseDouble(tempInput.getText());
		    String output = Double.toString(TempConvert.FtoC(input));
		    if (DEBUG){System.out.println("Output: " + output);}
		    tempOutput.setText(output);
		} catch (NumberFormatException e2){
		    if (DEBUG){System.out.println("NumberFormatException caught; text field contained non-number");}
		    tempOutput.setText("Digits only please");
		}
	    } else {
		if (DEBUG){System.out.println("No input entered");}
	    }
	}
    }
}
