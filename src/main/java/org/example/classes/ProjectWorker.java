package org.example.classes;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProjectWorker {
    private  int projectId;
    private int workerId;
    public ProjectWorker(){}
    private ProjectWorker(int projectId, int workerId){
        this.projectId = projectId;
        this.workerId = workerId;
    }

    public List<ProjectWorker> generateProjectWorkerList(){
        List<ProjectWorker> projectWorkers = new ArrayList<>();
        projectWorkers.add(new ProjectWorker(1,1));
        projectWorkers.add(new ProjectWorker(1,2));
        projectWorkers.add(new ProjectWorker(1, 3));
        projectWorkers.add(new ProjectWorker(2, 4));
        projectWorkers.add(new ProjectWorker(2, 5));
        projectWorkers.add(new ProjectWorker(3,6));
        projectWorkers.add(new ProjectWorker(3, 7));
        projectWorkers.add(new ProjectWorker(4, 8));
        projectWorkers.add(new ProjectWorker(4, 9));
        projectWorkers.add(new ProjectWorker(5, 10));
        projectWorkers.add(new ProjectWorker(6,1));
        projectWorkers.add(new ProjectWorker(6,2));
        projectWorkers.add(new ProjectWorker(7, 3));
        projectWorkers.add(new ProjectWorker(7, 4));
        projectWorkers.add(new ProjectWorker(8, 5));
        projectWorkers.add(new ProjectWorker(8,6));
        projectWorkers.add(new ProjectWorker(9, 7));
        projectWorkers.add(new ProjectWorker(9, 8));
        projectWorkers.add(new ProjectWorker(10, 9));
        projectWorkers.add(new ProjectWorker(10, 10));
        return projectWorkers;
    }
}