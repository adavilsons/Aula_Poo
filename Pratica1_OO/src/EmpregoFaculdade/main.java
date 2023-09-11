package EmpregoFaculdade;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        EmpregadoFaculdade empregado;
        empregado = new EmpregadoFaculdade("Carlos" , 1500, 3500, 50);
        System.out.println(empregado.getInfo());
    }

}
