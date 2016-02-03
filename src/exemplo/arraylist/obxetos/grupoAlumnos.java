
package exemplo.arraylist.obxetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class grupoAlumnos {

ArrayList<Alumno>lista=new ArrayList<Alumno>();
public void crearLista(){

Alumno alum1 = new Alumno("Sara",6);
Alumno alum2 = new Alumno("bb",2);
Alumno alum3 = new Alumno("cc",3);
Alumno alum4 = new Alumno("bb",2);

lista.add(alum1);
lista.add(alum2);
lista.add(alum3);
lista.add(alum4);
//alum1=alum3;
//lista.add(alum1);







}
public void engadirAlumno(Alumno al){
    
lista.add(al);

}

public void verLista(){
JOptionPane.showMessageDialog(null,lista);



}

public void verIgual(){
if(lista.get(1).equals(lista.get(3)))
    JOptionPane.showMessageDialog(null, "--Son distintos--");

else
    JOptionPane.showMessageDialog(null, "--Son iguais--");

    JOptionPane.showMessageDialog(null, "Alumno1:"+lista.get(1).hashCode()+"\nAlumno2:"+lista.get(3).hashCode());
    JOptionPane.showMessageDialog(null, "Alumno1:"+lista.get(2).hashCode()+"\nAlumno2:"+lista.get(4).hashCode());
}
    
}

