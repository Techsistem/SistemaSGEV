package com.sgev.service;

import com.sgev.dao.UsuarioDAO;
import com.sgev.model.Usuario;

public class AutenticacaoService {

    private UsuarioDAO usuarioDAO;

    public AutenticacaoService() {
        this.usuarioDAO = new UsuarioDAO();
    }

    /**
     * Valida as credenciais no banco de dados.
     * @param login O login digitado na tela.
     * @param senha A senha digitada na tela.
     * @return O objeto Usuario se autenticado, ou null se falhar.
     */
    public Usuario autenticar(String login, String senha) {
        // Chama o DAO para realizar a consulta que já vimos funcionar no seu log
        Usuario usuario = usuarioDAO.validarLogin(login, senha);
        
        if (usuario != null) {
            System.out.println("SUCESSO: Usuário " + usuario.getNome() + " autenticado via Service.");
            return usuario;
        } else {
            System.out.println("FALHA: Credenciais inválidas para o login: " + login);
            return null;
        }
    }
}