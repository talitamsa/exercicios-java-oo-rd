package exercicio02;

public class TecnicoManutencao extends Funcionario {

    // TODO: implemente o código desta classe

    private int insalubridade;
    private int bonusAnual;

    public TecnicoManutencao(int insalubridade, int bonusAnual) {
        this.insalubridade = insalubridade;
        this.bonusAnual = bonusAnual;
    }

    public int getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(int insalubridade) {
        this.insalubridade = insalubridade;
    }

    public String salarioAnual(int salarioMensal) {
        this.insalubridade = salarioMensal*3%;
        this.bonusAnual = salarioMensal*5%;
        return super.salarioAnual(salarioMensal)+insalubridade+bonusAnual;
    }

    public int getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(int bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}
