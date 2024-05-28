import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "D:\\students.csv";
        String line;
        String csvSplitBy = ",";
        int indeks = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
            }
            // Mengurangi 1 untuk mengabaikan baris header
            int jumlahBaris = indeks - 1;
            System.out.println("Jumlah baris dalam file students.csv: " + jumlahBaris);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}