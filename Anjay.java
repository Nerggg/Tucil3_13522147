public class Anjay {
    public static void main(String[] args) {
        // Menyimpan jumlah array yang akan dibuat
        int arraySize = 1000000;

        // Menghitung total memori sebelum membuat array
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memori sebelum membuat array (bytes): " + memoryBefore);

        // Membuat array integer
        int[] intArray = new int[arraySize];

        // Menghitung total memori setelah membuat array
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memori setelah membuat array (bytes): " + memoryAfter);

        // Menghitung estimasi memori yang digunakan oleh array
        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Estimasi memori yang digunakan oleh array (bytes): " + memoryUsed);
    }
}
