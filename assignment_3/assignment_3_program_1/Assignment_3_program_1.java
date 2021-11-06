/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_program_1;

/**
 *
 * @author messi
 */
public class Assignment_3_program_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Ball b=new Ball(" mmm ");
       b.bounce();
       System.out.println(b.getBrandName());
       b.toss();
       
       Rock r = new Rock();
       r.toss();
       
       Baseball bbbb=new Baseball("dddd ");
       bbbb.bounce();
        System.out.println(bbbb.getBrandName());
        bbbb.toss();
        
        Football f = new Football(" ffff ");
        f.bounce();
        f.toss();
        
               
    }
    
}
