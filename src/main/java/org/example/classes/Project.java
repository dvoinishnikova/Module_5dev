package org.example.classes;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Project {
    private int id;
    private LocalDate startDate;
    private LocalDate finishDate;
    public  Project(){}
    private Project(int id, LocalDate startDate, LocalDate finishDate) {
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }
    public List<Project> generateProjectsList(){
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 6, 30)));
        projects.add(new Project(1, LocalDate.of(2022, 3, 15), LocalDate.of(2022, 8, 31)));
        projects.add(new Project(2, LocalDate.of(2022, 5, 10), LocalDate.of(2022, 10, 31)));
        projects.add(new Project(3, LocalDate.of(2022, 7, 1), LocalDate.of(2022, 12, 31)));
        projects.add(new Project(3, LocalDate.of(2022, 9, 15), LocalDate.of(2023, 3, 31)));
        projects.add(new Project(4, LocalDate.of(2022, 11, 1), LocalDate.of(2023, 5, 31)));
        projects.add(new Project(4, LocalDate.of(2023, 1, 15), LocalDate.of(2023, 7, 31)));
        projects.add(new Project(5, LocalDate.of(2023, 3, 1), LocalDate.of(2023, 9, 30)));
        projects.add(new Project(5, LocalDate.of(2023, 5, 15), LocalDate.of(2023, 12, 31)));
        projects.add(new Project(5, LocalDate.of(2023, 7, 1), LocalDate.of(2024, 1, 31)));
        return projects;
    }
}