/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warrior;

/**
 * 
 * @author Kevin Ruzand
 */
public class Alien extends Personnage implements Bataille {
    
    @Override
    public void name() {
        System.out.println("Je suis SEVUA");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en vaisseau !");
    }
    
    @Override
    public void seBattre() {
        System.out.println("Je vous désintègre !!!");
    }

}
