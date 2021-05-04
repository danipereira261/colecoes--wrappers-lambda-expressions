package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Contas;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Contas> lista = new ArrayList<Contas>();

        Contas cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Contas cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Contas cc3 = new ContaCorrente(22,22);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);



        for (Contas contas : lista) {
            System.out.println(contas);
        }
    }
}
