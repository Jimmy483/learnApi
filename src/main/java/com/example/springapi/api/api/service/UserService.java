package com.example.springapi.api.api.service;

import com.example.springapi.api.api.model.User;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public List<User> userList;

    public UserService(){
        userList=new ArrayList<>();

        User user1 = new User(1,"Gmi",20,"jimmy@edu.np");
        User user2 = new User(2,"Thiago",39,"thiago@edu");
        User user3 = new User(3,"Kante",31,"kante@edu");
        User user4 = new User(4,"Reece",24,"reece@edu");

        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }

    public Optional<User> getUser(Integer id){
        Optional userOptional=Optional.empty();
        for(User user: userList){
            if(id==user.getId()){
                userOptional=Optional.of(user);
                return userOptional;
            }
        }
        return userOptional;
    }
}
