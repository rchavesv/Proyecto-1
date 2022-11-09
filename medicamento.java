/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author ronc
 */
  public  class medicamento {
  private String nombre;
  private int cantPacientes;
  private boolean disponible = false;
  public static int dimesionArray;
  
  
  public medicamento() { }
  public medicamento(String nombre,  int cantPacientes, boolean disponible) {
    this.nombre   = nombre;
    this.cantPacientes  = cantPacientes;
    this.disponible = disponible;
    
    dimesionArray++;//  Se obtiene con esta variable la dimensión del array. Según número de instancias del constructor
  }
  
  //Methods
  @Override
  public String toString() {
    return   "\n" + "Nombre: "      +this.getNombre()+    "\n"+
        "Numero Pacientes Prescritos: "    +this.getCantPacientes()+ "\n";
  }
  
  //Get and Set
  public String getNombre() {
    return this.nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

   public int getCantPacientes() {
    return this.cantPacientes;
  }
  public void setCantPacientes(int cantStock) {
    this.cantPacientes = cantPacientes;
  }
  public boolean isDisponible() {
    if(getCantPacientes()>0) this.disponible = true;
    return this.disponible;
  }
  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

}
 
    
    
    

