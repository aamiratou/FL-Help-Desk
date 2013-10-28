/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usr14
 */
public class Processador {

    private static final HashMap comandos = new HashMap();

    static {
        comandos.put("0", "view.InterfaceSair");
        comandos.put("1", "view.InterfaceLogin");
        comandos.put("2", "view.InterfaceInserirUsuario");
        comandos.put("3", "view.InterfaceExcluirUsuario");
        comandos.put("4", "view.InterfaceEditarUsuario");
        comandos.put("5", "view.InterfacePesquisarUsuario");
        comandos.put("6", "view.InterfaceInserirDisco");
        comandos.put("7", "view.InterfaceExcluirDisco");
        comandos.put("8", "view.InterfaceEditarDisco");
        comandos.put("9", "view.InterfacePesquisarDisco");


        comandos.put("menu1", "view.InterfaceOpcoesTipo1");
        comandos.put("menu2", "view.InterfaceOpcoesTipo2");
        comandos.put("principal", "view.InterfacePrincipal");

    }

    /**
     *
     * @param cmd
     */
    public static void direcionar(String cmd) {
        String actionClass = (String) comandos.get(cmd);
        //Cria a instância da classe utilizando introspecção
        try {
            Class classe = Class.forName(actionClass);
            Comando comando = (Comando) classe.newInstance();
            comando.executar();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (InstantiationException iex) {
            System.out.println(iex);
        } catch (IllegalAccessException iaex) {
            System.out.println(iaex);
        }

    }
}
