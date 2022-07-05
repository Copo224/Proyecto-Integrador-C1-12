/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodelsistema;

/**
 *
 * @author Usuario
 */
public class Datos {
   
    String nombreMedicina;
    int hora;
    int minutos;
    String Descripcion;
   

    public String getDescrpcion() {
        return Descripcion;
    }

    public void setDescrpcion(String Descrpcion) {
        this.Descripcion = Descrpcion;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
   

    public String getNombreMedicina() {
        return nombreMedicina;
    }

    public void setNombreMedicina(String nombreMedicina) {
        this.nombreMedicina = nombreMedicina;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    
    
}

