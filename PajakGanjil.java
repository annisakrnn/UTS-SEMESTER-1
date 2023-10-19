import java.util.Scanner;

public class PajakGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Perhitungan Pajak");

        // Input apakah wajib pajak memiliki usaha
        System.out.print("Apakah Anda memiliki usaha? (ya/tidak): ");
        String memilikiUsaha = input.nextLine();

        double totalPendapatan = 0;
        double totalHartaKekayaan = 0;

        // Hitung pajak berdasarkan penghasilan jika memiliki usaha
        if (memilikiUsaha.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan penghasilan dalam 1 tahun: ");
            double penghasilan = input.nextDouble();
            double pajakPenghasilan = penghasilan * 0.15; // Pajak 15% dari penghasilan
            totalPendapatan += pajakPenghasilan;
        }

        // Input harta kekayaan
        System.out.print("Masukkan nama harta yang dimiliki: ");
        input.next();
        String memilikiHartaKekayaan = input.nextLine();
        System.out.print("Masukkan nilai jual harta tersebut: ");
        input.next();
        String bernilaiJual = input.nextLine();
        System.out.print("Apakah anda ingin menambahkan harta (ya/tidak)? ");
        input.next();
        String jawab = input.nextLine();

        
        if (memilikiHartaKekayaan.equalsIgnoreCase("ya")) {
            boolean tambahHarta = true;
        
            while (tambahHarta == true) {
                System.out.print("Masukkan nama harta yang anda miliki: ");
                String totalHarga = input.next();
                System.out.print("Masukkan nilai jual harta tersebut: ");
                double hargaHarta = input.nextDouble();
                totalHarga += hargaHarta;

                if (jawab.equalsIgnoreCase("t")) {
                    break;
                }
                System.out.println(totalHarga);

            
            }
        }

        // Input status keluarga
        System.out.print("Apakah Anda sudah berkeluarga? (ya/tidak): ");
        String berkeluarga = input.next();

        // Jika sudah berkeluarga, input tingkat pendidikan anak
        if (berkeluarga.equalsIgnoreCase("ya")) {
            System.out.print("Tingkat pendidikan anak (SD, SMP, SMA, KULIAH): ");
            String tingkatPendidikanAnak = input.next();

            if (tingkatPendidikanAnak.equalsIgnoreCase("KULIAH") || tingkatPendidikanAnak.equalsIgnoreCase("SMA")) {
                if (totalHartaKekayaan >= 50000000) {
                    totalPendapatan -= (totalPendapatan * 0.10); // Potongan pajak 10%
                } else {
                    totalPendapatan -= (totalPendapatan * 0.05); // Potongan pajak 5%
                }
            }
        }

        // Menampilkan total pajak yang harus dibayarkan
        System.out.println("Total Pajak yang Harus Dibayarkan: " + totalPendapatan);

        input.close();
    }
}