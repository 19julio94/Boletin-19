package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *@author jpatriciodasilva
 */
public class Buzon {

    ArrayList<Correo> nCorreos = new ArrayList<Correo>();

    public int numeroDeCorreos() {

        int numCorreos = nCorreos.size();

        JOptionPane.showMessageDialog(null, "Numero de Correos: " + numCorreos);

        return numCorreos;

    }

    public void engade(Correo c) {

        nCorreos.add(c);

    }

    public boolean porLer() {

        int cont = 0;

        for (int i = 0; i < nCorreos.size(); i++) {

            if (nCorreos.get(i).isLeido() == false) {
                cont++;
            }

        }
        if (cont > 0) {

            JOptionPane.showMessageDialog(null, "Hai correos sin leer: "+cont);

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Todos os correos están leidos: ");
            return false;
        }

    }
    public String amosaPrimerNoLeido(){
    String texto="";
    
    for(int i=0;i<nCorreos.size();i++){
    
        if(nCorreos.get(i).isLeido()==false)
        texto= texto+nCorreos.get(i).getContenido();
        i=nCorreos.size();
        
    
    
    
    }
    JOptionPane.showMessageDialog(null, "Primeiro correo non leido: "+texto);
    return texto;
    
    
    } 
    
    public String amosa (int k){
    String texto=nCorreos.get(k).getContenido();
         JOptionPane.showMessageDialog(null, "Contido da mensaxe: "+texto);
    
    
    return texto;
    
    
    }
    
    public void elimina (int k){
    
    nCorreos.remove(k);
    
    JOptionPane.showMessageDialog(null, "Eliminamos o correo da posicion indicada: "+k);
    
    }
}
