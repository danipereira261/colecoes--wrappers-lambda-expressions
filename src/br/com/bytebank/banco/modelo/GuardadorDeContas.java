package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Contas[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Contas[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Contas ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Contas getReferencia(int pos) {
        return this.referencias[pos];
    }
}
