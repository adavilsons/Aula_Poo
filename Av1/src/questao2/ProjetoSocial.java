package questao2;

public class ProjetoSocial {
    public static void main(String[] args) {

        DistribuicaoAlimento dist = new DistribuicaoAlimento("Mesa Brasil", "SESC", "Belo Horizonte", "01/09/2023", "30/09/2023", "Feijão", 10);
        TrabalhoVoluntario trab = new TrabalhoVoluntario("Mesa Brasil", "SESC", "BH", "01/09/2023", "30/09/2023", "Entragador", 6);
        System.out.println("\nDistribuição de alimento\n" + dist.imprimeProjeto());
        System.out.println("\nTrabalho voluntario\n" + trab.imprimeProjeto());
    }
}
