package org.example.services;

import org.example.classes.Client;
import org.example.classes.Project;
import org.example.classes.ProjectWorker;
import org.example.classes.Worker;
import org.example.Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabasePopulateService {
    public static void main(String[] args) {
        populateWorkerTable();
        populateClientTable();
        populateProjectTable();
        populateProjectWorkerTable();
    }
    public static void populateWorkerTable(){
        String sql = "INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY) VALUES (?, ?, ?, ?)";
        try{
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(Worker worker : new Worker().generateWorkersList()){
                statement.setString(1, worker.getName());
                statement.setDate(2, Date.valueOf(worker.getBirthday()));
                statement.setString(3, worker.getLevel());
                statement.setInt(4, worker.getSalary());
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateClientTable(){
        String sql = "INSERT INTO client (name) VALUES (?)";
        try{
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(Client client : new Client().generateClient()){
                statement.setString(1, client.getName());
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateProjectTable(){
        String sql = "INSERT INTO project (client_id, start_date, finish_date) VALUES (?, ?, ?)";
        try {
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(Project project : new Project().generateProjectsList()){
                statement.setInt(1, project.getId());
                statement.setDate(2, Date.valueOf(project.getStartDate()));
                statement.setDate(3, Date.valueOf(project.getFinishDate()));
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateProjectWorkerTable(){
        String sql = "INSERT INTO project_worker (project_ID, worker_ID) VALUES (?, ?)";
        try{
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(ProjectWorker projectWorker : new ProjectWorker().generateProjectWorkerList()){
                statement.setInt(1, projectWorker.getProjectId());
                statement.setInt(2, projectWorker.getWorkerId());
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}