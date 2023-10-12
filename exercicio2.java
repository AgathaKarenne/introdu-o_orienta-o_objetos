public class exercicio2 {
    
    //Crie uma classe chamada Calculadora com métodos para realizar as operações de soma, subtração, multiplicação e divisão de dois números.
    // Cada método deve receber dois números como parâmetros e retornar o resultado da operação. No método main, utilize a classe Calculadora para realizar diferentes operações e exibir os resultados.

    //criar uma classe chamada Calculadora
    public class Calculadora{
        
        //operadores
        public static double soma(double numero1, double numero2){

            return numero1 + numero2;

        }
        public static double subtração(double numero1, double numero2){

            return numero1 - numero2;

        }
        public static double multiplicação(double numero1, double numero2){

            return numero1 * numero2;

        }
        public static double divisão(double numero1, double numero2){

            return numero1 / numero2;
           
        }
        public static void main(String[] args) {
            double numero1 = 40;
            double numero2 = 10;
    
            // Realize diferentes operações e exiba os resultados
            System.out.println("Soma: " + soma(numero1, numero2));
            System.out.println("Subtração: " + subtração(numero1, numero2));
            System.out.println("Multiplicação: " + multiplicação(numero1, numero2));
            System.out.println("Divisão: " + divisão(numero1, numero2));
        }
    }
}


