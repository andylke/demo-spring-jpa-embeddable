package com.github.andylke.demo.user;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

  @Id @GeneratedValue private UUID id;

  @Embedded private UserDetails details;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserDetails getDetails() {
    return details;
  }

  public void setDetails(UserDetails details) {
    this.details = details;
  }
}
