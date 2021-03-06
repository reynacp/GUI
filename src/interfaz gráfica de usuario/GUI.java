*REYNA 
 */
package gui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Samsung
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame ();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Cesba Ventana");
        
        frame.setResizable(true);
        //formato default
        //frame.getContentPane().setBackground(Color.GREEN);
        //formato RGB
        //frame.getContentPane().setBackground(new Color (28,26, 198));
        //FORMATO HEXADECIMAL:
        frame.getContentPane().setBackground (new Color (0x1AC3C6));
        
     // TODO code application logic here
    }
    
}
