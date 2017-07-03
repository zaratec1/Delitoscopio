$(document).ready(function ()
{
    var params = {
            nic_usu : $("#nic_usu").val(),
            pas_usu : $("#pas_usu").val()
    };
    $.get("SvtIniciarSesion", $.param(params), function(responseText)
    {
        if (responseText == "sin usuarios")
        {
//                $('#mensaje').text(responseText);
            alert("No se han registrado usuarios en el sistema");
            setTimeout("location.href='nuevousuario.jsp'", 2000);             
        }
        else
        {
          $("#nic_usu").focus();
        }
    });
  });
