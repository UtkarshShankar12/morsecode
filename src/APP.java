import javax.swing.*;

public class APP {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MorseCodeTranslatorGUI().setVisible(true);
            }
        });
    }
}
