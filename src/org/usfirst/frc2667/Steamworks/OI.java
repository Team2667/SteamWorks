// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2667.Steamworks;

import org.usfirst.frc2667.Steamworks.commands.AlignToPeg;
import org.usfirst.frc2667.Steamworks.commands.AutonomousCommand;
import org.usfirst.frc2667.Steamworks.commands.CollectorReverse;
import org.usfirst.frc2667.Steamworks.commands.Collectorforward;
import org.usfirst.frc2667.Steamworks.commands.DriveStraight;
import org.usfirst.frc2667.Steamworks.commands.DriveToMiddlePeg;
import org.usfirst.frc2667.Steamworks.commands.DriveToPeg;
import org.usfirst.frc2667.Steamworks.commands.LiftDown;
import org.usfirst.frc2667.Steamworks.commands.LiftUp;
import org.usfirst.frc2667.Steamworks.commands.PlaceGearOnLeftPeg;
import org.usfirst.frc2667.Steamworks.commands.PlaceGearOnMiddlePeg;
import org.usfirst.frc2667.Steamworks.commands.PlaceGearOnRightPeg;
import org.usfirst.frc2667.Steamworks.commands.TestVision;
import org.usfirst.frc2667.Steamworks.commands.Turn30Degrees;
import org.usfirst.frc2667.Steamworks.commands.Turn30DegreesClockwise;
import org.usfirst.frc2667.Steamworks.commands.TurnSwitchOff;
import org.usfirst.frc2667.Steamworks.commands.TurnSwitchOn;
import org.usfirst.frc2667.Steamworks.commands.shoot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton shooterbutton;
    public JoystickButton collectorButtonForward;
    public JoystickButton buttonLiftUp;
    public JoystickButton lightSwitch;
    public JoystickButton collectorButtonReverse;
    public JoystickButton buttonLiftDown;
    public JoystickButton driveForwardButton;
    public Joystick logitech;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        logitech = new Joystick(0);
        
        driveForwardButton = new JoystickButton(logitech, 4);
        driveForwardButton.whenPressed(new DriveStraight());
        buttonLiftDown = new JoystickButton(logitech, 9);
        buttonLiftDown.whileHeld(new LiftDown());
        collectorButtonReverse = new JoystickButton(logitech, 8);
        collectorButtonReverse.whileHeld(new CollectorReverse());
        lightSwitch = new JoystickButton(logitech, 3);
        lightSwitch.whileHeld(new TurnSwitchOn());
        buttonLiftUp = new JoystickButton(logitech, 6);
        buttonLiftUp.whileHeld(new LiftUp());
        collectorButtonForward = new JoystickButton(logitech, 7);
        collectorButtonForward.whileHeld(new Collectorforward());
        shooterbutton = new JoystickButton(logitech, 1);
        shooterbutton.whileHeld(new shoot());


        // SmartDashboard Buttons
        SmartDashboard.putData("AlignToPeg", new AlignToPeg());
        SmartDashboard.putData("Turn30Degrees", new Turn30Degrees());
        SmartDashboard.putData("shoot", new shoot());
        SmartDashboard.putData("TurnSwitchOn", new TurnSwitchOn());
        SmartDashboard.putData("TurnSwitchOff", new TurnSwitchOff());
        SmartDashboard.putData("TestVision", new TestVision());
        SmartDashboard.putData("Collectorforward", new Collectorforward());
        SmartDashboard.putData("CollectorReverse", new CollectorReverse());
        SmartDashboard.putData("LiftUp", new LiftUp());
        SmartDashboard.putData("LiftDown", new LiftDown());
        SmartDashboard.putData("DriveStraight", new DriveStraight());
        SmartDashboard.putData("DriveToPeg", new DriveToPeg());
        SmartDashboard.putData("PlaceGearOnLeftPeg", new PlaceGearOnLeftPeg());
        SmartDashboard.putData("PlaceGearOnRightPeg", new PlaceGearOnRightPeg());
        SmartDashboard.putData("PlaceGearOnMiddlePeg", new PlaceGearOnMiddlePeg());
        SmartDashboard.putData("Turn30DegreesClockwise", new Turn30DegreesClockwise());
        SmartDashboard.putData("DriveToMiddlePeg", new DriveToMiddlePeg());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLogitech() {
        return logitech;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

