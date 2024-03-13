package br.com.caelum.contas.testes;

import br.com.caelum.contas.Conta;
import br.com.caelum.contas.Data;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        /*
        Data dataC1 = new Data(12, 03, 2024);
        Data dataC2 = new Data(01, 12, 2023);
        */


        Conta c1 = new ContaCorrente("Gabriel", "0321", 3213, 1500);

        c1.deposito(20000.00);
        c1.saque(500);

        System.out.println(c1.getTipo());


        //c2 = c1;

        /*
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        System.out.println(c2.getTitular());
        */
    }
}
