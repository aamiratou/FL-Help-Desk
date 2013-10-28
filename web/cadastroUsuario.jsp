<%-- 
    Document   : cadastroUsuario
    Created on : 27/08/2013, 08:31:07
    Author     : Karen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="trataSessao.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minha Discoteca na Web</title>
    </head>
    <BODY>
        <H1> CADASTRO DE USUÁRIO </H1>
        <FORM METHOD="GET" ACTION='FrontController'>
            <P> Por favor, forneça as informações abaixo solicitadas </P>
            <TABLE>
                <TR> <TD> Nome : </TD> <TD> <INPUT TYPE=TEXT SIZE=50 NAME = "Nome"> </TD> </TR> 
                <TR> <TD> Login : </TD> <TD> <INPUT TYPE=TEXT SIZE=30 NAME = "Login"> </TD> </TR> 
                <TR> <TD> Senha : </TD> <TD> <INPUT TYPE = PASSWORD NAME = "Senha"> </TD> </TR>
                <TR> <TD> CPF : </TD> <TD> <INPUT TYPE=TEXT SIZE=50 NAME = "Cpf"> </TD> </TR> 
            </TABLE>
            <input type="hidden" name="servlet" value="cadastraUsuario">
            
            <P><INPUT TYPE=SUBMIT VALUE="CADASTRAR"> 
                <INPUT TYPE=RESET VALUE="LIMPAR"> 
            </p>
        </FORM>
    </body>
</html>
