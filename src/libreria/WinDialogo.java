/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import javax.swing.JOptionPane;

/**
 *
 * @author aperezcesar
 */
class WinDialogo extends IO implements MetodosComunes {

    @Override
    public void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
