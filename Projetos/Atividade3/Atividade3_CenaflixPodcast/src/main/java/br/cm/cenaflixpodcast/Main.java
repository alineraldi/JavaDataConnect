package br.cm.cenaflixpodcast;

import br.cm.cenaflixpodcast.gui.TelaLogin;

/**
 *
 * @author aline
 */
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }
}
