var a = document.querySelectorAll(".editar");
for(var b in a)
  { //Como nos devuelve un array iteramos
    var c = a[b];
    if(typeof c == "object")
    { //Solo buscamos los objetos
       c.onclick = function ()
       { //Asignamos un evento onclick
         var td = this.offsetParent; //Localizamos el TD
         var tr = td.parentElement;  //LLegamos hasta el TR
         var id_usu = tr.children[0];
         var ci_usu = tr.children[1];
         var ape_nom_usu = tr.children[2];
         var nic_usu = tr.children[3];
         var pas_usu = tr.children[4];
         var ema_usu = tr.children[5];
         $.post(
                "editarusuario.jsp",
                {id_usu:id_usu.textContent, ci_usu:ci_usu.textContent, ape_nom_usu:ape_nom_usu.textContent, nic_usu:nic_usu.textContent, pas_usu:pas_usu.textContent, ema_usu:ema_usu.textContent},
                function (data)
                {
                    $("#editarusuario").html(data);
                });
        }
    }
  }
  
  
