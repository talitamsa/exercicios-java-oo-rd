package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    // TODO: implemente o código desta classe

    private int bonusAnual;

    public AuxiliarEscritorio(String nome, int salarioMensal, int bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    public int getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(int bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public String salarioAnual(int salarioMensal) {
        this.bonusAnual = salarioMensal*5/100;
        return super.salarioAnual(salarioMensal)+bonusAnual;
    }
}
