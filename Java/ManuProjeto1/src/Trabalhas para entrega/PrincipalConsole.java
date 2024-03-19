

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kelvi
 */
public class PrincipalConsole {

    public static void main(String[] args) {
        Info i1;
        Info i2;
        Info i3;
        i1 = new Info("Xbox one", 2013, "One", "Microsoft", 256);

        i1.exibirInformacoes();

        i2 = new Info("Nitendo Switch", 2014, "Nintendo", "nitendo", 150);

        i2.exibirInformacoes();

        i3 = new Info("Playstation V", 2020, "PS5", "Sony", 320);

        i3.exibirInformacoes();

    }

}
