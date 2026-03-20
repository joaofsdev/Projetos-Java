package test;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double TAXA_DOLAR = 5.2;
        final double TAXA_EURO = 6;
        final double TAXA_IENE = 0.033;

        Scanner input = new Scanner(System.in);

        final Locale EUA = Locale.US;
        final Locale ITA = Locale.ITALY;
        final Locale JAPAO = Locale.JAPAN;
        final Locale BRASIL = new Locale("pt", "BR");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(BRASIL);
        nfa[1] = NumberFormat.getCurrencyInstance(ITA);
        nfa[2] = NumberFormat.getCurrencyInstance(JAPAO);
        nfa[3] = NumberFormat.getCurrencyInstance(EUA);

        System.out.println("Digite o valor que deseja converter: ");
        double valor = input.nextDouble();
        input.nextLine();

        double dolar = valor / TAXA_DOLAR;
        double iene = valor / TAXA_IENE;
        double euro = valor / TAXA_EURO;

        System.out.println("Real: " + nfa[0].format(valor));
        System.out.println("Euro: " + nfa[1].format(euro));
        System.out.println("Iene: " + nfa[2].format(iene));
        System.out.println("Dólar: " + nfa[3].format(dolar));
    }
}
