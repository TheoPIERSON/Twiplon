package com.roadtocda.twiplon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(CommentId.class)
public class Comment {
    @Id
    private Long id_user;

    @Id
    private Long idpost;

    // Relation Many-to-One vers la publication (plusieurs commentaires sont associés à une publication)
    @ManyToOne
    @JoinColumn(name = "idpost", insertable = false, updatable = false)
    private Post post;

    // Getters et Setters (à générer ou écrire manuellement)

    // Autres méthodes et constructeurs si nécessaire
}
