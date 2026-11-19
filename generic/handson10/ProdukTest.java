import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProdukTest {
    @Test
    void toStringHarusSesuaiFormat() {
        Produk<String, Double, Integer> p = new Produk<>("Mouse", 150000.0, 50);
        assertEquals("Mouse,150000.0,50", p.toString());
    }

    @Test
    void getterHarusMengembalikanNilaiBenar() {
        Produk<String, Double, Integer> p = new Produk<>("Laptop", 15000000.0, 10);
        assertEquals("Laptop", p.getNama());
        assertEquals(15000000.0, p.getHarga());
        assertEquals(10, p.getStok());
    }
}
