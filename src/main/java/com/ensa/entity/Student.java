package com.ensa.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String nom;
private String prenom;
@Temporal(TemporalType.DATE)
private Date dateNaissance;
public Student() {
super();
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}
public Date getDateNaissance() {
return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
this.dateNaissance = dateNaissance;
}
}
