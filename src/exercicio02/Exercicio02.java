package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new AuxiliarEscritorio("Nery Pumpido", 2500.0, 500.0));
        funcionarios.add(new AuxiliarEscritorio("Sergio Batista", 2300.0, 500.0));
        funcionarios.add(new AuxiliarEscritorio("José Brown", 2000.0, 500.0));
        funcionarios.add(new AuxiliarEscritorio("José Burruchaga", 2000.0, 500.0));


        System.out.println("O valor do orçamento anual do departamento 1986 da empresa é: "+calculaOrcamentoAnual(funcionarios));

    }

    private static double calculaOrcamentoAnual(List<Funcionario> funcionarios) {
        // TODO: implemente o código deste método
        for (int i=0;i < funcionarios.size();i++) {
            funcionarios.get(i).salarioAnual();
        }
    }
}
