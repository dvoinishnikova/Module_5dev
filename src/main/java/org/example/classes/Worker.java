package org.example.classes;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Worker {
    private String name;
    private LocalDate birthday;
    private String level;
    private int salary;
    public Worker(String name, LocalDate birthday, String level, int salary){
        this.name = name;
        this.birthday = birthday;
        this.level = level;
        this.salary = salary;
    }

    public Worker(){
    }

    public List<Worker> generateWorkersList(){
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John Doe", LocalDate.of(1990, 5, 15), "Junior", 2000));
        workers.add(new Worker("Jane Smith", LocalDate.of(1995, 8,21), "Middle", 3000));
        workers.add(new Worker("Max Johnson", LocalDate.of(2000,1,7), "Middle", 4000));
        workers.add(new Worker("Sarah Wilson", LocalDate.of(1992,11,30), "Middle", 3500));
        workers.add(new Worker("Mike Davis", LocalDate.of(1985,4,10), "Senior", 4500));
        workers.add(new Worker("Emily Brown", LocalDate.of(1998,7,25), "Trainee", 1500));
        workers.add(new Worker("David Miller", LocalDate.of(1993,3,19), "Middle", 3200));
        workers.add(new Worker("Emma Anderson", LocalDate.of(1988,9,2), "Junior", 2200));
        workers.add(new Worker("James Taylor", LocalDate.of(1991,12,5), "Senior", 4800));
        workers.add(new Worker("Olivia Thomas", LocalDate.of(1997,6,12), "Junior", 2300));
        return workers;
    }
}