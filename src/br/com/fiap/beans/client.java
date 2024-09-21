package br.com.fiap.beans;

import br.com.fiap.beans.adress;

public class client {
    private String nome;
    private String cpf;
    private String email;
    private int idade;
    private String sexo;
    private double altura;
    private adress adress;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public void setAdress(adress adress) {
        this.adress = adress;
    }
    public adress getAdress() {
        return adress;
    }
}
