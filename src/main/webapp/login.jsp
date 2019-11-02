<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>SBU Login Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
<div align="center">
    <a href="http://www.sbu.ac.ir" target="_blank"><img border="0" alt="Logo" width="100" style="width:100px;height:100px;"
                                                        src="http://en.sbu.ac.ir/_catalogs/masterpage/image/logo.png">
    </a>
    <form action="login" method="post">
        <table style="with: 50%">
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username"  size="8"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" size="8" /></td>
            </tr>
        </table>
        <input type="submit" value="Login"  class="btn btn-success" /></form>
</div>
</body>
</html>