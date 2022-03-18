/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejercicio1;

/**
 *
 * @author Usuario
 */
public class HerenciaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //CLASE PRINCIPAL DEL METODO MAIN
      Person person = new Person("Jonathan Osvaldo","Sequen Iquite"); 
      person.ImprimirDatos();
      
      
      
      Student student = new Student("Programacion 1",31,212.2,"Jonathan","Sequen"); 
      student.ImprimirDatos();
    
      
      Staff staff = new Staff("Universidad Mariano","Soccer","Jonathan","Sequen");
      //String school, String play, String name, String address
      staff.ImprimirDatos();
    }
    
}
