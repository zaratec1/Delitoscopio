$(document).ready(function ()
{
    $("#BtnLogin").click(function ()
    {
      if( $("#nic_usu").val() == "" )
      {
        $("#e_nic_usu").fadeOut();
        $("#l_nic_usu").focus().after("<span id='e_nic_usu' class='error'>Ingrese su nombre de usuario</span>");
        return false;
      }

      if( $("#pas_usu").val() == "" )
      {
        $("#e_pas_usu").fadeOut();
        $("#l_pas_usu").focus().after("<span id='e_pas_usu' class='error'>Ingrese su contraseña</span>");
        return false;
      }

        var params = {
                nic_usu : $("#nic_usu").val(),
                pas_usu : $("#pas_usu").val()
        };
        $.get("SvtIniciarSesion", $.param(params), function(responseText)
        {
            var pos = responseText.indexOf("?");
            var error = responseText.substring(0, pos);
            var par = responseText.substring(pos+1, responseText.length);
            
            if (error == "Correcto")
            {
                location.href = "Principal.html?"+par;
            }
            else
            {
                if (error == "sin usuarios")
                {
                    location.href = "nuevousuario.jsp";
                }
                else
                {
                    $('#mensaje').text(responseText);
                }
            }
        });
    });


    $("#nic_usu").keyup(function(){
        if( $("#nic_usu").val() != "" )
        {
            $("#e_nic_usu").fadeOut();
            $('#mensaje').text("");
        }
    });

    $("#pas_usu").keyup(function(){
        if( $("#pas_usu").val() != "" )
        {
            $("#e_pas_usu").fadeOut();
            $('#mensaje').text("");
        }
    });
  });
