package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Contas;

public class ContaEspecial extends Contas {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

}
