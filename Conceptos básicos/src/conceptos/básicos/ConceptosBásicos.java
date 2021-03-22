/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.básicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class ConceptosBásicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubmarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        Automovil miAkura = new Automovil();
        miAkura.setMarca("NSX");
        miAkura.setSubmarca("Akura");
        miAkura.setModelo(2013);
        miAkura.setColor(Color.gray);
        System.out.println(miAkura);
        
        Automovil miMustan = new Automovil();
        miMustan.setMarca("Ford");
        miMustan.setSubmarca("Mustan");
        miMustan.setModelo(2010);
        miMustan.setColor(Color.yellow);
        System.out.println(miMustan);
        
    }
    
}
