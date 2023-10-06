package questao1;

public class Encontrar {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("joao", "jao@gmai.com", "12345");
        AchadoPerdido ap1 = new AchadoPerdido("identidade", "documento rg", "foto","plastico","praça", "19/02/23", "espera"  );

        ap1.buscarTitulo("identidade");
        ap1.visualizarDetalhes();
    }
}
