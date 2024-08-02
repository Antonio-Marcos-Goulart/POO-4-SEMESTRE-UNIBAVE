package relembrando;

public class Calcular_IMC {

    public static double calculaIMC(Pessoa pessoa) {
        double peso = pessoa.getPeso();
        double altura = pessoa.getAltura();
        return peso / (altura * altura);
    }
    public static String classificarIMC(double imc, String sexo) {
        if (sexo.equalsIgnoreCase("M")) {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "Peso normal";
            } else if (imc < 27.8) {
                return "Pouco acima do peso";
            } else if (imc < 31.2) {
                return "Acima do peso";
            } else {
                return "Obesidade";
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "Peso normal";
            } else if (imc < 27.3) {
                return "Pouco acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso";
            } else {
                return "Obesidade";
            }
        } else {
            return "Sexo inválido !";
        }
    }
}