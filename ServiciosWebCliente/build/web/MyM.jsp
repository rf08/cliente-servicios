<%-- 
    Document   : MyM
    Created on : 19-nov-2019, 15:30:45
    Author     : ADMIN
--%>

<%@page import="Modelo.notas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <STYLE type="text/css">
            H5 { text-align: center}
        </STYLE>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="center-block">
            <div class="card">
                <div class="card-header col-md-4 d-block mx-auto">
                    <h5>NOTA MAXIMA Y MINIMA</h5>
                </div>
                <div class="card-body col-md-4 d-block mx-auto">
                    <form action="Controlador">
                        <% notas nt = new notas();
                        String resul = nt.maxyMin(); %>
                        <h5><% out.println(resul); %></h5>
                        <hr>
                        <a href="Controlador?accion=index" class="btn btn-success">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
