import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JButton btnJogoFácil;
    private JButton btnJogoMédio;
    private JButton btnJogoDifícil;
    private JButton bntSair;

    public MinesFinder(String title)
    {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);

// Causes this Window to be sized to fit the preferred size and layout of its subcomponents.
        bntSair.addActionListener(this::btnSairActionPerformed);
        btnJogoFácil.addActionListener(this::btnJogoFácilActionPerformed);
        btnJogoMédio.addActionListener(this::btnJogoMédioActionPerformed);
        btnJogoDifícil.addActionListener(this::btnJogoDifícilActionPerformed);
        pack();
    }
    private void btnSairActionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    private void btnJogoFácilActionPerformed(ActionEvent e)
    {
        var janela = new JanelaDeJogo();
        janela.setVisible(true);

    }
    private void btnJogoMédioActionPerformed(ActionEvent e)
    {


    }
    private void btnJogoDifícilActionPerformed(ActionEvent e)
    {


    }
    public static void main(String[] args) {
        new MinesFinder("Mines Finder").setVisible(true);
    }
}
