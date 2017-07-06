
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>
        Login
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="Style.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>

        $(document).ready(function() {
            $("button.loginButton").click(function() {
                $("div.login").css("display", "inline");
            });

            $("button.registerButton").click(function() {
                $("div.register").css("display", "inline");
            });

            $(".submit").on('click',function(e) {

                var pass = $('input[name = "regPassword"]').val();
                var cpassword = $('input[name = "confirmPassword"]').val();
                if(pass != cpassword) {
                    /*$("div.alert-warning").append("Password and Confirm Password do not match.");
                    $("div.alert-warning").css("font-size","20px");
                    $("div.alert-warning").css("display","inline");*/
                    alert("Password and Confirm Password do not match");
                    e.preventDefault();
                }
            });
            /* $("button.submit").click(function() {

             var password = $('input[name = "password"]').val();
             var cpassword = $('input[name = "confirmPassword"]').val();
             if(password == cpassword) {

             $("form#registeration").attr("action", "Register");
             }
             });*/

        });

    </script>
</head>

<body>


<div class="well  col-md-12">
    <span class="col-md-3">To The Bloggers'</span>
    <span class=" col-md-offset-7 col-md-1"><a href="#home">Home</a></span>
    <span class="col-md-1"><a href="#about">About</a></span>
</div>
<div style="font-size:medium; color:white; text-align: center; " class="col-md-12">${message}</div>
<div class="col-md-10 left">
    <p class="col-md-offset-4 col-md-8">Move thinking forward</p>
    <p class="col-md-offset-3 col-md-8">To The Bloggers' is community of readers and writers offering unique perspectives on ideas, large and small.</p>
    <button class="button col-md-offset-4 col-md-2 registerButton">Register</button>
    <button class="button col-md-offset-1 col-md-2 loginButton">Login</button>
</div>
<div class="alert alert-warning" style="display:none;">
    Invalid Username or Password.
</div>
<div class="col-md-2 login" style="display:none;">
    <p class="col-md-offset-4">Login</p>
    <form method="post" action="Login">
        <div class="form-group">
            <input type="text" name="user" placeholder="Username" class="col-md-12 ">
        </div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Password" class="col-md-12">
        </div>
        <button type="submit" class=" button col-md-5 col-md-offset-4">Login</button>
    </form>
</div>

<div class="col-md-2 register" style="display:none;">
    <p class="col-md-offset-4 ">Register</p>
    <form method="post" action="Register" id="registeration">
        <div class="form-group">
            <input type="text" name="user" placeholder="Username" class="col-md-12 ">
        </div>
        <div class="form-group">
            <input type="email" name="email" placeholder="Email" class="col-md-12">
        </div>
        <div class="form-group">
            <input type="password" name="regPassword" placeholder="Password" class="col-md-12">
        </div>
        <div class="form-group">
            <input type="password" name="confirmPassword" placeholder="Confirm Password" class="col-md-12">
        </div>
        <button type="submit" class=" button col-md-5 col-md-offset-4 submit">Register</button>
    </form>
</div>

</body>

</html>
