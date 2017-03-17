/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warrior;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Soldat extends Personnage implements Bataille {
    
    @Override
    public void name() {
        System.out.println("Je m'appel SMITH");
    }
    
    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en char d'assaut !");
    }
    
    @Override
    public void seBattre() {
        System.out.println("Je combat avec mon fusil d'assaut et mon char");
    }

}
