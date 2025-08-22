public class MediaNotas {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 5.5, 9.8};

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        Sustem.out.println("A média das notas é: " + media);
    }
}