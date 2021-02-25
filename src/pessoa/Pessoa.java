package pessoa;

import java.time.LocalDateTime;

public class Pessoa {
    private String nome;
    private LocalDateTime dtNasc;
    private double altura;

    public Pessoa(String nome, LocalDateTime dtNasc, double altura) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDateTime dtNasc) {
        this.dtNasc = dtNasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcIdade() {
        int idade = dtNasc.getYear() - LocalDateTime.now().getYear();
        if(dtNasc.getDayOfYear() >= LocalDateTime.now().getDayOfYear()) {
            idade++;
        }
        return -idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de nascimento: " + dtNasc + "\nAltura: " + altura + "\nIdade: " + calcIdade();
    }
}
