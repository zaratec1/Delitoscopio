<%--
    Document   : listarusuarios
    Created on : 05-jun-2017, 13:43:37
    Author     : zaratec
--%>


<%@page import="clases.VictimaCrud"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link rel="stylesheet" href="css/estilos.css"/>
    <script type="text/javascript" src="js/sorttable.js"></script>
    
    <title>Listado de Victimas</title>
  </head>
  <body >
    <div class="row">
        <div class="col l12 m12 s12">
          <nav>
            <div class="nav-wrapper">
              <a class="brand-logo left" href="#"></a>
              <ul class="right">
                <li class="active"><a href="nuevavictima.jsp"><i class="material-icons left">home</i>Inicio</a></li>
                <li><a href=""><i class="material-icons left">dashboard</i>Productos</a></li>
                <li><a href=""><i class="material-icons left">dashboard</i>Servicios</a></li>
              </ul>
            </div>
          </nav>
        </div>
    </div>
    <div class="row">
        <div class="col l12 m12 s12">
            <h4 class="center-align">Mantenimiento de Victimas</h4>
        </div>
    </div>
    <div class="row">
      <div class="col s12 m12 l12" id="editarvictima"></div>
    </div>
    <div class="row">

        <div class="input-field  col l6 m6 s12">
            <i class="material-icons prefix">search</i>
            <input id="buscar_vic" name="buscar_vic" type="text" class="validate" onkeyup="buscarvictimatabla()">
            <label for="buscar_vic" id="l_buscar_vic">Buscar victima</label>
        </div>
        
      <div class="col s12 m12 l12">
        <table id="tabla_vic" class="sortable">
          <thead>
              <tr>
                <th>Id</th>
                <th>Céd/Pas</th>
                <th>Apellidos</th>
                <th>Nombres</th>
                <th>Edad</th>
                <th>Género</th>
                <th>Acciones</th>
              </tr>
          </thead>
          <tbody>
              <%
                VictimaCrud vic = new VictimaCrud();
                ResultSet  rs = vic.BuscarVictimas();
                while(rs.next())
                {
                    out.println("<tr>");
                    out.println("<td>"+rs.getInt("id_vic")+"</td>");
                    out.println("<td>"+rs.getString("ci_pas_vic")+"</td>");
                    out.println("<td>"+rs.getString("ape_vic")+"</td>");
                    out.println("<td>"+rs.getString("nom_vic")+"</td>");
                    out.println("<td>"+rs.getString("eda_vic")+"</td>");
                    out.println("<td>"+rs.getString("gen_vic")+"</td>");
                    out.println("<td><span class='nuevo'><i class='material-icons left'>note_add</i></span><span class='editar'><i class='material-icons left'>mode_edit</i></span><span class='eliminar'><i class='material-icons left'>delete</i></span></td>");
                    out.println("</tr>");
                }
              %>
          </tbody>
        </table>
      </div>
    </div>

    <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script> <%-- efectos en el campo texto --%>
    <script type="text/javascript" src="js/jquery.validate.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/victima/click_tabla_editar_vic.js"></script>
    <script type="text/javascript" src="js/victima/click_tabla_eliminar_vic.js"></script>
    <script type="text/javascript" src="js/victima/buscar_victima_tabla.js"></script>
    <script type="text/javascript" src="js/victima/click_tabla_crear_vic.js"></script>
    <script type="text/javascript" src="js/victima/borrar_buscador_vic.js"></script>
  </body>
</html>
