$(document).ready(function ()
{
    $("#BtnNuevo").click(function ()
    {
      $(".error").fadeOut();
      $("#ci_usu").val("");
      $("#ape_nom_usu").val("");
      $("#nic_usu").val("");
      $("#pas_usu").val("");
      $("#con_pas_usu").val("");
      $("#ema_usu").val("");
      $("#ci_usu").focus();
      $("#mensaje").text("");
    });
});
