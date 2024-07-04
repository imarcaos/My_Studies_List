<%-- 
    Document   : index
    Created on : 30/06/2024, 23:22:53
    Author     : Marcos Melo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <script src="assets/js/bootstrap.bundle.min.js"></script>
        <script src="assets/js/jquery-3.7.1.min.js"></script>
        
    </head>
    <body>
        <form action="UserController" method="POST">
            <input type="text" name="user">
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        
        
        <script>            
            $(document).ready(function() {;
            });
        </script>
        
    </body>
</html>
