/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kelvi
 */
public class Info {

    String nomeConsole;
    int anoLançamento;
    String modelo;
    String nomeFabricante;
    int processamento;

    public Info(String nomeConsole, int anoLançamento, String modelo, String nomeFabricante, int processamento) {
        this.nomeConsole = nomeConsole;
        this.anoLançamento = anoLançamento;
        this.modelo = modelo;
        this.nomeFabricante = nomeFabricante;
        this.processamento = processamento;
    }

    public void exibirInformacoes() {
        System.out.println("Nome Console: " + nomeConsole);
        System.out.println("Ano de lacamento: " + anoLançamento);
        System.out.println("Modelo: " + modelo);
        System.out.println("Nome Fabricante: " + nomeFabricante);
        System.out.println("Processamento: " + processamento);
        System.out.println("");
    }
}
