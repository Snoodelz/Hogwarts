/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogwarts;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ludwi
 */
public class Validation
{

    public static boolean textFieldHasValue(JTextField rutaAttKolla)
    {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty())
        {
            resultat = false;
            //Om textrutan är tom så visa felmeddelande
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }

    public static boolean isInteger(JTextField rutaAttKolla)
    {
        boolean resultat = true;

        try
        {
            String textString = rutaAttKolla.getText();
            Integer.parseInt(textString);
        } 
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal.");
            resultat = false;
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }

}
