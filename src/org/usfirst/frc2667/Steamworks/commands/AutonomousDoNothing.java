package org.usfirst.frc2667.Steamworks.commands;

import org.usfirst.frc2667.Steamworks.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutonomousDoNothing extends Command {

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void initialize(){
		Robot.driveTrain.ensureGyroCalibrated();
	}

}
