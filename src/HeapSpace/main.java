package HeapSpace;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;

public class main {
    public static void main(String[] args) {
        System.out.println("Heap Space Details:");

        for (MemoryPoolMXBean memoryPool : ManagementFactory.getMemoryPoolMXBeans()) {
            String name = memoryPool.getName();
            MemoryUsage usage = memoryPool.getUsage();

            System.out.println("Memory Pool: " + name);
            System.out.println("  Initial: " + usage.getInit() / (1024 * 1024) + " MB");
            System.out.println("  Used: " + usage.getUsed() / (1024 * 1024) + " MB");
            System.out.println("  Committed: " + usage.getCommitted() / (1024 * 1024) + " MB");
            System.out.println("  Max: " + (usage.getMax() == -1 ? "Unlimited" : usage.getMax() / (1024 * 1024) + " MB"));
            System.out.println();
        }
    }
}
