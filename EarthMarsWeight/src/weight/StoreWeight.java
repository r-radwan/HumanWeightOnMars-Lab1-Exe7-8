
/* This class to store the weight 
/* Exercise 8
*I combined Exercise 8 with Exercise7
*
*@Radwan
*/

package weight;
import java.util.HashMap;

public class StoreWeight {
	
	/*this HasMap list to store the weight on the earth and mars
	 * the the key is earth weight and the value is the mars weight
	 */
	HashMap<Integer, Integer> weightList = new HashMap<Integer, Integer>();
	
	ModelClass m;
	public StoreWeight() {
		
		//calling the functions that return the earth and mars values
		weightList.put(m.getNumOne(),m.getComputedValue() );
		
	}

}