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
    
import farmacia.leer.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.math.BigDecimal;

    public class tienda {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         PrintStream out = System.out;
        
        System.out.println("Bienvenido a la Farmacia de Hospital Buena Salud" +"\n"+"\n"+
              "El programa simula una farmacia de hospital "+"\n");
        
    boolean continuar = true;
    boolean Notfound1 = false;
    boolean Notfound2 = false;
    boolean Notfound3 = false;
    boolean Notfound4 = false;
    boolean Notfound5 = false;
    
    int borrar;
    Scanner input = new Scanner(System.in);
   
    List<medicamento> medicamentos =new ArrayList<>();
   
  
    medicamento producto1 = new medicamento("Triludan", 0, false);
    medicamento producto2 = new medicamento("Fortasec", 2, true);
    medicamento producto3 = new medicamento("Clamoxil", 3, true);
    
    medicamentos.add(producto1);
    medicamentos.add(producto2);     
    medicamentos.add(producto3);     
    
    List<pacientes> paciente =new ArrayList<>();
   
  
    pacientes Paciente1 = new pacientes("Ana", 1,"Fortasec", "Clamoxil", "");
    pacientes Paciente2 = new pacientes("Juan", 4,"Clamoxil", "", "");
    pacientes Paciente3 = new pacientes("Maria", 10,"", "", "");
    pacientes Paciente4 = new pacientes("Asier", 12,"Clamoxil", "Fortasec", "");
   
    paciente.add(Paciente1);
    paciente.add(Paciente2);     
    paciente.add(Paciente3);             
    paciente.add(Paciente4);   
   
    
        
      do {
      System.out.println("Introduzca la opción que desea realizar:"+"\n"
                +"1. Mostrar Lista Pacientes Prescritos "+"\n"
                +"2. Mostrar Lista Medicamentos "+"\n"
                +"3. Insertar nuevo Paciente y sus medicamentos"+"\n"
                +"4. Borrar Medicamentos sin prescripcion "+"\n"
                +"5. Borrar Pacientes sin prescripcion "+"\n"
                +"SALIR --> Pulse cualquier otro número"
                );
      switch (leer.datoInt()) {
        case 1:
            out.println(" ");
            out.println("Lista de Pacientes Registrados");
            System.out.println(""+"\n" + paciente);

            break;
        
        case 2:
            out.println(" ");
            out.println("Lista de  medicamentos y prescripciones activas");
            System.out.println(" "+"\n" + medicamentos);
            break;
        
        case 3:
               
            System.out.print("Digite el Nombre del Paciente: ");
            String name =in.readLine();
            System.out.print("Digite numero de identificacion: ");
            int id =Integer.parseInt(in.readLine());
            System.out.print("Digite Medicamento #1 prescrito: ");
            String farmaco1 =in.readLine();
            System.out.print("Digite Medicamento #2 prescrito: ");
            String farmaco2 =in.readLine();
            System.out.print("Digite Medicamento #3 prescrito: ");
            String farmaco3 =in.readLine();
            pacientes AgregarPaciente = new pacientes(name, id,farmaco1, farmaco2, farmaco3);
            paciente.add(AgregarPaciente); 
      
            for (int i = 0; i < medicamentos.size(); i++) {
               if (medicamentos.get(i).getNombre().equals(farmaco1)){
                  int incrementarCant = medicamentos.get(i).getCantPacientes()+1;
                    medicamento AgregarMedicamento1 = new medicamento(farmaco1, incrementarCant, true);
                    medicamentos.set(i, AgregarMedicamento1);
                    Notfound1 = true;
               }
                
               
                if (medicamentos.get(i).getNombre().equals(farmaco2)){
                  int incrementarCant = medicamentos.get(i).getCantPacientes()+1;
                    medicamento AgregarMedicamento2 = new medicamento(farmaco2, incrementarCant, true);
                    medicamentos.set(i, AgregarMedicamento2);
                    Notfound2 = true;
               }
               
                   if (medicamentos.get(i).getNombre().equals(farmaco3)){
                  int incrementarCant = medicamentos.get(i).getCantPacientes()+1;
                    medicamento AgregarMedicamento3 = new medicamento(farmaco3, incrementarCant, true);
                    medicamentos.set(i, AgregarMedicamento3);
                    Notfound3 = true;
               }
               
               }
                if ( Notfound1 == false){
                 medicamento AgregarMedicamento1 = new medicamento(farmaco1, 1, true);
                 medicamentos.add(AgregarMedicamento1);
                 }
                if ( Notfound2 == false){
                 medicamento AgregarMedicamento2 = new medicamento(farmaco2, 1, true);
                 medicamentos.add(AgregarMedicamento2);
                }
                if ( Notfound3 == false){
                 medicamento AgregarMedicamento3 = new medicamento(farmaco3, 1, true);
                 medicamentos.add(AgregarMedicamento3);
                }
        
            out.println("La Impresion de los Pacientes");
            System.out.println("Lista de pacientes medicados: "+"\n" + paciente);
            
          break;
        case 4:
         System.out.println("Lista Medicamentos " + "\n"+ medicamentos);
         System.out.println("Desea Borrar medicamentos sin prescripciones?");
         out.println(" ");
         out.println("1 - Si");
         out.println("2 - No");
         out.println(" ");
         borrar = Integer.parseInt(in.readLine());
         out.println(" ");
         if (borrar == 1 ){
                 out.println("  ");
                 for (int i = 0; i < medicamentos.size(); i++) {
                        if (medicamentos.get(i).getCantPacientes()== 0){
                        System.out.println("Medicamento sin Prescripcion eliminado: " + medicamentos.get(i)); 
                        out.println(" ");
                        medicamentos.remove(i);
                        Notfound4= true;
                            }else {Notfound4 = false;}
                        
                       
                    } //END FOR
                        if(Notfound4 == false){
                            out.println(" ");
                            System.out.println("No se encontraron mas medicamentos sin prescripcion"); 
                            out.println(" ");
                       }
             
             
         }else
         {
                    out.println(" ");
                         System.out.println("No se eliminaron medicamentos "); 
                         out.println(" ");
         }
          break;    
      
         case 5:
         System.out.println("Lista Pacientes " + "\n"+ paciente);
         System.out.println("Desea Borrar Pacientes sin receta medica?");
         out.println(" ");
         out.println("1 - Si");
         out.println("2 - No");
         out.println(" ");
         borrar = Integer.parseInt(in.readLine());
         out.println(" ");
         if (borrar == 1 ){
                 out.println("  ");
                 for (int i = 0; i < paciente.size(); i++) {
                        if (paciente.get(i).getfarmaco1()=="" ){
                            if (paciente.get(i).getfarmaco2()=="" ){
                                if (paciente.get(i).getfarmaco2()=="" ){
                                    System.out.println("Paciente sin Prescripcion eliminado: " + paciente.get(i));
                                    out.println(" ");
                                    paciente.remove(i);
                                    Notfound5= true;
                                }
                                
                            } 
                       
                            }
                    } //END FOR
             
                        if(Notfound5 == false){
                         out.println(" ");
                         System.out.println("No se encontraron mas pacientes sin prescripcion"); 
                         out.println(" ");
                        }
             
         }else
         {
                    out.println(" ");
                         System.out.println("No se eliminaron Pacientes "); 
                         out.println(" ");
         }
          break;
        default:
          //Se sale del programa
          continuar=false;
      }
      
    } while(continuar);
    
    System.out.println("---- Gracias por usar la aplicación. ----");

  }       
        
        
  }
    

