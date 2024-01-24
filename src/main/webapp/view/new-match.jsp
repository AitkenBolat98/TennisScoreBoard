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
    <link rel="stylesheet" href="../styles.css">
</head>
<body>
    <h1>Player Registration</h1>
    <form action="/view/new-match" method="post" name="newmatchform">
        <div class="formcontainer">
            <div class="input-container">
                <label for="player1"><strong>Player 1 name</strong></label>
                <input type="text" name="player1" id="player1" placeholder="P1 name" required >
                <label for="player2"><strong>Player 2 name</strong></label>
                <input type="text" name="player2" id="player2" placeholder="P2 name" required >
                <input type="submit" value="Start match!">
            </div>
        </div>
    </form>
</body>
</html>
