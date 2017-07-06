<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link  rel="stylesheet" href="Style.css">
</head>
<body>
<div class="well  col-md-12">
    <span class="col-md-3">To The Bloggers'</span>
    <span class=" col-md-offset-7 col-md-1"><a href="#home">Home</a></span>
    <span class="col-md-1"><a href="#about">About</a></span>

            <span class="col-md-3">Hi <%= request.getParameter("user").toUpperCase()%></span>
            <span><button class="button btn-default logout col-md-3" onclick="location.href='/Logout'">Logout</button></span>

    </div>
    <form method="post" action="JdbcConnection" >
    <input type="text" name = "blog_id" value="<%= session.getAttribute("user")%>" readonly><br/><br/>
    <input type="text" name="blog_content"><br/><br/>
    <input type="submit" value="Add">
</form>

</body>
</html>
