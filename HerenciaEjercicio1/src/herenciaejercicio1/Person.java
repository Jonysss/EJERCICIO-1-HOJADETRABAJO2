/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejercicio1;

/**
 *
 * @author Usuario
 */
//SUPERCLASE
public class Person {
    //VARIABLES DE INSTANCIA
    private String name;
    private String address;
//CONSTUCTOR 
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
//METODOSj
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
   
     public void ImprimirDatos () {
            System.out.println("Name: "+ getName()+
                    "\nAddress: "+ getAddress());
} 
    
}
