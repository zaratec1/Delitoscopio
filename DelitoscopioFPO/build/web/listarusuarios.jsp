<%--
    Document   : listarusuarios
    Created on : 05-jun-2017, 13:43:37
    Author     : zaratec
--%>


<%@page import="clases.UsuarioCrud"%>
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
    
    <title>Listado de Usuarios</title>
  </head>
  <body >
    <div class="row">
        <div class="col l12 m12 s12">
          <nav>
            <div class="nav-wrapper">
              <a class="brand-logo left" href="#"></a>
              <ul class="right">
                <li class="active"><a href="nuevousuario.jsp"><i class="material-icons left">home</i>Inicio</a></li>
                <li><a href=""><i class="material-icons left">dashboard</i>Productos</a></li>
                <li><a href=""><i class="material-icons left">dashboard</i>Servicios</a></li>
              </ul>
            </div>
          </nav>
        </div>
    </div>
    <div class="row">
        <div class="col l12 m12 s12">
            <h4 class="center-align">Mantenimiento de Usuarios</h4>
        </div>
    </div>
    <div class="row">
      <div class="col s12 m12 l12" id="editarusuario"></div>
    </div>
    <div class="row">

        <div class="input-field  col l6 m6 s12">
            <i class="material-icons prefix">search</i>
            <input id="buscar_usu" name="buscar_usu" type="text" class="validate" onkeyup="buscarusuariotabla()">
            <label for="buscar_usu" id="l_buscar_usu">Buscar usuario</label>
        </div>
        
      <div class="col s12 m12 l12">
        <table id="tabla_usu" class="sortable">
          <thead>
              <tr>
                <th>Id</th>
                <th>Cédula</th>
                <th>Nombre</th>
                <th>Nick</th>
                <th style="visibility: hidden">Password</th>
                <th>Email</th>
                <th>Acciones</th>
              </tr>
          </thead>
          <tbody>
              <%
                UsuarioCrud usu = new UsuarioCrud();
                ResultSet  rs = usu.BuscarUsuarios();
                while(rs.next())
                {
                    out.println("<tr>");
                    out.println("<td>"+rs.getInt("id_usu")+"</td>");
                    out.println("<td>"+rs.getString("ci_usu")+"</td>");
                    out.println("<td>"+rs.getString("ape_nom_usu")+"</td>");
                    out.println("<td>"+rs.getString("nic_usu")+"</td>");
                    out.println("<td style='visibility: hidden'>"+rs.getString("pas_usu")+"</td>");
                    out.println("<td>"+rs.getString("ema_usu")+"</td>");
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
    <script type="text/javascript" src="js/usuario/click_tabla_editar_usu.js"></script>
    <script type="text/javascript" src="js/usuario/click_tabla_eliminar_usu.js"></script>
    <script type="text/javascript" src="js/usuario/buscar_usuario_tabla.js"></script>
    <script type="text/javascript" src="js/usuario/click_tabla_crear_usu.js"></script>
    <script type="text/javascript" src="js/usuario/borrar_buscador_usu.js"></script>
  </body>
</html>
