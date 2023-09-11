package EmpregoFaculdade;

public class EmpregadoFaculdade {
    private String nome;
    private double salario, salarioRecebido;
    private int horasAula;

    public EmpregadoFaculdade(String nome, double salario, double salarioRecebido, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.salarioRecebido = salarioRecebido;
        this.horasAula = horasAula;
    }

    double getGastos(){

        return this.salarioRecebido = this.salario+ (horasAula* 40);
    }
    String getInfo(){
        return "nome:" + this.nome + " com salário " + this.salarioRecebido;
    }
}
