public class CompareUtil {

    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5, 5));              // true
        System.out.println(isEqual("Hello", "World"));  // false
        System.out.println(isEqual(3.14, 3.14));        // true

        // Test case tambahan
        System.out.println(isEqual(2.5, 2.7));          // Double -> false
        System.out.println(isEqual(1.0, 1.0));          // Double -> true
        System.out.println(isEqual('a', 'a'));          // Character -> true
        System.out.println(isEqual('a', 'b'));          // Character -> false

        /*
         * Perbedaan generic class vs generic method:
         * - Generic class: parameter tipe dideklarasikan di level class
         *   (class Cell<T>), berlaku untuk seluruh anggota class, dan tipe
         *   ditentukan saat objek dibuat (new Cell<Integer>()).
         * - Generic method: parameter tipe dideklarasikan di method
         *   (<T> boolean isEqual(...)), hanya berlaku di method itu, dan
         *   tipe ditentukan otomatis (inference) saat method dipanggil.
         *   Bisa berada di class biasa (non-generic) dan bisa static.
         */
    }
}
