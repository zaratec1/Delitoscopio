var a = document.querySelectorAll(".eliminar");
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

            if (confirm("Esta seguro que desea eliminar el Usuario con C.I: " + ci_usu.textContent + " ?"))
            {
                var params = {
                        id_usu : id_usu.textContent
                };
                $.get("SvtEliminarUsu", $.param(params), function(responseText)
                {
                    alert(responseText);
                    $('#mensaje').text(responseText);
                    location.reload();
                });
            }
        }
    }
  }

  
  
