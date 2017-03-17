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
public class Medecin extends Personnage implements Hopital{
    
    @Override
    public void name() {
        System.out.println("Je suis le DR HOUSE");
    }
    
    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en ambulance !");
    }
    
    @Override
    public void soigner() {
        System.out.println("Je peux soigner les blessures des autres !");
    }

}
