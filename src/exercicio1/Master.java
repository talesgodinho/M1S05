package exercicio1;

    /*Crie uma classe que imprima no console:
    nome do sistema operacional
    capacidade de memória RAM
    memória RAM alocada
    memória RAM livre*/

public class Master {
    public static void main(String[] args) {
        InfoSO atual = new InfoSO();

        System.out.println("\n*** Informações sobre o seu Sistema Operacional ***\n");
        System.out.println("Nome do sistema: " + atual.getName());
        System.out.println("Capacidade de memória RAM: " + atual.getCapacRam() + " bytes");
        System.out.println("Memória RAM alocada: " + atual.getAlocRam() + " bytes");
        System.out.println("Memória RAM livre: " + atual.getLivreRam() + " bytes");
    }
}
