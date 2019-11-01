/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylist;

/**
 *
 * @author A7med
 */
public class MyArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.List<String> namelist =new java.util.ArrayList<String>();
        namelist.add("Ahmed");
        namelist.add("Amr");
        namelist.add("mohamed");
        /*namelist.remove(0);
        namelist.remove("Amr");*/
        namelist.set(0, "Ali");
       // namelist.clear();
        System.out.println(namelist);
        System.out.println(namelist.get(0));
    }
    
}
