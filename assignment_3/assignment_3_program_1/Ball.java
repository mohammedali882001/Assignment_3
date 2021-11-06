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
public class Ball implements tossable
{
private String brandName;

    public Ball(String brandName) 
    {
        this.brandName = brandName;
    }

    public String getBrandName() 
    {
        return brandName;
    }
    
    public void bounce()
    {
       System.out.println("حمدي فحي");
    }

    @Override
    public void toss() 
    {
        System.out.println("افشااااااااة");
    }
    
}
