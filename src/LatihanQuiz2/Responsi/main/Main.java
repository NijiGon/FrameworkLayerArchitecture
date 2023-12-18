package LatihanQuiz2.Responsi.main;

import LatihanQuiz2.Responsi.model.KumpulanTugas;
import LatihanQuiz2.Responsi.model.Tugas;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    KumpulanTugas kumpulanTugas = new KumpulanTugas();
    String input;
    public Main() {
        do{
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Semua Tugas");
            System.out.println("3. Lanjutkan Tugas");
            System.out.println("4. Exit");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    tambahTugas();
                    break;
                case "2":
                    kumpulanTugas.tampilkanSemuaTugas();
                    break;
                case "3":
                    lanjutkanTugas();
                    break;
            }
        }while (!input.equals("4"));
    }

    private void lanjutkanTugas() {
//        int idx;
//        kumpulanTugas.tampilkanSemuaTugas();
//        System.out.println("Pilih tugas yang ingin dikerjakan");
//        idx = sc.nextInt();
//        sc.nextLine();
//        Tugas tugas = kumpulanTugas.getTugas(idx - 1);
//        tugas.next();

        kumpulanTugas.lanjutkanSemuaTugas();
    }

    private void tambahTugas(){
        String nama;
        System.out.println("Masukkan nama tugas");
        nama = sc.nextLine();
        kumpulanTugas.tambahTugas(new Tugas(nama));
    }

    public static void main(String[] args) {
        new Main();
    }
}
