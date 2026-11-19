import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;

public class ReadFile {
    public static void main(String[] args) {
        Path path = Paths.get("employees.txt");

        // Deteksi file tidak ditemukan
        if (Files.notExists(path)) {
            System.out.println("File tidak ditemukan: " + path.toAbsolutePath());
            return;
        }

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            br.lines().forEach(line -> {
                System.out.println(line);
                list.add(line);          // simpan ke ArrayList<String>
            });
        } catch (NoSuchFileException e) {
            System.out.println("File tidak ditemukan: " + e.getFile());
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Tulis ke file baru
        try {
            Files.write(Paths.get("copy_employees.txt"), list, StandardCharsets.UTF_8);
            System.out.println("Berhasil menulis " + list.size() + " baris ke copy_employees.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis file: " + e.getMessage());
        }
    }
}
