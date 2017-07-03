var a = document.querySelectorAll(".nuevo");
for(var b in a)
  { //Como nos devuelve un array iteramos
    var c = a[b];
    if(typeof c == "object")
    { //Solo buscamos los objetos
       c.onclick = function ()
       { //Asignamos un evento onclick
           location.href="nuevavictima.jsp";
       }
    }
  }

  
  
