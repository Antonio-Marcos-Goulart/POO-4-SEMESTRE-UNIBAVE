package relembrandoUltimoSemestre;

import java.util.Scanner;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        System.out.print("Peso em Kg: ");
        double peso = sc.nextDouble();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Sexo (M - masculino ou F - feminino): ");
        String sexo = sc.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, peso, altura, sexo);

        double imc = Calcular_IMC.calculaIMC(pessoa);
        String classificacao = Calcular_IMC.classificarIMC(imc, sexo);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.printf("IMC: %.4f%n", imc);
        System.out.printf("Classificação na tabela IMC: %s%n", classificacao);

        sc.close();
    }
}