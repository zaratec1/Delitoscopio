$(document).ready(function ()
{
    var emailformato = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
    $("#BtnGuardar").click(function ()
    {
      if( $("#ci_usu").val() == "" )
      {
        $("#e_ci_usu").fadeOut();
        $("#l_ci_usu").focus().after("<span id='e_ci_usu' class='error'>Ingrese su número de cédula</span>");
        return false;
      }

      if( $("#ape_nom_usu").val() == "" )
      {
        $("#e_ape_nom_usu").fadeOut();
        $("#l_ape_nom_usu").focus().after("<span id='e_ape_nom_usu' class='error'>Ingrese sus nombres y apellidos</span>");
        return false;
      }

      if( $("#nic_usu").val() == "" )
      {
        $("#e_nic_usu").fadeOut();
        $("#l_nic_usu").focus().after("<span id='e_nic_usu' class='error'>Ingrese su usuario</span>");
        return false;
      }

      if( $("#pas_usu").val() == "" )
      {
        $("#e_pas_usu").fadeOut();
        $("#l_pas_usu").focus().after("<span id='e_pas_usu' class='error'>Ingrese su contraseña</span>");
        return false;
      }

      if( $("#con_pas_usu").val() == "" )
      {
        $("#e_con_pas_usu").fadeOut();
        $("#l_con_pas_usu").focus().after("<span id='e_con_pas_usu' class='error'>Confirme la contraseña</span>");
        return false;
      }

      if( $("#con_pas_usu").val() != $("#pas_usu").val())
      {
        $("#e_con_pas_usu").fadeOut();
        $("#l_con_pas_usu").focus().after("<span id='e_con_pas_usu' class='error'>Las contraseñas no coinciden</span>");
        return false;
      }

      if( $("#ema_usu").val() == "")
      {
        $("#e_ema_usu").fadeOut();
        $("#l_ema_usu").focus().after("<span id='e_ema_usu' class='error'>Ingrese su e-mail</span>");
        return false;
      }

      if (!emailformato.test($("#ema_usu").val()) )
      {
        $("#e_ema_usu").fadeOut();
        $("#l_ema_usu").focus().after("<span id='e_ema_usu' class='error'>El e-mail no tiene el formato correcto</span>");
        return false;
      }
      else
      {
          $("#e_ema_usu").fadeOut();
      }
      
        var params = {
                ci_usu : $("#ci_usu").val(),
                ape_nom_usu : $("#ape_nom_usu").val(),
                nic_usu : $("#nic_usu").val(),
                pas_usu : $("#pas_usu").val(),
                con_pas_usu: $("#con_pas_usu").val(),
                ema_usu : $("#ema_usu").val()
        };
        $.get("SvtGuardarUsu", $.param(params), function(responseText)
        {
            if (responseText == "Guardado correctamente")
            {
                alert("Usuario registrado correctamente");
                $(".error").fadeOut();
                $("#ci_usu").val("");
                $("#ape_nom_usu").val("");
                $("#nic_usu").val("");
                $("#pas_usu").val("");
                $("#con_pas_usu").val("");
                $("#ema_usu").val("");
                $("#ci_usu").focus();
                $("#mensaje").text("");
            }
            else
            {
                $('#mensaje').text(responseText);
            }
        });
    });


    $("#ci_usu").keyup(function(){
        if( $("#ci_usu").val() != "" )
        {
            $("#e_ci_usu").fadeOut();
        }
    });

    $("#ape_nom_usu").keyup(function(){
        if( $("#ape_nom_usu").val() != "" )
        {
            $("#e_ape_nom_usu").fadeOut();
        }
    });

    $("#nic_usu").keyup(function(){
        if( $("#nic_usu").val() != "" )
        {
            $("#e_nic_usu").fadeOut();
        }
    });

    $("#pas_usu").keyup(function(){
        if( $("#pas_usu").val() != "" )
        {
            $("#e_pas_usu").fadeOut();
        }
    });

    $("#con_pas_usu").keyup(function(){
        if( $("#con_pas_usu").val() != "" )
        {
            $("#e_con_pas_usu").fadeOut();
        }
    });

    $("#ema_usu").keyup(function(){
        if( $("#ema_usu").val() != "" )
        {
            $("#e_ema_usu").fadeOut();
        }
    });

  });
