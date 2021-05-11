package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Contas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

    public static void main(String[] args) {

        Contas cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Contas cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Contas cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Contas cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Contas> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        lista.sort(new Comparator<Contas>() {

                       @Override
                       public int compare(Contas c1, Contas c2) {
                           String nomeC1 = c1.getTitular().getNome();
                           String nomeC2 = c2.getTitular().getNome();
                           return nomeC1.compareTo(nomeC2);
                       }
        }
        );

        Comparator<Contas> comp = new Comparator<Contas>() {

            @Override
            public int compare(Contas c1, Contas c2) {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
            }
        };

        for (Contas conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
    }
}








