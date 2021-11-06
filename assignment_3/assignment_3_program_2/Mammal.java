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
public class Mammal implements animal 
{
    
    int num_of_legs_of_mammal;
    String favorite_food;
    

    public Mammal(int num_of_legs_of_mammal, String favorite_food)
    {
        this.num_of_legs_of_mammal = num_of_legs_of_mammal;
        this.favorite_food = favorite_food;
    }
    
    
    @Override
    public void eat() 
    {
        System.out.println("nuts/roots");
    }

    @Override
    public void travel() 
    {
        System.out.println("car");
    }
    
    public int get_num_of_legs_of_mammal()
    {
     return  num_of_legs_of_mammal;
    }
    
    public String get_favorite_food()
    {
       return favorite_food;
    }
}
