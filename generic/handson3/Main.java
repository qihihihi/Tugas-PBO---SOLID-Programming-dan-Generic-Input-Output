public class Main {
    public static void main(String[] args) {
        Cell<Integer> cInt = new Cell<>();
        cInt.setValue(100);
        System.out.println("Nilai: " + cInt.getValue());
        cInt.displayType();

        Cell<String> cStr = new Cell<>();
        cStr.setValue("Halo Generic");
        System.out.println("Nilai: " + cStr.getValue());
        cStr.displayType();
    }
}
