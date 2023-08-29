let btnLike = document.getElementById("btnLike");
let liked = document.getElementById("likedIcon");
let unLiked = document.getElementById("unlikedIcon");
let isLiked = false;

btnLike.addEventListener("click", function () {
  console.log("Cliqué sur le bouton de like");
  if (isLiked) {
    isLiked = false;
    liked.style.display = "none";
    unLiked.style.display = "flex";
    console.log("Disliked");
  } else {
    isLiked = true;
    liked.style.display = "flex";
    unLiked.style.display = "none";
    console.log("Liked");
  }
});
