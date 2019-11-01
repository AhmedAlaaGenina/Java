/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex1;

/**
 *
 * @author A7med
 */
public class ArrayEX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner s=new java.util.Scanner(System.in);
        String names [] = new String [5];
        int grades [] = new int [5];
        for(int x=0;x<names.length;x++){
            System.out.println("Enter name of student number "+ String.valueOf(x+1));
            names[x]=s.next();
            System.out .println("Enter the degree of student number "+ String.valueOf(x+1));
            grades[x]=s.nextInt();
        }
        for(int x=0;x<grades.length;x++){
            System.out.println("the name of student is : " + names[x] + " , his grade is : " + grades[x]);
        }
    }
    
}
