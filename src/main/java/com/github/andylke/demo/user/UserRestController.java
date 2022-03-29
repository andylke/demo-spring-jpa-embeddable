package com.github.andylke.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserRestController {

  @Autowired private UserRepository repository;

  @PostMapping()
  public UserDetails createUser(@RequestBody UserDetails userDetails) {
    User user = new User();
    user.setDetails(userDetails);
    repository.save(user);

    return userDetails;
  }
}
