
package boletin19;

import java.util.ArrayList;

/**
 *
 * @author JP
 */
public class Correo {
private String contenido;
private boolean leido;

    public Correo() {
    }

    public Correo(String contenido, boolean leido) {
        this.contenido = contenido;
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isLeido() {
            
       
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }


}
