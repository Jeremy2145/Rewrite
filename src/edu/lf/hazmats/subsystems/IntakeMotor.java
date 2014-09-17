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
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import edu.lf.hazmats.commands.IntakeOff;

/**
 *
 * @author Nicster34
 */
public class IntakeMotor extends Subsystem{
    Talon intakeMotor = new Talon(3);
    
    public void initDefaultCommand() {
        setDefaultCommand(new IntakeOff());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
    }
     
    
   
    public void intakeDriveFoward (){
        intakeMotor.set(1);
    }
    public void intakeDriveReverse (){
        intakeMotor.set(-1);
    }
    public void intakeDriveStop (){
        intakeMotor.set(0);
    }

}