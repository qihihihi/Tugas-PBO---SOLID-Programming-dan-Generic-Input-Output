import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FileCopyNew {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path log = Paths.get("log.txt");
        List<String> logs = new ArrayList<>();

        try {
            Files.write(source, List.of("Report Generated", "Status: OK"));
            logs.add(LocalDateTime.now() + " - report.txt berhasil ditulis");

            // Pengecekan file sebelum menyalin
            if (Files.exists(source)) {
                if (Files.notExists(backup.getParent()))
                    Files.createDirectories(backup.getParent());

                Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Backup created successfully!");
                logs.add(LocalDateTime.now() + " - Backup berhasil dibuat di " + backup);
            } else {
                System.out.println("File sumber tidak ditemukan, backup dibatalkan.");
                logs.add(LocalDateTime.now() + " - GAGAL: file sumber tidak ada");
            }
        } catch (IOException e) {
            e.printStackTrace();
            logs.add(LocalDateTime.now() + " - ERROR: " + e.getMessage());
        }

        // Tulis log hasil operasi
        try {
            Files.write(log, logs);
            System.out.println("Log disimpan ke log.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis log: " + e.getMessage());
        }
    }
}
