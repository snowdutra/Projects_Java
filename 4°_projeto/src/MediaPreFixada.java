 public class MediaPreFixada   {
    /**
     * Classe que calcula a m dia prefixada
     */
    public static void main(String[] args) {
        int[] x = {10, 5, 12, 3, 2};
        double[] media = new double[x.length];

        /**
         * O loop percorre o vetor de n meros e calcula a m dia prefixada
         * para cada um deles
         * @param i   o   ndice do vetor
         */
        for(int i = 0; i < x.length; i++) {
            int soma = 0;
            for(int j = 0; j <= i; j++) {
                soma += x[j];
            }
            media[i] = (double)soma / (i+1);
        }
 }