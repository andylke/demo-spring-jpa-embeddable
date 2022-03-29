package com.github.andylke.demo.user;

import javax.persistence.Embeddable;

@Embeddable
public class UserDetails {

  private String name;

  private String email;

  private String nationality;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
}
