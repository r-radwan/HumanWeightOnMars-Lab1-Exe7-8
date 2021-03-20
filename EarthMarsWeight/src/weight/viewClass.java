package weight;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * This class to create the buttons and jtext and so on
 * 
 * @ Radwan
 * */

 class ViewClass extends JFrame{

    private JButton btnpress = new JButton("Mars Weigh");
    
    private JLabel MessageLabel = new JLabel("Key in Weight on Earth");
    
    private JTextField OutputMars = new JTextField(15);
    private JTextField InputEarth  = new JTextField(15); 
   
//These ArrayList to store Human weight on earth and Mars
   ArrayList<ViewClass> earth;
   ArrayList<ViewClass> mars;


    ViewClass(){
   
        JPanel PanelView = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 200);
        
        btnpress.addActionListener(new ActionListener(){
        	
       
	   public void actionPerformed(ActionEvent e) {
				
       ViewClass ViewClassObject= new ViewClass();
       earth.add(ViewClassObject)	; //Storing Earth Weight in ArrayList	
       ViewClassObject.InputEarth.getText();
       ViewClassObject.OutputMars.getText();
       mars.add(ViewClassObject);//Storing Earth Weight in ArrayList


				// TODO Auto-generated method stub
			}
			});
        
        PanelView.add(MessageLabel);        
        PanelView.add(InputEarth);
        PanelView.add(btnpress);
        PanelView.add(OutputMars);   
        this.add(PanelView);   

    }
    

    public int getFirstNumber(){

        return Integer.parseInt(InputEarth.getText());

    }
   
  public int getCalcSolution(){

        return Integer.parseInt(OutputMars.getText());

    }

    public void setCalcSolution(int solution){
    
        OutputMars.setText(Integer.toString(solution));

    }

    void addCalculateListener(ActionListener ImplementListener){

        btnpress.addActionListener(ImplementListener);

    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
