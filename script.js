const mainOptions = document.querySelector('.main-options');

mainOptions.addEventListener('change', function () {

  const mech = document.querySelector('.mech');
  const paint = document.querySelector('.paint');

  if (mainOptions.value == "mech") {
    mech.style.display = "flex";
    paint.style.display = "none";
    console.log("Wybrano opcje naprawy mechanicznej");
  } else if (mainOptions.value == "paint") {
    mech.style.display = "none";
    paint.style.display = "flex";
    console.log("Wybrano opcje naprawy blacharsko-lakierniczej");
  } else {
    mech.style.display = "none";
    paint.style.display = "none";
  }
});