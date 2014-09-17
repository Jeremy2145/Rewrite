package edu.lf.hazmats.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.lf.hazmats.OI;
import edu.lf.hazmats.subsystems.ExampleSubsystem;
import edu.lf.hazmats.subsystems.DriveTrain;
import edu.lf.hazmats.subsystems.Intake;
import edu.lf.hazmats.subsystems.IntakeMotor;
import edu.lf.hazmats.subsystems.Shooter;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
    public static DriveTrain driveTrain = new DriveTrain();
    public static Intake armIntake = new Intake();
    public static IntakeMotor armMotor = new IntakeMotor();
    public static Shooter shooter = new Shooter();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(exampleSubsystem);
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(armIntake);
        SmartDashboard.putData(armMotor);
        SmartDashboard.putData(shooter);
        
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
