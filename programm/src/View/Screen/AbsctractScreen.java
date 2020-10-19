package View.Screen;

import javax.swing.*;

public class AbsctractScreen extends JPanel {

    protected JFrame parent;
    protected AbsctractScreen parentScreen;

    public AbsctractScreen(JFrame parent, AbsctractScreen parentScreen) {
        this.parent = parent;
        this.parentScreen = parentScreen;
    }

}
