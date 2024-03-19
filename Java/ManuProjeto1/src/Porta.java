/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kelvi
 */
public class Porta extends Casa {

    String cor;
    boolean aberta;
    double dimensaoX, dimensaoY, dimensaoZ;
    int abertas;

    public void pintar(String cor) {
        this.cor = cor;
    }

    public String qualCor() {
        return this.cor;
    }

    public void abre() {
        if (this.aberta == false) {
            this.aberta = true;
        }
    }

    public void fecha() {
        if (this.aberta == true) {
            this.aberta = false;
        }
    }

    public String estaAberta() {
        if (this.aberta == true) {

            return "Aberta";
        } else {
            return "Fechada";
        }
    }

    public int quantasPortasEstaoAbertas() {
        if (this.aberta == true) {
            this.abertas +=1;
        }
        return abertas;

    }

    public void dimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public void dimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public void dimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public double dimensaoX() {
        return this.dimensaoX;
    }

    public double dimensaoY() {
        return this.dimensaoY;
    }

    public double dimensaoZ() {
        return this.dimensaoZ;
    }

}
