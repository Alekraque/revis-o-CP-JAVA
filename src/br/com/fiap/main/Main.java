package br.com.fiap.main;

import br.com.fiap.beans.contributor;
import br.com.fiap.beans.client;
import br.com.fiap.beans.adress;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        client objClient = new client();
        adress clientAdress = new adress();
        contributor objContributor = new contributor();
        adress adressContributor = new adress();

        //login client:
        objClient.setNome(JOptionPane.showInputDialog("Digite o nome do cliente:"));
        objClient.setEmail(JOptionPane.showInputDialog("Digite o email do cliente:"));
        objClient.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cliente:")));
        objClient.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente:")));
        objClient.setSexo(JOptionPane.showInputDialog("Digite o sexo do cliente:"));
        objClient.setCpf(JOptionPane.showInputDialog("Digite o CPF do cliente:"));

        //login contributor:
        objContributor.setNome(JOptionPane.showInputDialog("Digite o nome do contributor:"));
        objContributor.setEmail(JOptionPane.showInputDialog("Digite o email do contributor:"));
        objContributor.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do contributor:")));
        objContributor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do contributor:")));
        objContributor.setCpf(JOptionPane.showInputDialog("Digite o CPF do contributor:"));
        objContributor.setSexo(JOptionPane.showInputDialog("Digite o sexo do contributor:"));

        //client adress:

        clientAdress.setStreet(JOptionPane.showInputDialog("Digite a rua do cliente:"));
        clientAdress.setCountry(JOptionPane.showInputDialog("Digite o pais do cliente:"));
        clientAdress.setCity(JOptionPane.showInputDialog("Digite o cidade do cliente:"));
        clientAdress.setState(JOptionPane.showInputDialog("Digite o estado do cliente:"));
        clientAdress.setPostalCode(JOptionPane.showInputDialog("Digite o CEP do cliente:"));

        //contributor adress:

        adressContributor.setStreet(JOptionPane.showInputDialog("Digite a rua do contributor:"));
        adressContributor.setCountry(JOptionPane.showInputDialog("Digite o pais do contributor:"));
        adressContributor.setCity(JOptionPane.showInputDialog("Digite o cidade do contributor:"));
        adressContributor.setState(JOptionPane.showInputDialog("Digite o estado do contributor:"));
        adressContributor.setPostalCode(JOptionPane.showInputDialog("Digite o CEP do contributor:"));


        //output:

        System.out.println(
                "INFORMAÇÕES DO CLIENTE:"
                + "\nNome: " + objClient.getNome() +
                  "\nIdade: " + objClient.getIdade() +
                  "\nSexo: " + objClient.getSexo() +
                  "\nAltura" + objClient.getAltura() +
                  "\nCPF: " + objClient.getCpf() +
                  "\nEmail" + objClient.getEmail()+
                  "\n\n" +
                  "ENDEREÇO: "
                + "\nRua: " + clientAdress.getStreet() +
                  "\nCidade: " + clientAdress.getCity() +
                  "\nCEP: " + clientAdress.getPostalCode() +
                  "\nEstado: " + clientAdress.getState()
        );
        System.out.println(
                "INFORMAÇÕES DO CONTRIBUIDOR:"
                + "\nNome: " + objContributor.getNome() +
                "\nIdade: " + objContributor.getIdade() +
                "\nSexo: " + objContributor.getSexo() +
                "\nAltura" + objContributor.getAltura() +
                "\nCPF: " + objContributor.getCpf() +
                "\nEmail: " + objContributor.getEmail()+
                "\n\n" +
                "ENDEREÇO: "
                + "\nRua: " + adressContributor.getStreet() +
                "\nCidade: " + adressContributor.getCity() +
                "\nCEP: " + adressContributor.getPostalCode() +
                "\nEstado: " + adressContributor.getState()

        );
    }
}