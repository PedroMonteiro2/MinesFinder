
import javax.swing.*;

public class JanelaDeJogo extends JFrame {
    private JPanel painelJogo; // painel do jogo. O nome é definido no modo Design, em "field name"
    public JanelaDeJogo() {
        setContentPane(painelJogo);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true); // opcional. Pode optar por fazer depois.
    }
}