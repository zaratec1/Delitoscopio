<%-- 
    Document   : victima
    Created on : 28-jun-2017, 12:16:33
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
        <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script> <%-- efectos en el campo texto --%>
        <script type="text/javascript" src="js/jquery.validate.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(document).ready(function ()
            {
                $('select').material_select();
            });
        </script>
        <title>Registro de Víctimas</title>
    </head>
    <body>
        <div class="row">
            <div class="col l12 m12 s12">
              <nav>
                <div class="av-wrapper">
                  <a class="brannd-logo left" href="#"></a>
                  <ul class="right">
                    <li class="active"><a href="index.html"><i class="material-icons left">home</i>Login</a></li>
                  </ul>
                </div>
              </nav>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col s12">
                    <h4 class="center-align">Registro de Víctimas</h4>
                </div>
            </div>
        </div>
        
        <div class="row">
            <form id="fvic" name="fvic">
                <div class="col l10 m12 s12 push-l1">
                    <div class="row">
                        <div class=" input-field col l2 m2 s4">
                            <label>Documento: </label>
                        </div>
                        <div class=" input-field col l2 m2 s4">
                                <input class="with-gap" name="documento" type="radio" id="cedula" value ="cedula" checked/>
                                <label id="l_cedula" for="cedula">Cédula</label>
                        </div>
                        <div class=" input-field col l2 m2 s4">
                                <input class="with-gap" name="documento" type="radio" id="pasaporte" value ="pasaporte" />
                                <label id="l_pasaporte" for="pasaporte">Pasaporte</label>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="input-field  col l6 m6 s12">
                            <i class="material-icons prefix">assignment_ind</i>
                            <input id="ci_pas_vic" type="text" class="validate">
                            <label for="ci_pas_vic" id="l_ci_pas_vic">Cédula/Pasaporte (*)</label>
                        </div>
                        <div class="input-field col l6 m6 s12">
                            <i class="material-icons prefix">perm_identity</i>
                            <input id="ape_vic" type="text" class="validate">
                            <label for="ape_vic" id="l_ape_vic">Apellidos (*)</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col l6 m6 s12">
                            <i class="material-icons prefix">person_pin</i>
                            <input id="nom_vic" type="text" class="validate">
                            <label for="nom_vic" id="l_nom_vic">Nombres (*)</label>
                        </div>
                        <div class="input-field col l6 m6 s12">
                            <i class="material-icons prefix">supervisor_account</i>
                            <input id="eda_vic" type="text" class="validate">
                            <label for="eda_vic" id="l_eda_vic">Edad (*)</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l6 m6 s12">
                            <i class="material-icons prefix">email</i>
                            <input id="ema_vic" type="text" class="validate">
                            <label for="ema_vic" id="l_ema_vic">E-mail</label>
                        </div>
                        <div class="col l3  m6 s12">
                            <label>Género (*)</label>
                            <select id="genero" name="genero">
                               <option value="opcion" disabled selected>Escoga una opción</option>
                               <option value="masculino">Masculino</option>
                               <option value="femenino">Femenino</option>
                            </select>               
                        </div>
                        <div class="col l3  m6 s12">
                            <label>Etnia</label>
                            <select id="etnia" name="etnia">
                               <option value="opcion" disabled selected>Escoga una opción</option>
                               <option value="mestizo">Mestizo</option>
                               <option value="indigena">Indigena</option>
                               <option value="afroecuatoriano">Afroecuatoriano</option>
                               <option value="montubio">Montubio</option>
                            </select>               
                        </div>
                    </div>
                    <div class="row">
                        <div class="col l3  m6 s12">
                            <label>Nivel Socio Económico</label>
                            <select id="nivelsocioeconomico" name="nivelsocioeconomico">
                               <option value="opcion" disabled selected>Escoga una opción</option>
                               <option value="bajo">Bajo</option>
                               <option value="medio">Medio</option>
                               <option value="alto">Alto</option>
                            </select>               
                        </div>

                        <div class="col l3  m6 s12">
                            <label>Nivel Educativo</label>
                            <select id="niveleducativo" name = "niveleducativo">
                               <option value="opcion" disabled selected>Escoga una opción</option>
                               <option value="primaria">Primaria</option>
                               <option value="secundaria">Secundaria</option>
                               <option value="3ernivel">3er Nivel</option>
                               <option value="4tonivel">4to Nivel</option>
                            </select>               
                        </div>

                    </div>
                    <div class="row">
                      <div class="col l12 m12 s12">
                          <a id = "BtnNuevo" class="waves-effect waves-light btn" onclick="n_victima()"><i class="material-icons left small">insert_drive_file</i></a>
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
        <script type="text/javascript" src="js/victima/nueva_victima.js"></script>
        <script type="text/javascript" src="js/victima/validar_guardar_victima.js"></script>
    </body>
</html>