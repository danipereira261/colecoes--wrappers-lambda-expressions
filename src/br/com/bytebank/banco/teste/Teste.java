package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Contas;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Contas cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Contas cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();

        System.out.println(tamanho);

        Contas ref = guardador.getReferencia(1);

        System.out.println(ref.getNumero());
    }
}
