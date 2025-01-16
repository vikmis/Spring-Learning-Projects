<%-- <%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Result is:</h2>
        <p>${result}</p>

    </body>
</html>
 --%>
 
<!--  After ModelAttribute chapter it is getting changed -->

<%@ page language="java" isELIgnored="false" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h2>Alien Details:</h2>
    <p>Alien ID: ${alien.aid}</p>
    <p>Alien Name: ${alien.aname}</p>
    <p>Course: ${course}</p>
</body>
</html>
