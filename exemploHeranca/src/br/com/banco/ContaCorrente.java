package br.com.banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(long n, double limite) {
        super(n);
        if (limite>0)
        this.limite = limite;
    }
    public void alterarLimite(double l){
        if (l>0)
            limite = l;
    }
    public double consultarLimite(){
        return limite;
    }
    public double consultarSaldoTotal(){
        return(saldo + limite);
    }
}
