/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmats.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.lf.hazmats.commands.ArmExtend;

/**
 *
 * @author Owner
 */
public class Intake extends Subsystem{
    DoubleSolenoid intakeArm = new DoubleSolenoid(1, 2);
//    Talon intakeMotor = new Talon(RobotMap.intakeDrive3);
    
    
    
    
  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new ArmExtend());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
    }
   public void armForward() {
       intakeArm.set(DoubleSolenoid.Value.kForward);
       
   }
   public void armReverse() {
       intakeArm.set(DoubleSolenoid.Value.kReverse);
   }
   public void armOff() {
       intakeArm.set(DoubleSolenoid.Value.kOff);
   }
   public boolean armGet() {
       return intakeArm.get() == DoubleSolenoid.Value.kForward;
   }
   
}
