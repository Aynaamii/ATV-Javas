
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TADS
 */
public class Classe4 {
    public static void main(String args[]){
        String dado = JOptionPane.showInputDialog( "infome a idade =");
        int idade = Integer.parseInt(dado);
        idade++;
        JOptionPane.showMessageDialog( null, "a nova idade é = "+idade);
    }
}
