package edu.gvsu.cis.campbjos.heterogeneousrecyclerview.models;

/**
 * User model class for RecyclerView demo.
 *
 * @author Josiah Campbell
 * @version November 2015
 */
public class User {

  private String userName;
  private String location;

  public User(String userName, String location) {
    this.userName = userName;
    this.location = location;
  }

  public String getUserName() {
    return this.userName;
  }

  public String getLocation() {
    return this.location;
  }
}
