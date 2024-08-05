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

        Pessoa pessoa = new Pessoa(nome, idade, peso, altura, sexo); // passar na mesma ordem da classe usada

        double imc = Calcular_IMC.calculaIMC(pessoa);
        String classificacao = Calcular_IMC.classificacao(imc, sexo); // sexo, pois é usado na classificação do imc

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.printf("-> IMC: %.2f%n", imc);
        System.out.println("-> Classificação IMC: " + classificacao);

        sc.close();
    }
}