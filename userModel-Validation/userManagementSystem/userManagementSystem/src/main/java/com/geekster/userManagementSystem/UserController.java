package com.geekster.userManagementSystem;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

     @Autowired
     List<User> userList;

     //Create User _post APIs

     //Add a user ;

     @PostMapping("user")
     public String addUser(@RequestBody @Valid User myUser)
     {
          userList.add(myUser);
          return "User added";
     }
     @GetMapping("users")
     public List<User> getAllUsers()
     {
          return userList;
     }

     //update UserInfo
     @PutMapping("user/id/{id}/status")
     public String setUserStatusId(@PathVariable @Valid Integer id)
     {
          for(User user : userList)
          {
               if(user.getUserId().equals(id))
               {
                    return "user" + " " + id + " " + "updated";
               }
          }
          return "Invalid id";
     }

     //delete UserInfo


     @DeleteMapping("user/id/{id}")
     public String removeUserStatusId(@PathVariable @Valid Integer id) {
          for (User user : userList) {
               if (user.getUserId().equals(id)) {
                    userList.remove(user);
                    return "user" + " " + id + " " + "removed";
               }
          }
          return "Invalid id";
     }

}
