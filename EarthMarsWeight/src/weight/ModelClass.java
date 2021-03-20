/*
 * This is the model class"Using 3-tire Architecture
 * @Radwan
 */

package weight;
 
	
	public class ModelClass {
	
	
		    private int vlueComputed;
		    private int numOne;
	
		    public void CalculateNumbers(int num1, int num2){
		
		         this.numOne = num1;
		         num2=37;
		
		         vlueComputed = num1 * num2/100;	         
	
		    }
	
		    public int getComputedValue(){

		        return vlueComputed;

		    }
		    
		    public int getNumOne(){
		    	
		        return numOne;
	
		    }
		     
		}

	
	

