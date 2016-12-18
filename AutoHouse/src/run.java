/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import GUI.TelaPrincipal;
import javax.swing.JOptionPane;
/**
 *
 * @author lennon
 */
public class run {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao software que controla sua casa");
        new TelaPrincipal().setVisible(true);
    }
    
}
