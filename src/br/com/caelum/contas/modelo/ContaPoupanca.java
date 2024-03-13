package br.com.caelum.contas.modelo;

import br.com.caelum.contas.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, String agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }

    public String getTipo() {
        return "Conta Poupança";
    }
}
