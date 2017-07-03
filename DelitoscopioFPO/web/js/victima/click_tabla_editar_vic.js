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
         var id_vic = tr.children[0];
         $.post(
                "editarvictima.jsp",
                {id_vic:id_vic.textContent},
                function (data)
                {
                    $("#editarvictima").html(data);
                });
        }
    }
  }
  
  
