import java.util.Scanner;

public class hasilno3 {
    public static void main(String[] args) {
        String[] nomerplat = new String[]{"k-kudus", "B-jakarta", "AB-jogja", "T-karawang", "AD-solo"};
        int jumlahplatmobil = 5;
        int totaljumlahmobil = 55;
        String[] kudus = new String[9];
        String[] jogja = new String[11];
        String[] jakarta = new String[10];
        String[] solo = new String[13];
        String[] karawang = new String[12];

        int totalkudus = 0;
        int sisamobil = 0;
        for (int i = 0; i < kudus.length; i++) {
            if (kudus[i] != null) ;
            totalkudus++;
        }
        int totaljogja = 0;
        for (int i = 0; i < jogja.length; i++) {
            if (jogja[i] != null) ;
            totaljogja++;
        }
        int totaljakarta = 0;
        for (int i = 0; i < jakarta.length; i++) {
            if (jakarta[i] != null) ;
            totaljakarta++;
        }
        int totalsolo = 0;
        for (int i = 0; i < jakarta.length; i++) {
            if (jakarta[i] != null) ;
            totalsolo++;
        }
        int totalkarawang = 0;
        for (int i = 0; i < jakarta.length; i++) {
            if (jakarta[i] != null) ;
            totalkarawang++;
        }
        sisamobil = totaljumlahmobil - totalkudus - totaljogja - totaljakarta - totalsolo - totalkarawang;
        System.out.println("total plat mobil kudus:" + totaljogja + "+totaljakarta" + totalsolo + totalkarawang);
        System.out.println("jumlah seluruh mobil" + totaljumlahmobil + "|total sisa mobil" + sisamobil);
        System.out.println();
        Scanner aku = new Scanner(System.in);
        System.out.println("masukan plat kendaraan");
        System.out.println("masukan lokasi");
        String lokasi = aku.nextLine();
        System.out.println("masukan plat kendaraan");
        int nomor = aku.nextInt();
        switch (lokasi) {
            case "k":
                System.out.println("plat nomor kudus");
                break;
            case "AB":
                System.out.println("plat nomor jogja");
                break;
            case "B":
                System.out.println("plat nomor jakarta");
                break;
            case "AD":
                System.out.println("plat nomor solo");
                break;
            case "T":
                System.out.println("plat nomor karawang");
                break;
            default:
                System.out.println("plat kendaraan salah");
        }
        if (nomor % 2 == 0) {
            System.out.println("nomor plat genap");
        } else {
            System.out.println("nomor plat ganjil");

            int i, j, k = 0, jlh_genap = 0, jlh_ganjil = 0;
            for (i = 1; i <= 100; i++) {
                if (i % 2 == 0) ;
                jlh_genap++;
            }
        }
        int i, j, k = 0, jlh_genap = 0, jlh_ganjil = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) ;
            jlh_ganjil++;

        }
    }
}
