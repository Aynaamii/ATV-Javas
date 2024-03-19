
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kelvi
 */
public class PrincipalCasa {

    public static void main(String[] args) {
        Casa casa = new Casa();
        Porta porta = new Porta();
        casa.pintar("rosa");
        casa.porta1 = new Porta();
        casa.porta2 = new Porta();
        casa.porta3 = new Porta();
        JOptionPane.showMessageDialog(null, " A cor da casa e " + casa.qualCor());

        casa.porta1.abre();
        JOptionPane.showMessageDialog(null, " A porta n°1 esta " +  casa.porta1.estaAberta());
        casa.porta2.abre();
        JOptionPane.showMessageDialog(null, " A porta n°2 esta " +  casa.porta2.estaAberta());
        casa.porta3.fecha();
        JOptionPane.showMessageDialog(null, " A porta n°3 esta " +  casa.porta3.estaAberta());

        int totalPortas =  casa.porta1.quantasPortasEstaoAbertas() +  casa.porta2.quantasPortasEstaoAbertas() +  casa.porta3.quantasPortasEstaoAbertas();
        JOptionPane.showMessageDialog(null, " O total de portas abertas e " + totalPortas);

    }
    

}
