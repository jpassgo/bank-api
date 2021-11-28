package com.jpassgo.bankapi.bankapi.controllers;

import com.jpassgo.bankapi.bankapi.models.User;
import com.jpassgo.bankapi.bankapi.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UsersController {

  private final UsersService usersService;

  @PostMapping
  public Integer createUser(User user) {
    return usersService.createUser(user);
  }

  @GetMapping
  public User getUser(String id) {
    return usersService.getUser(id);
  }

  @PutMapping
  public User updateUser(User user) {
    return null;
  }

  @DeleteMapping
  public Integer deleteUser(User user) {
    return Integer.valueOf("1");
  }
}
