package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Contas;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {

        LinkedList<Contas> lista = new LinkedList<Contas>();

        Contas cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Contas cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println(lista.size());
        Contas ref = (Contas) lista.get(0);
        System.out.println(ref.getNumero());
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Contas cc3 = new ContaCorrente(33, 311);
        lista.add(cc);

        Contas cc4 = new ContaCorrente(33, 332);
        lista.add(cc2);

        // for antigo

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------------------------------------------------------------");

        // foreach atual
        for (Contas contas : lista) {
            System.out.println(contas);
        }
    }
}
