public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(90, "Qihi");
        Pair<Double, Boolean> p2 = new Pair<>(3.14, true);

        System.out.println("p1 = " + p1);
        p1.showTypes();
        System.out.println("p2 = " + p2);
        p2.showTypes();

        System.out.println("\nSetelah swap:");
        Pair<String, Integer> p1s = p1.swap();
        Pair<Boolean, Double> p2s = p2.swap();
        System.out.println("p1 = " + p1s);
        p1s.showTypes();
        System.out.println("p2 = " + p2s);
        p2s.showTypes();
    }
}
