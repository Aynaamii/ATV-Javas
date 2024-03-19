
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
public class PrincipalConta {

    public static void main(String[] args) {
        Conta c1;
        c1 = new Conta();
        c1.numero = 1111;
        c1.saldo = 1000;
        c1.limite = 2000;
        c1.nome = "Francisco";

//        c1.deposita(2222);
//        if (c1.saca(2000) == true) {
//            JOptionPane.showMessageDialog(null, "Saque ok");
//        } else {
//            JOptionPane.showMessageDialog(null, "Saque Nok ");
//        }
//
//        JOptionPane.showMessageDialog(null, "O novo saldo de c1 = " + c1.saldo);
        Conta c2 = new Conta();
        c2.numero = 2222;
        c2.saldo = 2000;
        c2.limite = 3000;
        c1.nome = "Doria";

        c1.transfere(c2, 666);

        JOptionPane.showMessageDialog(null, "O novo saldo de c1 = " + c1.saldo);
        JOptionPane.showMessageDialog(null, "O novo saldo de c1 = " + c2.saldo);
//
//        double total = c1.saldo + c2.saldo;
//        JOptionPane.showMessageDialog(null, "O solado total é = " + total);
//
//        double totalGeral = c1.saldo + c1.limite + c2.saldo + c2.limite;
//        JOptionPane.showMessageDialog(null, "O solado geral é = " + totalGeral);
    }

}
