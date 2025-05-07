/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
package modelo;

public class materias {

    private Integer Id;
    private String Nombre;
    private Integer Grado;

    public materias(Integer Id, String Nombre, int Grado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Grado = Grado;
    }

    public materias() {
        this.Id = null;
        this.Nombre = null;
        this.Grado = null;

    }

    public materias(int id, int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }
    

    @Override
    public String toString() {
        return "Materias{" + "Id=" + Id + ", Nombre=" + Nombre+ ", Grado=" + Grado + '}';
    }

    

}
