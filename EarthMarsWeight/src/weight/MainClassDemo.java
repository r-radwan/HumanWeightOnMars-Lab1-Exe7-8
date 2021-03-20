/*
 * This is the Main class
 * @Radwan
 */

package weight;
import javax.swing.JTable;


public class MainClassDemo {

    public static void main(String[] args) {

        ViewClass vobj = new ViewClass();

        ModelClass mobj = new ModelClass();

        ControllerClass cobj = new ControllerClass(vobj,mobj);

        vobj.setVisible(true);

    }

}