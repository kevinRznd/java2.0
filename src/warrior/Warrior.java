/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warrior;
import java.util.*;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Warrior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
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
        
        int choix;
        
        do{
            
            System.out.println( "Afficher un warrior :        \n"
                    +           "1  Guerrier            \n"
                    +           "2  Demon               \n"
                    +           "3  Alien               \n"
                    +           "4  Soldat              \n"
                    +           "5  Medecin             \n"
                    +           "6  Quitter             ");      

           choix = scan.nextInt();
           scan.nextLine();
                
            switch(choix) {
                
                case 1:
                    System.out.println("***********************************");
                    g.name();
                    g.seDeplacer();
                    bg.seBattre();
                    System.out.println("***********************************");
                break;
                case 2:
                    System.out.println("***********************************");
                    d.name();
                    d.seDeplacer();
                    bd.seBattre();
                    System.out.println("***********************************");
                break;
                case 3:
                    System.out.println("***********************************");
                    a.name();
                    a.seDeplacer();
                    ba.seBattre();
                    System.out.println("***********************************");
                break;
                case 4:
                    System.out.println("***********************************");
                    s.name();
                    s.seDeplacer();
                    bs.seBattre();
                    System.out.println("***********************************");
                break;
                case 5:
                    System.out.println("***********************************");
                    m.name();
                    m.seDeplacer();
                    hm.soigner();
                    System.out.println("***********************************");
                break;
                
                default : System.out.println("Option incorrecte !");
            }
        
        } while (choix != 6);
        
    }
    
}
