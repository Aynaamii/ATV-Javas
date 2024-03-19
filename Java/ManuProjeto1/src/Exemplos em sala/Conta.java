
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TADS
 */
public class Conta {

    int numero;
    double saldo;
    double limite;
    String nome;

    public void deposita(double valor) {
        saldo = saldo + valor;
    }

    public boolean saca(double valor) {
        if (valor <= saldo + limite) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(Conta destino, double valor) {
        if (valor <= saldo + limite) {
            saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere1(Conta destino, double valor) {
        if (saca(valor) == true) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

}
