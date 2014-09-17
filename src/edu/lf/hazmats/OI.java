
package edu.lf.hazmats;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.lf.hazmats.commands.DriveWithController;
import edu.lf.hazmats.commands.ArmExtend;
import edu.lf.hazmats.commands.*;
import edu.wpi.first.wpilibj.GenericHID;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
   Joystick stick = new Joystick(1);
   Joystick chain = new Joystick(2);
   Button aButton = new JoystickButton(stick, 1);
   Button rightButton5 = new JoystickButton(stick, 5);
   Button rightButton6 = new JoystickButton(stick, 6);
   Button rightButton2 = new JoystickButton(stick,2);
   Button rightButton3 = new JoystickButton(stick,3);
   Button rightButton4 = new JoystickButton(stick,4);
   Button leftButton8 = new JoystickButton(chain,8);
  
   
   public OI(){
    aButton.whenPressed(new DriveWithController());
    rightButton5.whenPressed(new ArmRetract());
    rightButton6.whenPressed(new ArmExtend());
    rightButton2.whenPressed(new IntakeOff());
    rightButton3.whenPressed(new IntakeReverse());
    rightButton4.whenPressed(new IntakeFoward());
    leftButton8.whileHeld(new Shoot());
}
   
  public double getLeftSpeed() {
        return stick.getY();
    }
  
    
    /**
     * @return The value of the right joystick. Note: this uses raw axis because
     *         we have a logitech joystick that resembles a PS controller.
     */
    public double getRightSpeed() {
        return stick.getRawAxis(3);
    }
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

