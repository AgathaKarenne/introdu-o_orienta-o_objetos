import java.util.Random;

public class exercicio4 {
    
    //Crie uma classe chamada Matematica com um método chamado gerarNumeroAleatorio que retorna um número inteiro aleatório entre 1 e 100.
    // No método main, utilize o método gerarNumeroAleatorio para gerar três números aleatórios e exibi-los.

    public class Matematica{
        public static int gerarNumeroAleatorio;
       
        Random random = new Random();

        public void setRandom(Random random) {
            this.random = random;
        }

        return random.nextInt(100) + 1;//gerar um numero aleatorio entre 1 e 100
    }

    public static void main(String[] args){
        //gera e exiba tres numeros
        for(int i = 0; i < 3; i++){
            int numeroAleatorio = gerarNumeroAleatorio();
            System.out.println("Numero Aleatório" + (i + 1) + ":" + numeroAleatorio);
        }
    }

    private static int gerarNumeroAleatorio() {
        return 0;
    }

}