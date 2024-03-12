package orientacao_objetos_basica.testes;

import orientacao_objetos_basica.Conta;
import orientacao_objetos_basica.Data;

public class Teste {
    public static void main(String[] args) {
        Data dataC1 = new Data(12, 03, 2024);
        Data dataC2 = new Data(01, 12, 2023);

        Conta c1 = new Conta("Gabriel", "0321", 3213, 1500, dataC1);
        Conta c2 = new Conta("Luis", "2313", 4354, 10000, dataC2);

        c1.deposito(20000.00);
        c1.saque(500);
        c1.transferencia(c2, 5000);

        //System.out.println(c1.getDataDeAbertura());
        System.out.println(c2.recuperarDadosParaImpressao());

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
