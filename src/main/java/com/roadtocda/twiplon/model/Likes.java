package com.roadtocda.twiplon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(LikesId.class)
public class Likes {
	@Id
	private int id_user;

	@Id
	private int idpost;

	// Relation Many-to-One vers la publication (plusieurs likes sont associés à une publication)
	@ManyToOne
	@JoinColumn(name = "idpost", insertable = false, updatable = false) //  la colonne de jointure est gérée par l'autre entité associée, et vous ne souhaitez pas que l'entité actuelle s'en occupe
	private Post post;
	

	// Getters et Setters (à générer ou écrire manuellement)

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getIdpost() {
		return idpost;
	}

	public void setIdpost(int idpost) {
		this.idpost = idpost;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	
	// Autres méthodes et constructeurs si nécessaire
	
}