package Tarea5;
public abstract class Empleado {
    
    private int numEmp;
    private String nombre;
    private String puesto;
    private float salario;
    
    
    
    public abstract float calcularISR();

    /**
     * @return the numEmp
     */
    public int getNumEmp() {
        return numEmp;
    }

    /**
     * @param numEmp the numEmp to set
     */
    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
