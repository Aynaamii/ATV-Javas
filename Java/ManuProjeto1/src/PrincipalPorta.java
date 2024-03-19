
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kelvi
 */
public class PrincipalPorta {

    public static void main(String[] args) {
        Porta porta;
        porta = new Porta();
        porta.pintar("azul");
        porta.dimensaoX(1.50);
        porta.dimensaoY(0.50);
        porta.dimensaoZ(0.50);
       

        porta.abre();
        JOptionPane.showMessageDialog(null, " " + porta.estaAberta());
        porta.fecha();
        JOptionPane.showMessageDialog(null, " " + porta.estaAberta());

        JOptionPane.showMessageDialog(null, " A cor da porta e  " + porta.qualCor());

        JOptionPane.showMessageDialog(null, " As dimensoes da porta sao = " + porta.dimensaoX() + " X " + porta.dimensaoY() + " Y " + porta.dimensaoZ() + " Z ");
    }
    
      

}
