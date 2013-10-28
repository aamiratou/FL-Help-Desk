/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.FL_Usuario;
import modelo.FL_UsuarioDAO;

/**
 *
 * @author 0724114
 */
public class TrataListagemUsuariosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession(false);
        FL_Usuario value = (FL_Usuario) session.getAttribute("identifica");
        if(value != null){       
            try {
                ArrayList lista = new FL_UsuarioDAO().pesquisar();
 
                /* TODO output your page here. You may use following sample code. */
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet TrataListagemUsuariosServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet TrataListagemUsuariosServlet at " + request.getContextPath() + "</h1>");
                out.println("<p>" +value.getNome() + " esta é a listagem de usuários");
                out.println("<table>");
                Iterator it = lista.iterator();
                while (it.hasNext()){
                    FL_Usuario user = (FL_Usuario) it.next();
                    
                    out.println("<TR>");
                    out.println("<TD>Login: "+user.getLogin()+"</TD>");
                    out.println("<TD>Senha: "+user.getSenha()+"</TD>");
                    out.println("<TD>E-mail: "+user.getEmail()+"</TD>");
                    out.println("</TR>");
                }
                out.println("</table>");
                out.println("<P><a href='index.jsp'> Voltar</a></P>");
                out.println("</body>");
                out.println("</html>");
            }catch(SQLException ex){
            throw new ServletException(ex);
            }catch (ClassNotFoundException cnfe) {
            throw new ServletException(cnfe);
            }
        }else{
            out.println("Você deve se autenticar para ver a listagem");
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.include(request, response);
        }          
         out.close();
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
