package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User user;
    private List<User> userList;

    private static  final String USERS_PATH = "src/main/java/org.example/localDB/users.json";
      //final keyword---once declared can not b modified
  private ObjectMapper objectMapper = new ObjectMapper();
    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>(){});

    }

    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user->{
            return useer1.getName().equals(user.getName()) && UserSe
        })
    };


}
