package exercicio9;

public class ClasseEx9 {

    static{
        System.out.println("Imprimindo bloco estático");
    }

    {
        System.out.println("Imprimindo bloco de instância");
    }

    public ClasseEx9() {
        System.out.println("Imprimindo bloco construtor");
    }

    public static void main(String[] args) {
        ClasseEx9 construtor = new ClasseEx9();
    }
}
