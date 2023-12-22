import java.util.Scanner;

class Kendaraan {
    String nomorPolisi;
    String jenis;
    String warna;
    int lamaParkir;

    Kendaraan(String nomorPolisi, String jenis, String warna, int lamaParkir) {
        this.nomorPolisi = nomorPolisi;
        this.jenis = jenis;
        this.warna = warna;
        this.lamaParkir = lamaParkir;
    }

    void tampil() {
        System.out.println("Nomor Polisi\t\t: " + this.nomorPolisi);
        System.out.println("Jenis\t\t\t: " + this.jenis);
        System.out.println("Warna\t\t\t: " + this.warna);
        System.out.println("Lama Parkir\t\t: " + this.lamaParkir + " jam");
    }

    int hitungBiaya() {
        int biaya = 0;
        if (this.jenis.equalsIgnoreCase("mobil")) {
            biaya = this.lamaParkir * 5000;
        } else if (this.jenis.equalsIgnoreCase("motor")) {
            biaya = this.lamaParkir * 2000;
        } else {
            System.out.println("Jenis kendaraan tidak valid");
        }
        return biaya;
    }
}

public class SistemParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("        PARKIR SISTEM         ");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlah = input.nextInt();

        Kendaraan[] kdr = new Kendaraan[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n");
            System.out.println("KENDARAAN KE-" + (i + 1));
            System.out.println("-----------------------------");
            System.out.print("Nomor Polisi\t\t: ");
            String nomorPolisi = input.next();
            System.out.print("Jenis (Motor/Mobil)\t: ");
            String jenis = input.next();
            System.out.print("Warna\t\t\t: ");
            String warna = input.next();
            System.out.print("Lama Parkir (jam)\t: ");
            int lamaParkir = input.nextInt();

            Kendaraan k = new Kendaraan(nomorPolisi, jenis, warna, lamaParkir);

            kdr[i] = k;
        }

        System.out.println("\n");
        System.out.println("            DATA KENDARAAN              ");
        System.out.println("=====================================");
        for (Kendaraan k : kdr) {
            k.tampil();
            System.out.println("-------------------------------------");
            System.out.println("Biaya Parkir\t\t: Rp " + k.hitungBiaya());
            System.out.println();
        }
    }
}
