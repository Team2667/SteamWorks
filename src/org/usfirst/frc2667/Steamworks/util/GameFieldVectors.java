package org.usfirst.frc2667.Steamworks.util;


import java.nio.ByteBuffer;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;



public class GameFieldVectors{

        public enum StartingPosition {FacingAway, FacingTowards, FacingLeft, FacingRight};
    	private DriveTrainVector forwardVector;
        private DriveTrainVector rightVector;

        public GameFieldVectors(int rearDS, int gearSideDS){
        	StartingPosition sp = getStartingPosition(rearDS, gearSideDS);
             if (sp == StartingPosition.FacingAway){
                  forwardVector = new DriveTrainVector (0,1);
                  rightVector = new DriveTrainVector (-1,0);
             } else if (sp == StartingPosition.FacingTowards){
                  forwardVector = new DriveTrainVector (0,-1);
                  rightVector = new DriveTrainVector (1,0);
             } else if (sp == StartingPosition.FacingLeft){
                  forwardVector = new DriveTrainVector (1,0);
                  rightVector = new DriveTrainVector (-1,0);
             }else if (sp == StartingPosition.FacingRight){
                  forwardVector = new DriveTrainVector (-1,0);
                  rightVector = new DriveTrainVector (0,1);
             }
        }

	public DriveTrainVector getForwardVector(double speed)
        {
             return forwardVector.mult(speed);
        }

        public DriveTrainVector getBackwardVector(double speed)
        {
             return forwardVector.mult(-speed);
        }

        public DriveTrainVector getLeftVector(double speed)
        {            
            return rightVector.mult(-speed);
        }

        public DriveTrainVector getRightVector(double speed)
        {            
            return rightVector.mult(speed);
        }

        private StartingPosition getStartingPosition(int rearDS, int gearSideDS){
            return StartingPosition.FacingAway;
        }
}