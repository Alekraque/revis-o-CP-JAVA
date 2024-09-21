package br.com.fiap.beans;

import br.com.fiap.beans.contributor;

public class contributor {
    private adress adress;
    private String nomeC;
    private String cpfC;
    private String emailC;
    private int idadeC;
    private String sexoC;
    private double alturaC;

    public void setNome(String nome) {
        this.nomeC = nome;
    }
    public void setCpf(String cpf) {
        this.cpfC = cpf;
    }
    public void setEmail(String email) {
        this.emailC = email;
    }
    public void setIdade(int idade) {
        this.idadeC = idade;
    }
    public void setSexo(String sexo) {
        this.sexoC = sexo;
    }
    public String getNome() {
        return nomeC;
    }
    public String getCpf() {
        return cpfC;
    }
    public String getEmail() {
        return emailC;
    }
    public int getIdade() {
        return idadeC;
    }
    public String getSexo() {
        return sexoC;
    }
    public void setAltura(double altura) {
        this.alturaC = altura;
    }
    public double getAltura() {
        return alturaC;
    }
}
