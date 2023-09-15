package rendimento;
import java.text.NumberFormat;
public class Rendimento {
    private Double investInicial;
    private Double taxaRendimento;
    private int numMeses;

    public Rendimento(Double investInicial, Double taxaRendimento, int numMeses) {
        this.investInicial = investInicial;
        this.taxaRendimento = taxaRendimento;
        this.numMeses = numMeses;
    }

    public Double getInvestInicial() {
        return investInicial;
    }

    public void setInvestInicial(Double investInicial) {
        this.investInicial = investInicial;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }
    public void calculaRendimento() {
        double rendimentoMes;
        rendimentoMes = getInvestInicial();
        System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInvestInicial()));
        System.out.println("Valor Inicial: " + NumberFormat.getPercentInstance().format(getTaxaRendimento() / 100));
        for (int i = 0; i < getNumMeses(); i++) {
            rendimentoMes = rendimentoMes * getTaxaRendimento() / 100 + rendimentoMes;
            System.out.println("Mês " + (i + 1) + ": " + NumberFormat.getCurrencyInstance().format(rendimentoMes));
        }
    }
}
