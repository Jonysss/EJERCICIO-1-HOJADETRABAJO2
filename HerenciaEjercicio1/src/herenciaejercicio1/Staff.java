/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejercicio1;

/**
 *
 * @author Usuario
 */
//SUBCLASE
public class Staff extends Person{
 //VARIABLES DE INSTACIA   
 private String school;
 private String play;
  //CONSTRUCTOR SUPERCLASE
 public Staff (String name, String address){
    super(name,address);
  
 
    }
//CONSTRUCTOR SUBLCLASE
    public Staff(String school, String play, String name, String address) {
        super(name, address);
        this.school = school;
        this.play = play;
    }
//METODOS
    public String getSchool() {
        return school;
    }

    public String getPlay() {
        return play;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPlay(String play) {
        this.play = play;
    }
 
    public void ImprimirDatos () {
            System.out.println("Name: "+ getName()+
                    "\nAddress: "+ getAddress()+
                    "\nSchool: "+ getSchool()+
                    "\nPlay: "+ getPlay());
}
}

