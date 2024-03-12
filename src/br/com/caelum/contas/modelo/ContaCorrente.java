package br.com.caelum.contas.modelo;

import br.com.caelum.contas.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(String titular, String agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }
}
