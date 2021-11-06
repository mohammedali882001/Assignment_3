/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_program_2;

/**
 *
 * @author messi
 */
public class Assignment_3_program_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Mammal m=new Mammal(30, "nuts");
        m.eat();
        m.travel();
        System.out.println(m.get_favorite_food());
        System.out.println(m.get_num_of_legs_of_mammal());
    }
    
}
