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
public class Warrior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guerrier g = new Guerrier();
        Bataille bg = new Guerrier();
        
        Demon d = new Demon();
        Bataille bd = new Demon();
        
        Alien a = new Alien();
        Bataille ba = new Alien();
        
        Soldat s = new Soldat();
        Bataille bs = new Soldat();
        
        Medecin m = new Medecin();
        Hopital hm = new Medecin();
        
        g.name();
        g.seDeplacer();
        bg.seBattre();
        
        System.out.println("*********************************************");
        
        d.name();
        d.seDeplacer();
        bd.seBattre();
        
        System.out.println("*********************************************");
        
        a.name();
        a.seDeplacer();
        ba.seBattre();
        
        System.out.println("*********************************************");
        
        s.name();
        s.seDeplacer();
        bs.seBattre();
        
        System.out.println("*********************************************");
        
        m.name();
        m.seDeplacer();
        hm.soigner();
        
    }
    
}
