/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogwarts;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ludwi
 */
public class Start
{

    private static InfDB idb;

    public static void main(String[] args)
    {
        try
        {
            idb = new InfDB("C:\\db\\hogdb.fdb");
        } catch (InfException ettUndantag)
        {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

        new Login(idb).setVisible(true);

    }

}
