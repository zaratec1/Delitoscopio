<%--
    Document   : some.jsp
    Created on : 05-jun-2017, 9:39:58
    Author     : zaratec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link rel="stylesheet" href="css/estilos.css"/>
    <title>Registro de usuarios</title>
  </head>
  <body>
    <div class="row">
        <div class="col l12 m12 s12">
          <nav>
            <div class="nav-wrapper">
              <a class="brand-logo left" href="#"></a>
              <ul class="right">
                <li class="active"><a href="index.html"><i class="material-icons left">home</i>Inicio</a></li>
                <li><a href=""><i class="material-icons left">dashboard</i>Productos</a></li>
                <li><a href=""><i class="material-icons left">dashboard</i>Servicios</a></li>
              </ul>
            </div>
          </nav>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col s12">
                <h4 class="center-align">Registro de Usuarios</h4>
            </div>
        </div>
    </div>

    <div class="row">
        <form id="fusu">
            <div class="col l10 m12 s12 push-l1">
                <div class="row">
                    <div class="input-field  col l6 m6 s12">
                        <i class="material-icons prefix">assignment_ind</i>
                        <input id="ci_usu" type="text" class="validate">
                        <label for="ci_usu" id="l_ci_usu">Cédula</label>
                    </div>
                    <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">perm_identity</i>
                        <input id="ape_nom_usu" type="text" class="validate">
                        <label for="ape_nom_usu" id="l_ape_nom_usu">Nombres y Apellidos</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">person_pin</i>
                        <input id="nic_usu" type="text" class="validate">
                        <label for="nic_usu" id="l_nic_usu">Usuario</label>
                    </div>
                    <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">vpn_key</i>
                        <input id="pas_usu" type="password" class="validate">
                        <label for="pas_usu" id="l_pas_usu">Contraseña</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">vpn_key</i>
                        <input id="con_pas_usu" type="password" class="validate" required="">
                        <label for="con_pas_usu" id="l_con_pas_usu">Confirmar contraseña</label>
                    </div>
                    <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">email</i>
                        <input id="ema_usu" type="email" class="validate">
                        <label for="ema_usu" id="l_ema_usu">E-mail</label>
                    </div>
                </div>
                <div class="row">
                  <div class="col l12 m12 s12">
                      <a id = "BtnNuevo" class="waves-effect waves-light btn"><i class="material-icons left small">insert_drive_file</i></a>
                      <a id = "BtnGuardar" class="waves-effect waves-light btn"><i class="material-icons left">save</i></a>
                      <a href="listarusuarios.jsp" id = "BtnBuscar" class="waves-effect waves-light btn"><i class="material-icons left">find_in_page</i></a>
                  </div>
                </div>
                <div class="row">
                  <div id = "mensaje" class="col l12 m12 s12"></div>
                </div>
            </div>
        </form>
    </div>
    <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script> <%-- efectos en el campo texto --%>
    <script type="text/javascript" src="js/jquery.validate.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/usuario/validar_guardar_usuario.js"></script>
    <script type="text/javascript" src="js/usuario/nuevo_usuario.js"></script>
    <script type="text/javascript" src="js/usuario/focus_ci_usu.js"></script>
  </body>
</html>
