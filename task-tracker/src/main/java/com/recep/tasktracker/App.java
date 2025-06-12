package com.recep.tasktracker;

import com.recep.tasktracker.model.Task;
import com.recep.tasktracker.service.TaskService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskService taskService = new TaskService();

        while (true) {
            System.out.println("\n--- GÖREV TAKİP UYGULAMASI ---");
            System.out.println("1. Görev Ekle");
            System.out.println("2. Görevleri Listele");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Görev adı: ");
                    String ad = scanner.nextLine();
                    System.out.print("Açıklama: ");
                    String aciklama = scanner.nextLine();
                    taskService.gorevEkle(new Task(ad, aciklama));
                    break;
                case 2:
                    taskService.gorevleriListele();
                    break;
                case 3:
                    System.out.println("Çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
