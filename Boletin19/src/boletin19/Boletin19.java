
package boletin19;

/**
 *
 * @author JP
 */
public class Boletin19 {

 
    public static void main(String[] args) {
      
        Buzon lista=new Buzon();
        lista.engade(new Correo("eje1",false));
        lista.engade(new Correo("eje2",true));
        lista.engade(new Correo("eje3",false));
        lista.engade(new Correo("eje4",true));
        lista.engade(new Correo("eje5",false));
        lista.engade(new Correo("Ti",true));
        
        
        
        
        lista.numeroDeCorreos();
        lista.porLer();
        lista.amosaPrimerNoLeido();
        lista.amosa(5);
        lista.elimina(3);       
    }
    
}
