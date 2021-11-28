package com.jpassgo.bankapi.bankapi.services;

import com.jpassgo.bankapi.bankapi.models.User;
import com.jpassgo.bankapi.bankapi.repositories.UserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
  private final UserRepository userRepository;

  public Integer createUser(User user) {
    return Integer.valueOf(userRepository.insert(user).getId());
  }

  public User getUser(String id) {
    Optional<User> optionalUser = userRepository.findById(id);
    if (optionalUser.isPresent()) {
      return optionalUser.get();
    } else {
      return null;
    }
  }

  public User updateUser(User user) {
    return userRepository.save(user);
  }
}
