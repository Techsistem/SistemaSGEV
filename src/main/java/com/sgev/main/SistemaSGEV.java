package com.sgev.main;

import com.sgev.view.telaLogin;

public class SistemaSGEV {

    public static void main(String[] args) {
        // Remove os logs de teste do terminal e inicia a interface
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                telaLogin login = new telaLogin();
                login.setLocationRelativeTo(null); // Centraliza na tela
                login.setVisible(true); // Faz a tela aparecer
            }
        });
    }
}