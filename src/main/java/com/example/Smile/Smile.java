package com.example.Smile;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "smiles")
public class Smile {

  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  private Boolean isCrying;
  private Boolean isLaughing;
  
  protected Smile() {}
  
  public Smile(Boolean isCrying, Boolean isLaughing) {
    this.isCrying = isCrying;
    this.isLaughing = isLaughing;
  }
  
  @Override
  public String toString() {
    return String.format(
      "Smile[id=%d, isCrying='%s', isLaughing='%s']",
      id, isCrying, isLaughing);
    }
    
  public Long getId() {
    return id;
  }
  
  public Boolean getIsCrying() {
    return isCrying;
  }
  
  public Boolean getIsLaughing() {
    return isLaughing;
  }

  
}


