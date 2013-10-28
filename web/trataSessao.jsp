<%-- 
    Document   : trataSessao
    Created on : 01/10/2013, 09:22:56
    Author     : 0724114
--%>


<%@page import="modelo.FL_Usuario"%>


        <%
            FL_Usuario usuario = (FL_Usuario) session.getAttribute("identifica");
            if (usuario == null) {
                %>
                    <%@include file="login.jsp" %>
                <%
                //response.sendRedirect("login.jsp");
                
            } 
        
        %>
 

 