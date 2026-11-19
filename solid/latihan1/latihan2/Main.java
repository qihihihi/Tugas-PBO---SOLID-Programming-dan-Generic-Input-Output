
class StudentGrader {
    public double hitungNilaiAkhir(
        double tugas, double uts, double uas) {

        return (tugas * 0.3) +
               (uts * 0.3) +
               (uas * 0.4);
    }
}

class GradeReportPrinter {
    public void cetakLaporan(String nama, double nilai) {
        System.out.println(
            "Laporan Nilai Mahasiswa: " + nama + " = " + nilai
        );
    }
}

interface GradeRepository {
    void simpan(String nama, double nilai);
}

class DatabaseGradeRepository implements GradeRepository {
    public void simpan(String nama, double nilai) {
        System.out.println(
            "Menyimpan ke database: " + nama + " = " + nilai
        );
    }
}

public class Main {
    public static void main(String[] args) {

        StudentGrader grader = new StudentGrader();
        GradeReportPrinter printer = new GradeReportPrinter();
        GradeRepository database = new DatabaseGradeRepository();

        double nilai = grader.hitungNilaiAkhir(80, 85, 90);

        printer.cetakLaporan("Andi", nilai);
        database.simpan("Andi", nilai);
    }
}
