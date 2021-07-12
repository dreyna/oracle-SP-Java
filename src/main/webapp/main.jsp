<%-- 
    Document   : main
    Created on : 8 jul. 2021, 17:58:59
    Author     : dreyna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="recursos/css/main.css"/>
    </head>
    <body>
        <div class="container-md">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container">
                    <a class="navbar-brand" href="#"><b>LENGUAJE DEPROGRAMACIÓN I</b></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">                        
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-user p-3"></i><strong>${sessionScope.nombres}</strong>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <Strong class="dropdown-item" href="#">${sessionScope.rol}</strong>
                                <a class="dropdown-item" href="#"><i class="fas fa-user-edit p-3"></i>Perfil</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Salir<i class="fas fa-sign-in-alt p-3"></i> </a>
                            </div>
                        </li>
                    </ul>                    
                </div>
                </div>
            </nav>
        </div>

        <script src="recursos/js/jquery.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <script src="recursos/js/main.js"></script>
    </body>
</html>
