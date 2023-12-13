<%--
  Created by IntelliJ IDEA.
  User: aitke
  Date: 17.11.2023
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Match</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Player Registration</h1>
    <form method="post" action="new-match">
            <label for="player1-name">Enter name of Player 1
                <input id="player1-name" type="text" required>
                </label>
            <label for="player2-name">Enter name of Player 2
                <input id="player2-name" type="text" required>
            </label>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
