package View.Styles;

import javax.swing.*;

/**
 * Reseta o model padrao do botao.
 *
 * @author Rodrigo Andrade
 */
public class ResetButtonModel extends DefaultButtonModel {
    @Override
    public boolean isPressed() {
        return false;
    }

    @Override
    public boolean isRollover() {
        return false;
    }

    @Override
    public void setRollover(boolean b) {
        //NOOP
    }
}
