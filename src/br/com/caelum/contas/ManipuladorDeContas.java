package br.com.caelum.contas;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
    private Conta conta;

    public void criaConta(Evento evento) {
        int numero = evento.getInt("numero");
        String agencia = evento.getString("agencia");
        double saldo = evento.getDouble("saldo");
        String titular = evento.getString("titular");

        String tipo = evento.getSelecionadoNoRadio("tipo");

        if (tipo.equals("Conta Corrente")) {
            conta = new ContaCorrente(titular, agencia, numero, saldo);
        } else {
            conta = new ContaPoupanca(titular, agencia, numero, saldo);
        }

    }

    public void transferencia(Evento evento) {
        double valor = evento.getDouble("valor");
        Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");

        if (this.conta.saque(valor)) {
            destino.deposito(valor);
        } else {
            System.out.println("Transferência não realizada: Saldo insuficiente.");
        }
    }


    public void deposita(Evento evento) {
        double valor = evento.getDouble("valor");
        conta.deposito(valor);
    }

    public void saca(Evento evento) {
        double valor = evento.getDouble("valor");

        if (this.conta.getTipo().equals("Conta Corrente")) {
            ((ContaCorrente) conta).saque(valor);
        } else {
            ((ContaPoupanca) conta).saque(valor);
        }
    }
}
