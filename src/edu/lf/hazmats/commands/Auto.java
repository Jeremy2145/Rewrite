/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmats.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 * @author Owner
 */
public class Auto extends CommandBase{
    Timer autoTime = new Timer();
     public Auto() {
        // Use requires() here to declare subsystem dependencies
        requires(driveTrain);
        requires(armMotor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        driveTrain.gryoReset();
        autoTime.reset();
        autoTime.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       if (autoTime.get() < 7){
       
        driveTrain.roboDrive(-.7, driveTrain.gyroValue()*.05);
        
        SmartDashboard.putDouble("Sonar", driveTrain.ultraValue());
        SmartDashboard.putDouble("Gyro", driveTrain.gyroValue());
        
       }
       else {
        driveTrain.roboDrive(0,0);
        armMotor.intakeDriveFoward();
        
        SmartDashboard.putDouble("Sonar", driveTrain.ultraValue());
        SmartDashboard.putDouble("Gyro", driveTrain.gyroValue());
        SmartDashboard.putDouble("AutoTime", autoTime.get());
       }
        SmartDashboard.putDouble("Sonar", driveTrain.ultraValue());
        SmartDashboard.putDouble("Gyro", driveTrain.gyroValue());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        autoTime.reset();
    }
}
    
