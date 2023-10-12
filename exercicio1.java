public class exercicio1 {

    //Crie uma classe chamada Pessoa com os atributos nome (String) e idade (int).
    // Em seguida, crie uma função chamada imprimePessoa que recebe um objeto do tipo Pessoa como parâmetro e imprime o nome e a idade da pessoa.
    // No método main, crie dois objetos do tipo Pessoa e chame a função imprimePessoa para exibir suas informações.

    public static void main(String[] args){

        int idade = 21;
        String nome = "Agatha";

        String imprimePessoa = nome + "" + idade;

        //imprimir os dados de imprimePessoa
        System.out.println(imprimePessoa);

    }
}