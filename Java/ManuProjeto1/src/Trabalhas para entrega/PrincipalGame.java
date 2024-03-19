
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kelvi
 */
public class PrincipalGame {

    public static void main(String[] args) {
        Console v1;
        v1 = new Console();
        v1.nomeConsole = "Xbox One";
        v1.anoLançamento = 2013;
        v1.modelo = "One";
        v1.nomeFabricante = "Microsoft";
        v1.processamento = 420;
        Console v2 = new Console();
        v2.nomeConsole = "Nintendo Switch";
        v2.anoLançamento = 2015;
        v2.modelo = "Nintendo";
        v2.nomeFabricante = "Nintendo";
        v2.processamento = 120;

        Console v3 = new Console();

        v3.nomeConsole = "Playstation V";
        v3.anoLançamento = 2020;
        v3.modelo = "PS5";
        v3.nomeFabricante = "Sony";
        v2.processamento = 420;

        String nomes = v1.nomeConsole + " " + v2.nomeConsole + " " + v3.nomeConsole;
        JOptionPane.showMessageDialog(null, "Nome dos consoles = " + nomes);

        String nomeFabri = v1.nomeFabricante + " " + v2.nomeFabricante + " " + v3.nomeFabricante;
        JOptionPane.showMessageDialog(null, "Nome dos fabricantes = " + nomeFabri);

        String nomeModelo = v1.modelo + " " + v2.modelo + " " + v3.modelo;
        JOptionPane.showMessageDialog(null, "Nomes dos modelos = " + nomeModelo);

    }
}
