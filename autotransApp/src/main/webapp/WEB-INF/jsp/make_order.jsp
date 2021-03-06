<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
<link rel="stylesheet" href="./styles/main.css">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Auto-Trans App</title>
    <script src="script.js" defer></script>
</head>

<body class="body">
    <div class="wrapper">
        <header class="header">
            <img class="logo"
                src="https://scontent.fwaw3-1.fna.fbcdn.net/v/t1.0-9/52601919_1102364836609769_8100920323030908928_n.png?_nc_cat=100&_nc_sid=09cbfe&_nc_ohc=iabskM0fmOAAX9e1Hpu&_nc_ht=scontent.fwaw3-1.fna&oh=019400a0b3b1612df59c21fab0949f79&oe=5FA16FAA"
                alt="Logo" width="100" height="100">
            <h1 class="header_text">Auto-Trans App v1.0</h1>
        </header>
        <div class="dropdown">
            <label for="order-type">Wybierz typ zlecenia: </label>
            <select class="main-options">
                <option disabled value>Wybierz jedną z opcji:</option>
                <option selected value="mech">Naprawa mechaniczna</option>
                <option value="paint">Naprawa blacharsko-lakiernicza</option>
                <option value="other">Inne</option>
            </select>
        </div>
        <div class="mech">
            <p class="input-header">Szczególy naprawy mechanicznej:</p>
            <label class="label" for="mech-name">Nazwa firmy/Imię i nazwisko:</label>
            <input class="normal-input" type="text">
            <label class="label" for="mech-date">Data przyjęcia zlecenia:</label>
            <input class="normal-input" type="text">
            <label class="label" for="mech-registration">Numer rejestracyjny:</label>
            <input class="normal-input" type="text">
            <label class="label" for="mech-make">Marka:</label>
            <input class="normal-input" type="text">
            <label class="label" for="mech-model">Model:</label>
            <input class="normal-input" type="text">
            <label class="label" for="mech-procedure">Przebieg naprawy:</label>
            <input class="extended-input" type="text">
            <label class="label" for="mech-parts">Zamówione części:</label>
            <input class="extended-input" type="text">
            <button class="button" type="button">Dodaj zdjęcia</button>
            <button class="button" type="button">Dodaj kosztorys</button>
            <button class="add" type="button">Dodaj do bazy</button>
        </div>
        <div class="paint">
            <p class="input-header">Szczególy naprawy blacharsko-lakierniczej:</p>
            <label class="label" for="paint-name">Nazwa firmy/Imię i nazwisko:</label>
            <input class="normal-input" type="text">
            <label class="label" for="paint-date">Data przyjęcia zlecenia:</label>
            <input class="normal-input" type="text">
            <label class="label" for="paint-registration">Numer rejestracyjny:</label>
            <input class="normal-input" type="text">
            <label class="label" for="paint-make">Marka:</label>
            <input class="normal-input" type="text">
            <label class="label" for="paint-model">Model:</label>
            <input class="normal-input" type="text">
            <label class="label" for="paint-procedure">Przebieg naprawy:</label>
            <input class="extended-input" type="text">
            <label class="label" for="paint-parts">Zamówione części:</label>
            <input class="extended-input" type="text">
            <button class="button" type="button">Dodaj zdjęcia</button>
            <button class="button" type="button">Dodaj kosztorys</button>
            <button class="add" type="button">Dodaj do bazy</button>
        </div>
        <div class="other">
            <p class="input-header">Inne zlecenie:</p>
            <label class="label" for="paint-parts">Opisz zlecenie:</label>
            <input class="extended-input" type="text">
            <button class="add" type="button">Dodaj do bazy</button>
        </div>
        <nav class="nav">
            <ul>
                <li class="list-element-return"><a class="link" href="/index">Powrót</a></li>
            </ul>
        </nav>
    </div>
    <footer class="footer">Created by Smoua.</footer>
</body>

</html>