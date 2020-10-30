const mainOptions = document.querySelector('.main-options');

mainOptions.addEventListener('change', function () {

  const mech = document.querySelector('.mech');
  const paint = document.querySelector('.paint');
  const other = document.querySelector('.other');

  if (mainOptions.value == "mech") {
    mech.style.display = "flex";
    paint.style.display = "none";
    other.style.display = "none";
    console.log("Wybrano opcje naprawy mechanicznej");
  } else if (mainOptions.value == "paint") {
    mech.style.display = "none";
    paint.style.display = "flex";
    other.style.display = "none";
    console.log("Wybrano opcje naprawy blacharsko-lakierniczej");
  } else if (mainOptions.value == "other") {
    mech.style.display = "none";
    paint.style.display = "none";
    other.style.display = "flex";
    console.log("Wybrano opcje innej naprawy");
  }
});