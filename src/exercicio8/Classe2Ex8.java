package exercicio8;

public class Classe2Ex8 {
    public static void main(String[] args) {
        Classe1Ex8 c1 = new Classe1Ex8();

        System.out.println("Valor do atributo antes de modificar: " + c1.getNome());
        c1.metodo("Tales");

        System.out.println("Valor do atributo após modificar: " + c1.getNome());
    }
}
