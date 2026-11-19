public class Main {
    public static void main(String[] args) {
        Account acc = new Account(AccountType.DEPOSIT);
        System.out.println("Tipe akun: " + acc.getType());
        System.out.println();

        System.out.println("Semua tipe enum:");
        for (AccountType t : AccountType.values()) {
            System.out.println("- " + t.name() + " -> " + t);
        }
    }
}
