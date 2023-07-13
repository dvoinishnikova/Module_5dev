package org.example.classes;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Client {
    private String name;
    public Client(){

    }
    private Client(String name){
        this.name = name;
    }

    public List<Client> generateClient(){
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Client A"));
        clients.add(new Client("Client B"));
        clients.add(new Client("Client C"));
        clients.add(new Client("Client D"));
        clients.add(new Client("Client E"));
        return clients;
    }
}