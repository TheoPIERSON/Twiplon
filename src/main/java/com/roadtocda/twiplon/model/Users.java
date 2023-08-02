package com.roadtocda.twiplon.model;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String username;
	private String firstname;
    private String lastname;
    private Date datecreation;

    
 // Relation One-to-Many avec les publications (un utilisateur peut avoir plusieurs publications)
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Post> posts;
    
    public Long getId_user() {
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

	public Date getDatecreation() {
		return datecreation;
	}



	public void setId_user(Long id_user) {
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

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
