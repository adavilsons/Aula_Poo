package NotasAlunos;

import javax.swing.*;

public class Aluno {
    private String nome, curso, periodo;
    private int matricula;
    private double notaAv1, notaAv2, notaAe;

    public Aluno(String nome, String curso, String periodo, int matricula, double notaAv1, double notaAv2, double notaAe) {
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
        this.notaAe = notaAe;
    }

    public void alteraNotaAv1(){

    }
    public void alteraNotaAv2(){

    }
    public void alteraNotaAe(){

    }
    public void avaliarAluno(){
        if (this.notaAv1 + this.notaAv2 >= 60)
            System.out.println("Aluno Aprovado!");
            else
                System.out.println("Aluno em Recuperação");


    }
    public void avaliarRecuperacao(double notaAe){
        //notaAe
    }

}
