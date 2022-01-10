package exercicio4;

public class FinalAttributes {
    private final int FINAL_ATTRIBUTE1;
    private final static int FINAL_ATTRIBUTE2;

    static {
        FINAL_ATTRIBUTE2 = 2;
        System.out.println("Bloco estático inicializado");
    }

    FinalAttributes() {
        FINAL_ATTRIBUTE1 = 1;
        System.out.println("Bloco construtor inicializado");
    }

    public static void main(String[] args) {
        FinalAttributes construtor = new FinalAttributes();
    }

}
