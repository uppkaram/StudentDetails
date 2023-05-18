/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

/**
 *
 * @author uppal
 */
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] List = new Student[2];
         Student S1 = new Student();
        S1.setName("peter");
        S1.setAge(27);
        Student S2 =new Student();
        S2.setName("Karam");
        S2.setAge(22);
        List[0] = S1;
        List[1] = S2;
        
        System.out.println (List[0].getName()+ "") + List[0].getAge());
        // TODO code application logic here
    }
    
}

