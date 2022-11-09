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

  public class pacientes {
  private String nombre;
  private int IDPacientes;
  public static int dimesionArray;
  private String farmaco1;
  private String farmaco2;
  private String farmaco3;
  
  public pacientes() { }
  public pacientes(String nombre,  int IDPacientes, String farmaco1, String farmaco2, String farmaco3) {
    this.nombre   = nombre;
    this.IDPacientes  = IDPacientes;
    this.farmaco1 = farmaco1;
    this.farmaco2 = farmaco2;
    this.farmaco3 = farmaco3;
      
    dimesionArray++;//  Se obtiene con esta variable la dimensión del array. Según número de instancias del constructor
  }
  
  //Methods
  @Override
  public String toString() {
    return   "\n" + "Nombre: "      +this.getNombre()+    "\n"+
            "Numero Identificacion: "    +this.getIDPacientes()+ "\n"+
            "Prescripcion: "    +this.getfarmaco1()+ "\n" 
            +this.getfarmaco2()+ "\n"
            +this.getfarmaco3()+ "\n";
  }
  
  //Get and Set
  public String getNombre() {
    return this.nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

   public int getIDPacientes() {
    return this.IDPacientes;
  }
  public void setIDPacientes(int cantStock) {
    this.IDPacientes = IDPacientes;
  }

    public String getfarmaco1() {
    return this.farmaco1;
  }
  public void setfarmaco1(String farmaco1) {
    this.farmaco1 = farmaco1;
  }
   public String getfarmaco2() {
    return this.farmaco2;
  }
  public void setfarmaco2(String farmaco2) {
    this.farmaco2 = farmaco2;
  } public String getfarmaco3() {
    return this.farmaco3;
  }
  public void setfarmaco3(String farmaco3) {
    this.farmaco3 = farmaco3;
  }
  
  }


