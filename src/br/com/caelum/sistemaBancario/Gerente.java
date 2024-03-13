package br.com.caelum.sistemaBancario;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }
    public boolean autentica(int senha) {
        if (this.senha != senha) {
            return false;
        }
        return true;
    }
}
