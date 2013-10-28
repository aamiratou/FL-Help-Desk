/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.FL_Usuario;
import modelo.FL_UsuarioDAO;

/**
 *
 * @author usr14
 */
public class TrataCadastoUsuarioServlet extends HttpServlet {

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

        String email = request.getParameter("Email");
        String login = request.getParameter("Login");
        String senha = request.getParameter("Senha");
        String nome = request.getParameter("Nome");
        int cat_usu = 1;
        int cli_id = 1;
        int usu_id = 1;
        FL_Usuario user = new FL_Usuario(usu_id,login,senha,email,nome,cat_usu,cli_id);

        PrintWriter out = response.getWriter();
        try {

            FL_UsuarioDAO dao = new FL_UsuarioDAO();
            dao.inserir(user);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cadastraUsuarioServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Parabéns ! Usuário Cadastrado com Sucesso" + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch(SQLException ex){
            throw new ServletException(ex);
        }catch (ClassNotFoundException cnfe) {
            throw new ServletException(cnfe);
        } finally {
            out.close();
        }
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
