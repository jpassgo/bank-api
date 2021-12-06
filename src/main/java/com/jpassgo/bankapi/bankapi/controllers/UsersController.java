package com.jpassgo.bankapi.bankapi.controllers;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import com.jpassgo.bankapi.bankapi.models.User;
import com.jpassgo.bankapi.bankapi.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/users")
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
  public ResponseEntity deleteUser(String id) {
    if (usersService.deleteUser(id)) {
      return ResponseEntity.ok().build();
    } else {
      return new ResponseEntity(NOT_FOUND);
    }
  }
}
