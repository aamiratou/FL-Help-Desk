<%-- 
    Document   : calendario
    Created on : 01/10/2013, 08:40:06
    Author     : 0724114
--%>

<%@page import="java.util.*" %>
<%@page import="java.text.*" %>
<p>Hoje é <%= DateFormat.getDateInstance().format(new Date()) %></p>
