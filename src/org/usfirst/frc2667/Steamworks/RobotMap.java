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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainleftFrontCAN;
    public static CANTalon driveTrainleftRearCAN;
    public static CANTalon driveTrainRightFrontCAN;
    public static CANTalon driveTrainRightRearCAN;
    public static RobotDrive driveTrainRobotDriveCAN;
    public static CANTalon shootershooterTalon;
    public static Relay lEDRingspike1;
    public static SpeedController ballCollectorCollectorController;
    public static SpeedController climberLiftMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftFrontCAN = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "leftFrontCAN", driveTrainleftFrontCAN);
        
        driveTrainleftRearCAN = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "leftRearCAN", driveTrainleftRearCAN);
        
        driveTrainRightFrontCAN = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "RightFrontCAN", driveTrainRightFrontCAN);
        
        driveTrainRightRearCAN = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "RightRearCAN", driveTrainRightRearCAN);
        
        driveTrainRobotDriveCAN = new RobotDrive(driveTrainleftFrontCAN, driveTrainleftRearCAN,
              driveTrainRightFrontCAN, driveTrainRightRearCAN);
        
        driveTrainRobotDriveCAN.setSafetyEnabled(false);
        driveTrainRobotDriveCAN.setExpiration(0.1);
        driveTrainRobotDriveCAN.setSensitivity(0.25);
        driveTrainRobotDriveCAN.setMaxOutput(0.5);

        shootershooterTalon = new CANTalon(0);
        LiveWindow.addActuator("Shooter", "shooterTalon", shootershooterTalon);
        
        lEDRingspike1 = new Relay(0);
        LiveWindow.addActuator("LEDRing", "spike1", lEDRingspike1);
        
        ballCollectorCollectorController = new Spark(4);
        LiveWindow.addActuator("BallCollector", "CollectorController", (Spark) ballCollectorCollectorController);
        
        climberLiftMotor = new Spark(0);
        LiveWindow.addActuator("Climber", "LiftMotor", (Spark) climberLiftMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
