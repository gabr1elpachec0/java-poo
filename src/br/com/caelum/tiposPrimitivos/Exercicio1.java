package br.com.caelum.tiposPrimitivos;

public class Exercicio1 {
    public static void main (String[] args) {
        int jan = 15000;
        int fev = 23000;
        int mar = 17000;

        int media = (jan + fev + mar) / 3;
        int despesa_total = jan + fev + mar;

        System.out.println("Despesa total = " + despesa_total);
        System.out.println("Media mensal = " + media);
    }
}
