package br.com.caelum.contas.exceptions;

import br.com.caelum.contas.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteSaque {
    public static void main (String[] args) {
        Conta cc = new ContaCorrente("Gabriel", "0321", 3213, 1500);

        //cc.deposito(-1);

        //cc.saque(500);
    }
}
