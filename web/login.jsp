<%-- 
    Document   : login
    Created on : 17/09/2013, 08:01:45
    Author     : 0724114
--%>
<section class="login">
    <FORM METHOD="POST" ACTION="trataLoginServlet">
        <P> Por favor, forneça as informações abaixo solicitadas </P>
        <table> 
            <TR> <TD> Login : </TD> <TD> <INPUT TYPE=TEXT SIZE=30 NAME = "Login"> </TD> </TR> 
            <TR> <TD> Senha : </TD> <TD> <INPUT TYPE = PASSWORD NAME = "Senha"> </TD> </TR>
        </TABLE>
        <input type="hidden" name="servlet" value="login">
        <P>
            <INPUT TYPE=SUBMIT VALUE="Autenticar"> 
            <INPUT TYPE=RESET VALUE="Limpar"> 
        </p>
    </FORM>
    <FORM METHOD="POST" ACTION="trataCadastroServlet">
        <input type="hidden" name="servlet" value="cadastraUsuario">
        <P>
            <INPUT TYPE=SUBMIT VALUE="Cadastrar">  
        </p>
    </FORM>
</section>
        
 