/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author lennon
 */
public class Exceptions {
    public boolean apenasTexto(String texto){
        return texto.matches("[^\\d]+");
    }
}
