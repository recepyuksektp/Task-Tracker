package com.recep.tasktracker.service;

import com.recep.tasktracker.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> gorevListesi = new ArrayList<>();

    public void gorevEkle(Task task) {
        gorevListesi.add(task);
        System.out.println("Görev başarıyla eklendi.");
    }

    public void gorevleriListele() {
        if (gorevListesi.isEmpty()) {
            System.out.println("Henüz görev eklenmedi.");
        } else {
            System.out.println("--- Görev Listesi ---");
            gorevListesi.forEach(System.out::println);
        }
    }
}
