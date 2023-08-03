package com.roadtocda.twiplon.model;

import java.io.Serializable;
import java.util.Objects;

public class LikesId implements Serializable {
	private static final Long serialVersionUID = 1L;
	
	private int id_user;
    private int idpost;
    
    // constructeur, getters et setters (à générer ou écrire manuellement)
    
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
	
	// Assurez-vous de bien implémenter les méthodes equals() et hashCode()

	@Override
	public int hashCode() {
		return Objects.hash(id_user, idpost);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LikesId other = (LikesId) obj;
		return Objects.equals(id_user, other.id_user) && Objects.equals(idpost, other.idpost);
	}
    
}