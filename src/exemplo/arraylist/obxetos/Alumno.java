
package exemplo.arraylist.obxetos;

import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author jpatriciodasilva
 */
public class Alumno {
private String nome;
private int notas;

    public Alumno() {
    }  

    public Alumno(String nome, int notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "grupoAlumnos{" + "nome=" + nome + ", notas=" + notas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + this.notas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return true;
    }
   
    public int compareTo(Object o){
    Alumno obx = (Alumno)o;
    
   if(this.nome.compareToIgnoreCase(obx.nome)==0)
   return 0;
   
   else if(this.nome.compareToIgnoreCase(obx.nome)>0)
   return 1;
   else 
       return -1;
   
   
      
    
    
    
    
    }
    
    
}
