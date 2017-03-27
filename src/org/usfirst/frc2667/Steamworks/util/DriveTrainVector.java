package org.usfirst.frc2667.Steamworks.util;

public class DriveTrainVector {
	private double x;
        private double y;

        public DriveTrainVector(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getX(){
            return x;
        }

        public double getY(){
            return y;
        }
        
        public DriveTrainVector mult(double mag){	
        	return new DriveTrainVector((x*mag),(y*mag));
        }
}