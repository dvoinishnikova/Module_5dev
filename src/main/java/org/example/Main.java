package org.example;

import org.example.classes.*;

public class Main {
    public static void main(String[] args) {
        var worker = new Worker().generateWorkersList();
        var client = new Client().generateClient();
        var project = new Project().generateProjectsList();
        var projectWorker = new ProjectWorker().generateProjectWorkerList();
        System.out.println(worker);
        System.out.println(client);
        System.out.println(project);
        System.out.println(projectWorker);
    }
}