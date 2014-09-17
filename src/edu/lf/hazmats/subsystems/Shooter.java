/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmats.subsystems;

/**
 *
 * @author Owner
 */
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;



/**
 *
 * @author Nicster34
 */
public class Shooter extends Subsystem{
    Solenoid shooter = new Solenoid(8); 
    
    
    
    public void initDefaultCommand() {
         setDefaultCommand(null);
         
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
         
    }
    public void retractTheBall(){
        shooter.set(false);
    }
    public void shotTheBall(){
        shooter.set(true);
    }
    public boolean shooterState(){
        return shooter.get();
    }
}