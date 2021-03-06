$(document).ready(function ()
{
    var emailformato = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
    $("#BtnGuardar").click(function ()
    {
        if( $("#ci_pas_vic").val() == "" )
        {
          $("#e_ci_pas_vic").fadeOut();
          $("#l_ci_pas_vic").focus().after("<span id='e_ci_pas_vic' class='error'>Ingrese un número de identificación de identidad</span>");
          return false;
        }

        if( $("#ape_vic").val() == "" )
        {
          $("#e_ape_vic").fadeOut();
          $("#l_ape_vic").focus().after("<span id='e_ape_vic' class='error'>Ingrese sus Apellidos</span>");
          return false;
        }

        if( $("#nom_vic").val() == "" )
        {
          $("#e_nom_vic").fadeOut();
          $("#l_nom_vic").focus().after("<span id='e_nom_vic' class='error'>Ingrese sus Nombres</span>");
          return false;
        }

        if( $("#eda_vic").val() == "" )
        {
          $("#e_eda_vic").fadeOut();
          $("#l_eda_vic").focus().after("<span id='e_eda_vic' class='error'>Ingrese su edad</span>");
          return false;
        }

        if( $("#ema_vic").val() != "")
        {
          if (!emailformato.test($("#ema_vic").val()) )
          {
            $("#e_ema_vic").fadeOut();
            $("#l_ema_vic").focus().after("<span id='e_ema_vic' class='error'>El e-mail no tiene el formato correcto</span>");
            return false;
          }
          else
          {
              $("#e_ema_vic").fadeOut();
          }
        }

        if(document.getElementById("genero").value == "opcion" )
        {
          alert("Escoga el Género");
          return false;
        }

        if(document.getElementById("etnia").value == "opcion" )
        {
          alert("Escoga la Etnia");
          return false;
        }

        if(document.getElementById("nivelsocioeconomico").value == "opcion" )
        {
          alert("Escoga el Nivel Socio Económico");
          return false;
        }

        if(document.getElementById("niveleducativo").value == "opcion" )
        {
          alert("Escoga el Nivel Educativo");
          return false;
        }
        if ($("#cedula").is(':checked'))
        {
            var doc_vic = 0;
        }
      
        if ($("#pasaporte").is(':checked'))
        {
            var doc_vic = 1;
        }
      
        var params = {
                id_vic : $("#id_vic").val(),
                doc_vic : doc_vic.textContent,
                ci_pas_vic : $("#ci_pas_vic").val(),
                ape_vic : $("#ape_vic").val(),
                nom_vic : $("#nom_vic").val(),
                eda_vic : $("#eda_vic").val(),
                ema_vic : $("#ema_vic").val(),
                gen_vic: document.getElementById("genero").value,
                etn_vic: document.getElementById("etnia").value,
                niv_eco_vic: document.getElementById("nivelsocioeconomico").value,
                niv_edu_vic: document.getElementById("niveleducativo").value,
        };
        $.get("SvtEditarVic", $.param(params), function(responseText)
        {
            if (responseText == "Guardado correctamente")
            {
                alert("Actualizado correctamente");
                location.reload();
            }
            else
            {
                $('#mensaje').text(responseText);
            }
        });
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
