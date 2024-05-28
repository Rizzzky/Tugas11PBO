import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "D:\\new_students.csv";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak data yang ingin Anda tambahkan? ");
        int jumlahData = Integer.parseInt(scanner.nextLine());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            for (int i = 0; i < jumlahData; i++) {
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Umur: ");
                String umur = scanner.nextLine();
                System.out.print("Masukkan Prodi: ");
                String prodi = scanner.nextLine();

                String line = nim + "," + nama + "," + umur + "," + prodi;
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
