package com.jpassgo.bankapi.bankapi.models;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

  @Id private String id;
  private String firstName;
  private String lastName;
  private String userName;
  private String password;
  private List<Account> accounts;
}
