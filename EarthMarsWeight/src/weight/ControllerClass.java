/*
 * This is the controller class"Using 3-tire Architecture
 * @Radwan
 */

package weight;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


public class ControllerClass {

    private ViewClass myView;
    private ModelClass myModel;


    public ControllerClass(ViewClass theView, ModelClass theModel) {

        this.myView = theView;
        this.myModel = theModel;
        this.myView.addCalculateListener(new CalculateListener());

    }

    class CalculateListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            // Surround interactions with the view with

            try{

             
                firstNumber = myView.getFirstNumber();
                myModel.CalculateNumbers(firstNumber, secondNumber);
                myView.setCalcSolution(myModel.getComputedValue());
          
            }

            catch(NumberFormatException ex){

                System.out.println(ex);

            }
 
        }

    }

}