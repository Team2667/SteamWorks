package org.usfirst.frc2667.Steamworks.util;

import org.usfirst.frc2667.Steamworks.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DistanceSensor {
	double Vi;
	int port;
	private final AnalogInput rangeFinder;
	
	public DistanceSensor(int port, double conversion){
		Vi = conversion;
		rangeFinder = new AnalogInput(port);
		SmartDashboard.putNumber("Sensor" + port, conversion);
	}
	
	public void setConversionRatio(double ratio) {
		Vi = ratio;
		SmartDashboard.putNumber("Sensor" + port, ratio);
	}
	
	 public double getDistance() {
	    	double Vm = rangeFinder.getVoltage() * 1000;
	    	//double Vi = 4.883;
	    	return 5 * (Vm / SmartDashboard.getNumber("Sensor" + port, Vi));
	    }
}
