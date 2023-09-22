package br.com.questao3;

public class Caminhao extends Veiculo{
    public int eixos;


    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String exibirDados(){
        return "placa: " + getPlaca() + "ano:" + getAno() + "numero de eixos: "+ getEixos();


    }
}
