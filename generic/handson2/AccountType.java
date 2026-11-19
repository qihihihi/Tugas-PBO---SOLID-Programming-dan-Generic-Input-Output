public enum AccountType {
    SAVINGS("SA", 0.03),
    CREDIT("CR", 0.18),
    DEPOSIT("DP", 0.05);

    private final String code;
    private final double interestRate; // dalam desimal (0.03 = 3%)

    private AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() { return code; }
    public double getInterestRate() { return interestRate; }
}
