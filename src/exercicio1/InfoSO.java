package exercicio1;

    /*Crie uma classe que imprima no console:
    nome do sistema operacional
    capacidade de memória RAM
    memória RAM alocada
    memória RAM livre*/

import java.lang.management.ManagementFactory;

public class InfoSO {
    static com.sun.management.OperatingSystemMXBean mxbean =
            (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

    private String name = mxbean.getName();
    private long capacRam = mxbean.getTotalMemorySize();;
    private long alocRam = mxbean.getTotalMemorySize() - mxbean.getFreeMemorySize();
    private long livreRam = mxbean.getFreeMemorySize();

    public String getName() {
        return name;
    }

    public long getCapacRam() {
        return capacRam;
    }

    public long getAlocRam() {
        return alocRam;
    }

    public long getLivreRam() {
        return livreRam;
    }
}
