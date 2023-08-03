package com.roadtocda.twiplon.model;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    private String username;
	private String firstname;
    private String lastname;
    @Column(columnDefinition = "DATE")
    private Timestamp datecreation;

    
 // Relation One-to-Many avec les publications (un utilisateur peut avoir plusieurs publications)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;
    
    public int getId_user() {
		return id_user;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Timestamp getDatecreation() {
		return datecreation;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setDatecreation(Timestamp datecreation) {
		this.datecreation = datecreation;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
