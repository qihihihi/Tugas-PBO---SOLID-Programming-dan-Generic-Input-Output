public class Main {
    public static void main(String[] args) {
        System.out.printf("%-10s %-6s %s%n", "Nama", "Kode", "Suku Bunga");
        System.out.println("-----------------------------");
        for (AccountType t : AccountType.values()) {
            System.out.printf("%-10s %-6s %.1f%%%n",
                    t.name(), t.getCode(), t.getInterestRate() * 100);
        }
    }
}
