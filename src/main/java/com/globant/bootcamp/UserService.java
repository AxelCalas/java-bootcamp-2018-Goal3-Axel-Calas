package com.globant.bootcamp;

import java.util.ArrayList;

public class UserService{
    ArrayList<User> usersList;
    
    public UserService(){
        usersList = new ArrayList<User>();
    }
    
    public void createUser(String id){
        User user = new User(id);
        usersList.add(user);
    }
    
    public void deleteUser(String id){
        for (int i = 0; i < usersList.size(); i++) {
            if(usersList.get(i).getId() == id) {
                usersList.remove(i);
            }
        }
    }
    
    public void readUsers(){
        for (int i = 0; i < usersList.size(); i++) {
            System.out.println("User: " + usersList.get(i).getId() + "\n");
        }
    }
}
