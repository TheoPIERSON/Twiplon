// Sélectionnez tous les boutons avec la classe .btnLike
let btnLikes = document.querySelectorAll(".btnLike");

btnLikes.forEach((btnLike) => {
  // Attachez un écouteur de clic à chaque bouton
  btnLike.addEventListener("click", function () {
    let likedIcon = btnLike.querySelector(".likedIcon");
    let unLikedIcon = btnLike.querySelector(".unlikedIcon");
    let isLiked = btnLike.getAttribute("data-liked") === "true"; // Obtenez l'état actuel du bouton
    let likeStatus = btnLike.querySelector(".likeStatus");

    if (isLiked) {
      btnLike.setAttribute("data-liked", "false"); // Inversez l'état
      likedIcon.style.display = "none";
      unLikedIcon.style.display = "flex";
      console.log("Disliked");

      // Mettez à jour la variable de modèle Thymeleaf
      likeStatus.textContent = "Soyez le premier à aimer ce post";
    } else {
      btnLike.setAttribute("data-liked", "true"); // Inversez l'état
      likedIcon.style.display = "flex";
      unLikedIcon.style.display = "none";
      console.log("Liked");

      // Mettez à jour la variable de modèle Thymeleaf
      likeStatus.textContent = "Vous aimez ce post";
    }
  });
});
