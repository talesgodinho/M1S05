package exercicio3;

import static java.time.LocalDateTime.now;
import static java.util.Calendar.*;
import static java.util.Locale.getDefault;

public class ClasseEx3 {
    public static void main(String[] args) {

        // Imprime data e hora atual usando LocalDateTime
        System.out.println(now());

        // Imprime data e hora atual usando Calendar
        System.out.println(getInstance().getTime());

        // Imprime linguagem atual do sistema
        System.out.println(getDefault());
    }
}
