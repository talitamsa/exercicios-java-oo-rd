package exercicio02;

public abstract class Funcionario {

    // TODO: implemente o código desta classe

    private String nome;
    private int salarioMensal;

    public Funcionario(String nome, int salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String salarioAnual(int salarioMensal){
        this.salarioMensal = this.salarioMensal*13);
            return "O salário anual deste funcionário é: " +salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(int salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
