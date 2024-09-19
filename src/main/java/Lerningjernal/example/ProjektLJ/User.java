package Lerningjernal.example.ProjektLJ;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String username;
  private String passwort;
  private String rolle;


  public User(){}

  public User( String username, String passwort, String rolle) {
    this.username = username;
    this.passwort = passwort;
    this.rolle = rolle;
  }
}

