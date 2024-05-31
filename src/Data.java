import java.util.ArrayList;
import java.util.Scanner;

class Data {
    static ArrayList<Tanaman> tanamans = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void mulai() {
        System.out.print("Masa tanam (bulan): ");
        int bulan = in.nextInt();
        int hari = bulan * 30;

        for (int i = 0; i < 3; i++) {
            menanam();
        }

        System.out.println("\n----------------\nPROSES PERKEMBANGAN\n----------------");

        for (int i = 0; i < hari; i++) {
            ArrayList<Integer> mati = new ArrayList<>();
            for (int j = 0; j < tanamans.size(); j++) {
                if (tanamans.get(j).status().equals("Hidup")) {
                    tanamans.get(j).berkembang();
                } else {
                    mati.add(j);
                }
            }

            if ((i + 1) % 90 == 0) {
                System.out.println("\n----------------\nDILAKUKAN PERAWATAN\n----------------");
                for (int j = 0; j < tanamans.size(); j++) {
                    if (tanamans.get(j).status().equals("Hidup")) {
                        ((Perawatan) tanamans.get(j)).treatment();
                    }
                }
            }

            for (int j : mati) {
                System.out.println("Tanaman " + tanamans.get(j).getClass().getSimpleName() + " telah mati.");
                tanamans.remove(j);
                menanam();
            }
        }
    }

    public static void menanam() {
        System.out.println("Mau menanam apa?");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                tanamans.add(new Tomat());
                System.out.println("Tomat berhasil ditanam.");
                break;
            case 2:
                tanamans.add(new Stroberi());
                System.out.println("Stroberi berhasil ditanam.");
                break;
            case 3:
                tanamans.add(new Persik());
                System.out.println("Persik berhasil ditanam.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                menanam();
                break;
        }
    }

    public static void info() {
        System.out.println("------HASIL MENANAM------");
        for (int i = 0; i < tanamans.size(); i++) {
            System.out.println("Tanaman buah ke-" + (i + 1));
            System.out.println(tanamans.get(i).toString());
            System.out.println();
        }
    }
}
