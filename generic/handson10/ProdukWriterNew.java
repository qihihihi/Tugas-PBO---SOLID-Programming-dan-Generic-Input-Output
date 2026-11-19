import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ProdukWriterNew {
    public static void main(String[] args) {
        List<Produk<String, Double, Integer>> produkList = new ArrayList<>();
        produkList.add(new Produk<>("Laptop", 15000000.0, 10));
        produkList.add(new Produk<>("Mouse", 150000.0, 50));
        produkList.add(new Produk<>("Keyboard", 350000.0, 25));

        Path filePath = Paths.get("produk_output.txt");

        try {
            List<String> lines = new ArrayList<>();
            for (Produk<String, Double, Integer> p : produkList) {
                lines.add(p.toString());
            }
            Files.write(filePath, lines);
            System.out.println("Data produk berhasil disimpan menggunakan NIO.2");

            // Baca kembali dan tampilkan
            System.out.println("\nIsi file produk_output.txt:");
            for (String line : Files.readAllLines(filePath)) {
                System.out.println(line);
            }

            // Penggunaan untuk jenis data lain: pelanggan & transaksi
            List<String> lain = new ArrayList<>();
            lain.add(new DataRecord<>("Qihi", "Makassar", 2025).toString());          // pelanggan
            lain.add(new DataRecord<>("TRX001", 15150000.0, "LUNAS").toString());     // transaksi
            Path lainPath = Paths.get("data_lain.txt");
            Files.write(lainPath, lain);

            System.out.println("\nIsi file data_lain.txt:");
            Files.readAllLines(lainPath).forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Gagal memproses file: " + e.getMessage());
        }
    }
}
