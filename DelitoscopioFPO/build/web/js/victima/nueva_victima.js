$(document).ready(function ()
{
    $("#BtnNuevo").click(function ()
    {
        $(".error").fadeOut();
        document.querySelector('input[name=documento][value=cedula]').checked = true;
        $("#ci_pas_vic").val("");
        $("#ape_vic").val("");
        $("#nom_vic").val("");
        $("#eda_vic").val("");
        $("#ema_vic").val("");
        $("#genero").val("opcion");
        $("#etnia").val("opcion");
        $("#nivelsocioeconomico").val("opcion");
        $("#niveleducativo").val("opcion");
        $('select').material_select();
        $("#ci_pas_vic").focus();
        $("#mensaje").text("");
    });
});