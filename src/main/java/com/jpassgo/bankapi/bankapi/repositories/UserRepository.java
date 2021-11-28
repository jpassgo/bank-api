package com.jpassgo.bankapi.bankapi.repositories;

import com.jpassgo.bankapi.bankapi.models.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
  public Optional<User> findById(String id);

  public Optional<User> findByUsername(String userName);
}
