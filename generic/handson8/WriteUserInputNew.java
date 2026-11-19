import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WriteUserInputNew {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = Files.newBufferedWriter(Paths.get("user_input.txt"))) {

            System.out.println("Ketik teks (ketik 'exit' untuk selesai):");
            while (true) {
                System.out.print("Enter text: ");
                String text = sc.nextLine();

                if (text.equalsIgnoreCase("exit")) break;

                String timestamp = LocalDateTime.now().format(fmt);
                bw.write("[" + timestamp + "] " + text);
                bw.newLine();
            }
            System.out.println("Saved!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
