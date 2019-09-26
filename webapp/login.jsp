<%-- 
    Document   : index
    Created on : 25 Sep, 2019, 10:57:22 PM
    Author     : shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Spring Project</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <div id="img">
            <img src="images.png" style="width: 85%;height: 85%;margin-left: 40px;margin-top: 50px">
        </div>
        <div id="loginForm">
            <div id="fillForm">
            <form action="/welcome">
                <label for="fname">Email id</label>
                <input type="text" id="fname" name="emailId" placeholder="Email...">

                <label for="lname">Password</label>
                <input type="text" id="lname" name="password" placeholder="Password...">
                <input type="submit" value="LOGIN">
                <a href="/" style="margin-left: 45%">Sign Up....</a> 
            </form>
            </div>
        </div>
    </body>
</html>
