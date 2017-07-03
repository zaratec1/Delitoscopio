<%-- 
    Document   : prueba
    Created on : 29-jun-2017, 9:30:39
    Author     : zaratec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function selectOption(index)
            { 
                document.getElementById("select_id").options.selectedIndex = index;
            }
        </script>
    </head>
    <body>
        <p>
        <select id="select_id">
          <option selected>first option</option>
          <option>second option</option>
          <option>third option</option>
        </select>
        </p>
        <p>
          <button onclick="selectOption(0);">Select first option</button>
          <button onclick="selectOption(1);">Select second option</button>
          <button onclick="selectOption(2);">Select third option</button>
        </p>    
    </body>
</html>
