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
        <ul>
        		<c:forEach var="listValue" items="">
        			<li></li>
        		</c:forEach>
        	</ul>
        <nav class="nav">
            <ul>
                <li class="list-element-return"><a class="link" href="/index">Powrót</a></li>
            </ul>
        </nav>
    </div>
    <footer class="footer">Created by Smoua.</footer>
</body>

</html>